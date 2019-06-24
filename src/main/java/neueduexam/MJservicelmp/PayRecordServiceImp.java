package neueduexam.MJservicelmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.MJservice.PayRecordService;
import neueduexam.dao.recordMapper;
import neueduexam.entity.record;
import neueduexam.entity.recordExample;
import neueduexam.entity.recordExample.Criteria;

@Service
public class PayRecordServiceImp implements PayRecordService{
	@Autowired
	recordMapper recordmapper;
	
	
	@Override
	public List<record> selectByBuyerandSeller(int userid) {
		recordExample e = new recordExample();
		Criteria cc = e.createCriteria();
		cc.andBuyeridEqualTo(userid);
		List<record> list = recordmapper.selectByExample(e);
		
		recordExample e1 = new recordExample();
		Criteria cc1 = e.createCriteria();
		cc1.andSelleridEqualTo(userid);
		List<record> list2 = recordmapper.selectByExample(e1);
		
		for(int i=0;i<list2.size();i++) {
			list.add(list2.get(i));
		}
		return list;
	}

}
