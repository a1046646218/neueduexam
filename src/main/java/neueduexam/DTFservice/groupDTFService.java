package neueduexam.DTFservice;

import java.util.List;

import neueduexam.entity.groupanduser;
import neueduexam.entity.mygroup;

public interface groupDTFService {
	public List<mygroup> getMygrouplistbyID(int userid);
	public List<mygroup> getaddgrouplistbyID(int userid);
	public List<groupanduser> getgroupuserlistbyID(int groupid);
}
