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
	
}
