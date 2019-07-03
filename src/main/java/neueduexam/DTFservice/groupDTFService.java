package neueduexam.DTFservice;

import java.util.List;

import neueduexam.entity.groupanduser;
import neueduexam.entity.mygroup;
import neueduexam.entity.user;

public interface groupDTFService {
	public List<mygroup> getMygrouplistbyID(int userid);
	public List<mygroup> getaddgrouplistbyID(int userid);
	public List<groupanduser> getgroupuserlistbyID(int groupid);
	public int ismygroup(int userid,int groupid);
	public int creategroup(user u,String name,String profile);
	public int inviteruser(user u,int groupid);
	public int changeuserimg(user u);
}
