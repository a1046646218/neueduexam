package neueduexam.entity;

public class questionlib {
    private Integer libid;

    private String libname;

    private String libtype;

    private Integer libprice;

    private Integer userid;

    private String nickname;

    private Integer quesamount;

    private String libprofile;

    private Integer numofpurchases;

    private Integer numofsingle;

    private Integer numofmultiple;

    private Integer numofjudge;

    private Integer numofblank;

    private Integer numofanswer;

    private String publishtime;

    private String other1;

    private String other2;

    public Integer getLibid() {
        return libid;
    }

    public void setLibid(Integer libid) {
        this.libid = libid;
    }

    public String getLibname() {
        return libname;
    }

    public void setLibname(String libname) {
        this.libname = libname == null ? null : libname.trim();
    }

    public String getLibtype() {
        return libtype;
    }

    public void setLibtype(String libtype) {
        this.libtype = libtype == null ? null : libtype.trim();
    }

    public Integer getLibprice() {
        return libprice;
    }

    public void setLibprice(Integer libprice) {
        this.libprice = libprice;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getQuesamount() {
        return quesamount;
    }

    public void setQuesamount(Integer quesamount) {
        this.quesamount = quesamount;
    }

    public String getLibprofile() {
        return libprofile;
    }

    public void setLibprofile(String libprofile) {
        this.libprofile = libprofile == null ? null : libprofile.trim();
    }

    public Integer getNumofpurchases() {
        return numofpurchases;
    }

    public void setNumofpurchases(Integer numofpurchases) {
        this.numofpurchases = numofpurchases;
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

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime == null ? null : publishtime.trim();
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