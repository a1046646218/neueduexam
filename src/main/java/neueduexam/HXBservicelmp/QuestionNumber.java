package neueduexam.HXBservicelmp;

public class QuestionNumber {
	
	private Integer numOfSingle =0;
	private Integer numOfMultiple=0;
	private Integer numOfJudge=0;
	private Integer numOfBlank=0;
	private Integer numOfAnswer=0;
	
	public Integer getNumOfSingle() {
		return numOfSingle;
	}
	public void setNumOfSingle(Integer numOfSingle) {
		this.numOfSingle = numOfSingle;
	}
	public Integer getNumOfMultiple() {
		return numOfMultiple;
	}
	public void setNumOfMultiple(Integer numOfMultiple) {
		this.numOfMultiple = numOfMultiple;
	}
	public Integer getNumOfJudge() {
		return numOfJudge;
	}
	public void setNumOfJudge(Integer numOfJudge) {
		this.numOfJudge = numOfJudge;
	}
	public Integer getNumOfBlank() {
		return numOfBlank;
	}
	public void setNumOfBlank(Integer numOfBlank) {
		this.numOfBlank = numOfBlank;
	}
	public Integer getNumOfAnswer() {
		return numOfAnswer;
	}
	public void setNumOfAnswer(Integer numOfAnswer) {
		this.numOfAnswer = numOfAnswer;
	}
	public void addNumOfSingle(Integer numofsingle2) {
		this.numOfSingle += numofsingle2;
		
	}
	public void addNumOfMultiple(Integer numofmultiple2) {
		this.numOfMultiple +=numofmultiple2;
		
	}
	public void addNumOfJudge(Integer numofjudge2) {
		this.numOfJudge +=numofjudge2;
		
	}
	public void addNumOfBlank(Integer numofblank2) {
		this.numOfBlank += numofblank2;
	}
	public void addNumOfAnswer(Integer numofanswer2) {
		this.numOfAnswer += numofanswer2;
		
	}
	@Override
	public String toString() {
		return "QuestionNumber [numOfSingle=" + numOfSingle + ", numOfMultiple=" + numOfMultiple + ", numOfJudge="
				+ numOfJudge + ", numOfBlank=" + numOfBlank + ", numOfAnswer=" + numOfAnswer + "]";
	}
}
