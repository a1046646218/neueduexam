package neueduexam.entity;

public class homework {
    private Integer hwid;

    private String content;

    private Integer groupid;

    private String hwdate;

    private String other1;

    private String other2;

    public Integer getHwid() {
        return hwid;
    }

    public void setHwid(Integer hwid) {
        this.hwid = hwid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getHwdate() {
        return hwdate;
    }

    public void setHwdate(String hwdate) {
        this.hwdate = hwdate == null ? null : hwdate.trim();
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