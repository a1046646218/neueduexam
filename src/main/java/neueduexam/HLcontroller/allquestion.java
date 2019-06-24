package neueduexam.HLcontroller;

import java.util.List;

import neueduexam.entity.personquestion;
import neueduexam.entity.question;

public class allquestion {

	List<question> queslist;
	List<personquestion> perqueslist;
	int totalscore;
	public int getTotalscore() {
		return totalscore;
	}
	public void setTotalscore(int totalscore) {
		this.totalscore = totalscore;
	}
	public List<question> getQueslist() {
		return queslist;
	}
	public void setQueslist(List<question> queslist) {
		this.queslist = queslist;
	}
	public List<personquestion> getPerqueslist() {
		return perqueslist;
	}
	public void setPerqueslist(List<personquestion> perqueslist) {
		this.perqueslist = perqueslist;
	}
}
