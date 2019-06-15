package neueduexam.entity;

public class userhavelib {
    private Integer userid;

    private Integer libid;

    private String other1;

    private String other2;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getLibid() {
        return libid;
    }

    public void setLibid(Integer libid) {
        this.libid = libid;
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