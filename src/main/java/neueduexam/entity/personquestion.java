package neueduexam.entity;

public class personquestion {
    private Integer perquesid;

    private Integer pexamid;

    private Integer quesid;

    private Integer studentid;

    private String stuanswer;

    private Integer stuscore;

    private String perquesstate;

    private Integer perquesscore;

    private String other1;

    private String other2;

    public Integer getPerquesid() {
        return perquesid;
    }

    public void setPerquesid(Integer perquesid) {
        this.perquesid = perquesid;
    }

    public Integer getPexamid() {
        return pexamid;
    }

    public void setPexamid(Integer pexamid) {
        this.pexamid = pexamid;
    }

    public Integer getQuesid() {
        return quesid;
    }

    public void setQuesid(Integer quesid) {
        this.quesid = quesid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStuanswer() {
        return stuanswer;
    }

    public void setStuanswer(String stuanswer) {
        this.stuanswer = stuanswer == null ? null : stuanswer.trim();
    }

    public Integer getStuscore() {
        return stuscore;
    }

    public void setStuscore(Integer stuscore) {
        this.stuscore = stuscore;
    }

    public String getPerquesstate() {
        return perquesstate;
    }

    public void setPerquesstate(String perquesstate) {
        this.perquesstate = perquesstate == null ? null : perquesstate.trim();
    }

    public Integer getPerquesscore() {
        return perquesscore;
    }

    public void setPerquesscore(Integer perquesscore) {
        this.perquesscore = perquesscore;
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