package neueduexam.HXBcontroller;

import java.util.List;


public class ExamData {
	
	//@RequestParam("libId[]") List<Integer> libIds,@RequestParam("scores[]") List<Integer>scores,
	//@RequestParam("quesNums[]") List<Integer>quesNums,String testName,String testType,String testProfile
	private Integer userId;
	private List<Integer> libIds;
	private List<Integer> scores;
	private List<Integer> quesNums;
	private String testName;
	private String testType;
	private String testProfile;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<Integer> getLibIds() {
		return libIds;
	}
	public void setLibIds(List<Integer> libIds) {
		this.libIds = libIds;
	}
	public List<Integer> getScores() {
		return scores;
	}
	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}
	public List<Integer> getQuesNums() {
		return quesNums;
	}
	public void setQuesNum(List<Integer> quesNums) {
		this.quesNums = quesNums;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getTestProfile() {
		return testProfile;
	}
	public void setTestProfile(String testProfile) {
		this.testProfile = testProfile;
	}
	@Override
	public String toString() {
		return "ExamData [userId=" + userId + ", libIds=" + libIds + ", scores=" + scores + ", quesNums=" + quesNums
				+ ", testName=" + testName + ", testType=" + testType + ", testProfile=" + testProfile + "]";
	}
	
}
