package neueduexam.entity;

public class question {
    private Integer quesid;

    private String questype;

    private String quescontext;

    private String a;

    private String b;

    private String c;

    private String d;

    private String quesanswer;

    private String difficulty;

    private String tag;

    private String analysis;

    private String other1;

    private String other2;

    public Integer getQuesid() {
        return quesid;
    }

    public void setQuesid(Integer quesid) {
        this.quesid = quesid;
    }

    public String getQuestype() {
        return questype;
    }

    public void setQuestype(String questype) {
        this.questype = questype == null ? null : questype.trim();
    }

    public String getQuescontext() {
        return quescontext;
    }

    public void setQuescontext(String quescontext) {
        this.quescontext = quescontext == null ? null : quescontext.trim();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b == null ? null : b.trim();
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c == null ? null : c.trim();
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d == null ? null : d.trim();
    }

    public String getQuesanswer() {
        return quesanswer;
    }

    public void setQuesanswer(String quesanswer) {
        this.quesanswer = quesanswer == null ? null : quesanswer.trim();
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty == null ? null : difficulty.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
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