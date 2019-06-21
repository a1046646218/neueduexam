package neueduexam.HXBservicelmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.HXBservice.CreateExamPaperService;
import neueduexam.dao.*;

@Service
public class CreateExamPaperServiceImpl implements CreateExamPaperService {
	
	@Autowired
	questionandlibMapper questionandlibMapper;
	@Autowired
	questionMapper questionMapper;
	
	@Override
	public String createExamPaper(List<Integer> libIds, List<Integer> scores, List<Integer> quesNums) {
		List<Integer> quesIdList = new ArrayList<Integer>();
		//查询所有的题目id
		for(int libId : libIds) {
			List<Integer> list = questionandlibMapper.selectquesIdByLibId(libId);
			for(int i:list) {
				System.out.println(i);
				quesIdList.add(i);
			}
		}
		//将题目分类
//		List<Integer> singleList = new ArrayList<Integer>();
//		List<Integer> multipleList = new ArrayList<Integer>();
//		List<Integer> judeList = new ArrayList<Integer>();
//		List<Integer> blankList = new ArrayList<Integer>();
//		List<Integer> answerList = new ArrayList<Integer>();
//		
//		for(int quesId:quesIdList) {
//			
//		}
		
		return "Ok";
	}

	
	
}
