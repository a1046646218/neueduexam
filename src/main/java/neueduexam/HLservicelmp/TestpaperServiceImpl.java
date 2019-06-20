package neueduexam.HLservicelmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.HLservice.TestpaperService;
import neueduexam.dao.testpaperMapper;
import neueduexam.entity.testpaper;

@Service
public class TestpaperServiceImpl implements TestpaperService {

	@Autowired
	testpaperMapper testpapermapper;
	
	@Override
	public testpaper selectByPrimaryKey(Integer testid) {
		testpaper testpaper=testpapermapper.selectByPrimaryKey(testid);
		return testpaper;
	}

}
