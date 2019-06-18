package neueduexam.HXBservicelmp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import neueduexam.HXBservice.TestPaperService;
import neueduexam.dao.testpaperMapper;
import neueduexam.entity.testpaper;
import neueduexam.entity.testpaperExample;
import neueduexam.entity.testpaperExample.Criteria;


public class TestPaperServiceImpl implements TestPaperService{
	
	@Autowired
	testpaperMapper testpapermapper;
	
	@Override
	public String getTestNameByTestId(String testId) {
		
		// TODO Auto-generated method stub
		testpaperExample testPaperExample = new testpaperExample();
		Criteria criteria = testPaperExample.createCriteria();
		int id = Integer.parseInt(testId);
		criteria.andTestidEqualTo(id);
		
		List<testpaper> list = testpapermapper.selectByExample(testPaperExample);
		String testName = null;
		for(testpaper t : list)
			testName = t.getTestname();
		return testName;
	}


}
