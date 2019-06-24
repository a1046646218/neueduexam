package neueduexam.HXBservicelmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import neueduexam.HXBservice.TestSituationService;
import neueduexam.dao.personexampaperMapper;
import neueduexam.dao.userMapper;
import neueduexam.entity.personexampaper;
import neueduexam.entity.personexampaperExample;

@Service
public class TestSituationServiceImpl implements TestSituationService {
	
	@Autowired
	personexampaperMapper personexampaperMapper;
	@Autowired
	userMapper userMapper;
	
	@Override
	public String selectTestSituationByTestId(String testId) {
		
		int i_testId = Integer.parseInt(testId);
		
		TestSituation t  = new TestSituation();
		
		personexampaperExample pE = new personexampaperExample();
		pE.createCriteria().andTestidEqualTo(i_testId);
		List<personexampaper> list = personexampaperMapper.selectByExample(pE);
		
		t.setTestName(list.get(0).getOther1());
		t.setData(list);
		
		String json = JSON.toJSONString(t);
		System.out.println(json);
		
		return json;
		
	}

	@Override
	public List<TestSituationEntity> MakeTestSituationExcelByTestId(String testId) {
		int i_testId = Integer.parseInt(testId);
		
		personexampaperExample pE = new personexampaperExample();
		pE.createCriteria().andTestidEqualTo(i_testId);
		List<TestSituationEntity>  list = personexampaperMapper.makeExcelByTestId(pE);
		for(TestSituationEntity t:list)
			System.out.println(t.toString());

		return list;
	}

}
