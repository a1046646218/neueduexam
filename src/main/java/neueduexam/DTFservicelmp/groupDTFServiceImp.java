package neueduexam.DTFservicelmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.groupDTFService;
import neueduexam.dao.mygroupMapper;
import neueduexam.dao.groupanduserMapper;
import neueduexam.entity.mygroup;
import neueduexam.entity.mygroupExample;
import neueduexam.entity.groupanduser;
import neueduexam.entity.groupanduserExample;
import neueduexam.entity.mygroupExample.Criteria;
import neueduexam.entity.user;

@Service
public class groupDTFServiceImp implements groupDTFService{
	
	@Autowired
	mygroupMapper mygroupmapper; 
	@Autowired
	groupanduserMapper groupandusermapper;
	
	@Override
	public List<mygroup> getMygrouplistbyID(int userid) {
		mygroupExample e = new mygroupExample();
		Criteria cc = e.createCriteria();
		cc.andUseridEqualTo(userid);
		List<mygroup> list = mygroupmapper.selectByExample(e);
		return list;
	}

	@Override
	public List<mygroup> getaddgrouplistbyID(int userid) {
		groupanduserExample e = new groupanduserExample();
		neueduexam.entity.groupanduserExample.Criteria cc = e.createCriteria();
		cc.andUseridEqualTo(userid);
		List<groupanduser> alllist = groupandusermapper.selectByExample(e);
		mygroupExample e2 = new mygroupExample();
		Criteria cc2 = e2.createCriteria();
		cc2.andUseridEqualTo(userid);
		List<mygroup> list = mygroupmapper.selectByExample(e2);
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<alllist.size();i++) {
			map.put(alllist.get(i).getGroupid(), 1);
		}
		for(int i=0;i<list.size();i++) {
			map.remove(list.get(i).getGroupid());
		}
		List<mygroup> resultlist = new ArrayList<>();
		for(int key:map.keySet()){
			resultlist.add(mygroupmapper.selectByPrimaryKey(key));
        }
		return resultlist;
	}

	@Override
	public List<groupanduser> getgroupuserlistbyID(int groupid) {
		groupanduserExample e = new groupanduserExample();
		neueduexam.entity.groupanduserExample.Criteria cc = e.createCriteria();
		cc.andGroupidEqualTo(groupid);
		List<groupanduser> alllist = groupandusermapper.selectByExample(e);
		return alllist;
	}

	@Override
	public int ismygroup(int userid, int groupid) {
		mygroup group = mygroupmapper.selectByPrimaryKey(groupid);
		if(userid==group.getUserid()) {
			return 1;
		}
		return 0;
	}

	@Override
	public int creategroup(user u, String name, String profile) {
		mygroup g = new mygroup();
		g.setGroupname(name);
		g.setGroupprofile(profile);
		g.setNickname(u.getNickname());
		g.setUserid(u.getUserid());
		int i = mygroupmapper.insertandgetkey(g);
		groupanduser gu = new groupanduser();
		gu.setGroupid(g.getGroupid());
		gu.setNickname(u.getNickname());
		gu.setUserid(u.getUserid());
		gu.setUserimage(u.getHeadphoto());
		int t = groupandusermapper.insert(gu);
		return t;
	}

	@Override
	public int inviteruser(user u, int groupid) {
		groupanduserExample e = new groupanduserExample();
		neueduexam.entity.groupanduserExample.Criteria cc = e.createCriteria();
		cc.andGroupidEqualTo(groupid);
		cc.andUseridEqualTo(u.getUserid());
		List<groupanduser> li = groupandusermapper.selectByExample(e);
		if(li.size()!=0) {
			return 2;
		}
		groupanduser gu = new groupanduser();
		gu.setGroupid(groupid);
		gu.setNickname(u.getNickname());
		gu.setUserid(u.getUserid());
		gu.setUserimage(u.getHeadphoto());
		int i = groupandusermapper.insert(gu);
		return i;
	}

	@Override
	public int changeuserimg(user u) {
		groupanduserExample e = new groupanduserExample();
		neueduexam.entity.groupanduserExample.Criteria cc = e.createCriteria();
		cc.andUseridEqualTo(u.getUserid());
		groupanduser gu = new groupanduser();
		gu.setUserimage(u.getHeadphoto());
		groupandusermapper.updateByExampleSelective(gu, e);
		return 1;
	}

	
}
