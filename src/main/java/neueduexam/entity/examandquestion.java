package neueduexam.entity;

public class examandquestion {
    private Integer examid;

    private Integer quesid;

    private Integer quesscore;

    private String other1;

    private String other2;

    public Integer getExamid() {
        return examid;
    }

    public void setExamid(Integer examid) {
        this.examid = examid;
    }

    public Integer getQuesid() {
        return quesid;
    }

    public void setQuesid(Integer quesid) {
        this.quesid = quesid;
    }

    public Integer getQuesscore() {
        return quesscore;
    }

    public void setQuesscore(Integer quesscore) {
        this.quesscore = quesscore;
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