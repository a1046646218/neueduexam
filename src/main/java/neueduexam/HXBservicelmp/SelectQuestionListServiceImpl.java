package neueduexam.HXBservicelmp;


import alex.zhrenjie04.wordfilter2.WordFilterUtil;
import alex.zhrenjie04.wordfilter2.result.FilteredResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import neueduexam.HXBservice.SelectQuestionListService;
import neueduexam.entity.question;
import neueduexam.entity.questionExample;
import neueduexam.entity.questionandlib;
import neueduexam.entity.questionandlibExample;
import neueduexam.dao.questionandlibMapper;
import neueduexam.dao.questionMapper;
@Service
public class SelectQuestionListServiceImpl implements SelectQuestionListService{

	@Autowired
	questionandlibMapper questionandlibMapper;
	@Autowired
	questionMapper questionMapper;
	
	
	@Override
	//根据libId和quesType找出所有符合条件的题目
	public String getQuestionList(int libId,String quesType) {
		questionandlibExample qE = new questionandlibExample();
		qE.createCriteria().andLibidEqualTo(libId);
		List<questionandlib> list = questionandlibMapper.selectByExample(qE);
		List<question> list2 = new ArrayList<question>();
		for(questionandlib q: list) {
			question ques = questionMapper.selectByQuesIdAndQuesType(q.getQuesid(),quesType);
			if(ques!=null) {
				ques.setOther1("zhanwei");
				ques.setOther2("zhanwei");
				list2.add(ques);
			}
		}

		Map<String,Object> map2 = new HashMap<String,Object>();
		map2.put("data", list2);
		String jsonString = JSON.toJSONString(map2);
		
		return jsonString;
	}

	//找出所有有敏感词的题目
	@Override
	public String selectIllegalQuestionList() {
		questionExample qE = new questionExample();
		qE.createCriteria().andQuesidIsNotNull();
		List<question> list = questionMapper.selectByExample(qE);
		List<IllegalQuestion> list2 = new ArrayList<IllegalQuestion>();
		for(question q :list) {
			FilteredResult res = WordFilterUtil.filterText(q.getQuescontext(), '*');
			if(res.getLevel()!=0) {
//				System.out.println(res.getBadWords());
//				System.out.println(res.getOriginalContent());
//				System.out.println(res.getFilteredContent());
				IllegalQuestion iq = new IllegalQuestion();
				iq.setQuesId(q.getQuesid());
				String type = null;
				switch(q.getQuestype()) {
				case "0":
					type = "单选题";break;
				case "1":
					type = "多选题";break;
				case "2":
					type ="判断题";break;
				case "3":
					type = "填空题";break;
				case "4":
					type="简答题";break;
				}
				iq.setQuesType(type);
				iq.setDifficulty(q.getDifficulty());
				iq.setMinganci(res.getBadWords());
				iq.setQuesContext(q.getQuescontext());
				list2.add(iq);
			}
		}
		HashMap<String,Object> map = new  HashMap<>();
		map.put("data", list2);
		return JSON.toJSONString(map);
	}

}

class IllegalQuestion{
	private Integer quesId;
	private String quesType;
	private String quesContext;
	private String difficulty;
	private String minganci;
	public Integer getQuesId() {
		return quesId;
	}
	public void setQuesId(Integer quesId) {
		this.quesId = quesId;
	}
	public String getQuesType() {
		return quesType;
	}
	public void setQuesType(String quesType) {
		this.quesType = quesType;
	}
	public String getQuesContext() {
		return quesContext;
	}
	public void setQuesContext(String quesContext) {
		this.quesContext = quesContext;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getMinganci() {
		return minganci;
	}
	public void setMinganci(String minganci) {
		this.minganci = minganci;
	}

	@Override
	public String toString() {
		return "IllegalQuestion [quesId=" + quesId + ", quesType=" + quesType + ", quesContext=" + quesContext
				+ ", difficulty=" + difficulty + ", minganci=" + minganci  + "]";
	}
}
