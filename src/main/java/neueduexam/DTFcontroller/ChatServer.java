package neueduexam.DTFcontroller;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Component;

import net.sf.json.JSONObject;

@ServerEndpoint("/websocket")
@Component
public class ChatServer {

	private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//private static Vector<Session> room = new Vector<Session>();
	private static HashMap<Integer,Vector<Session>> rooms = new HashMap<>();
	
	
	public static int getRoomid(Session session) {
		URI uri = session.getRequestURI();
		String url = uri.toString();
		System.out.println(url);
		String str = url.split("=")[1];
		System.out.println(str);
		return Integer.parseInt(str);
	}
	
	@OnOpen
	public void onOpen(Session session){
		int roomid = getRoomid(session);
		if(rooms.containsKey(roomid)) {
			rooms.get(roomid).addElement(session);
		}else {
			rooms.put(roomid, new Vector<Session>());
		}
	}
	
	@OnMessage
	public void onMessage(String message,Session session){
		int roomid = getRoomid(session);
		
		JSONObject obj = JSONObject.fromObject(message);
		obj.put("date", df.format(new Date()));
		
		for(Session se : rooms.get(roomid)){
			obj.put("isSelf", se.equals(session));
			se.getAsyncRemote().sendText(obj.toString());
		}
	}
	
	@OnClose
	public void onClose(Session session){
		int roomid = getRoomid(session);
		rooms.get(roomid).remove(session);
	}
	
	@OnError
	public void onError(Throwable t){
		
	}
}
