package neueduexam.entity;

public class testpaper {
    private Integer testid;

    private Integer examid;

    private Integer userid;

    private String testname;

    private String publishdate;

    private Integer limitchanges;

    private Integer countdown;

    private String other1;

    private String other2;

    @Override
	public String toString() {
		return "testpaper [testid=" + testid + ", examid=" + examid + ", userid=" + userid + ", testname=" + testname
				+ ", publishdate=" + publishdate + ", limitchanges=" + limitchanges + ", countdown=" + countdown
				+ ", other1=" + other1 + ", other2=" + other2 + "]";
	}

	public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public Integer getExamid() {
        return examid;
    }

    public void setExamid(Integer examid) {
        this.examid = examid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname == null ? null : testname.trim();
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate == null ? null : publishdate.trim();
    }

    public Integer getLimitchanges() {
        return limitchanges;
    }

    public void setLimitchanges(Integer limitchanges) {
        this.limitchanges = limitchanges;
    }

    public Integer getCountdown() {
        return countdown;
    }

    public void setCountdown(Integer countdown) {
        this.countdown = countdown;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }
}