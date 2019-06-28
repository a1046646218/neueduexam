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

	@Override
	public String selectNumOfTestStateByTestId(int testId) {
		personexampaperExample pE = new personexampaperExample();
		pE.createCriteria().andTestidEqualTo(testId);
		List<personexampaper> list = personexampaperMapper.selectByExample(pE);
		 int no = 0;
		 int yes = 0;
		 for(personexampaper p:list) {
			 if(p.getState().equals("已评分"))
				 yes++;
			 else
				 no++;
		 }
		 String JSONString = "{\"e1\":"+no+",\"e2\":"+yes+"}";
		 return JSONString;
	}

	@Override
	public String selectNumOfScoreByTestId(int testId) {
		personexampaperExample pE = new personexampaperExample();
		pE.createCriteria().andTestidEqualTo(testId);
		List<personexampaper> list = personexampaperMapper.selectByExample(pE);

		int e1 =0,e2=0,e3=0,e4=0,e5=0;//不及格 60~70 71~80 81~90 91~100
		
		 for(personexampaper p:list) {
			 int score = p.getScore();
			 if(score<60) 
				 e1++;
			 else if(score>=60&&score<=70)
				 e2++;
			 else if(score>=71&&score<=80)
				 e3++;
			 else if(score>=81&&score<=90)
				 e4++;
			 else 
				 e5++;
		 }
		String jsonString = "{\"e1\":"+e1+",\"e2\":"+e2+",\"e3\":"+e3+",\"e4\":"+e4+",\"e5\":"+e5+"}";
		return jsonString;
	}

}
