package neueduexam.entity;

public class invitation {
    private Integer testid;

    private String invitationtime;

    private Integer studentid;

    private Integer stuphone;

    private String state;

    private String invitecode;

    private String other1;

    private String ohter2;

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public String getInvitationtime() {
        return invitationtime;
    }

    public void setInvitationtime(String invitationtime) {
        this.invitationtime = invitationtime == null ? null : invitationtime.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getStuphone() {
        return stuphone;
    }

    public void setStuphone(Integer stuphone) {
        this.stuphone = stuphone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode == null ? null : invitecode.trim();
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    public String getOhter2() {
        return ohter2;
    }

    public void setOhter2(String ohter2) {
        this.ohter2 = ohter2 == null ? null : ohter2.trim();
    }
}