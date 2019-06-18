package neueduexam.HXBservice;

import java.util.List;

public class InvitationModule {
	
	private String testName ;
	private List<InvitationPeople> data;
	
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public List<InvitationPeople> getData() {
		return data;
	}
	public void setData(List<InvitationPeople> data) {
		this.data = data;
	}
}
