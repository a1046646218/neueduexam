package neueduexam.entity;

public class exampaper {
    private Integer examid;

    private String examname;

    private String examtype;

    private String examprofile;

    private Integer euserid;

    private String enickname;

    private Integer numofquestions;

    private Integer numofsingle;

    private Integer numofmultiple;

    private Integer numofjudge;

    private Integer numofblank;

    private Integer numofanswer;

    private String other1;

    private String other2;

    public Integer getExamid() {
        return examid;
    }

    public void setExamid(Integer examid) {
        this.examid = examid;
    }

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname == null ? null : examname.trim();
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype == null ? null : examtype.trim();
    }

    public String getExamprofile() {
        return examprofile;
    }

    public void setExamprofile(String examprofile) {
        this.examprofile = examprofile == null ? null : examprofile.trim();
    }

    public Integer getEuserid() {
        return euserid;
    }

    public void setEuserid(Integer euserid) {
        this.euserid = euserid;
    }

    public String getEnickname() {
        return enickname;
    }

    public void setEnickname(String enickname) {
        this.enickname = enickname == null ? null : enickname.trim();
    }

    public Integer getNumofquestions() {
        return numofquestions;
    }

    public void setNumofquestions(Integer numofquestions) {
        this.numofquestions = numofquestions;
    }

    public Integer getNumofsingle() {
        return numofsingle;
    }

    public void setNumofsingle(Integer numofsingle) {
        this.numofsingle = numofsingle;
    }

    public Integer getNumofmultiple() {
        return numofmultiple;
    }

    public void setNumofmultiple(Integer numofmultiple) {
        this.numofmultiple = numofmultiple;
    }

    public Integer getNumofjudge() {
        return numofjudge;
    }

    public void setNumofjudge(Integer numofjudge) {
        this.numofjudge = numofjudge;
    }

    public Integer getNumofblank() {
        return numofblank;
    }

    public void setNumofblank(Integer numofblank) {
        this.numofblank = numofblank;
    }

    public Integer getNumofanswer() {
        return numofanswer;
    }

    public void setNumofanswer(Integer numofanswer) {
        this.numofanswer = numofanswer;
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