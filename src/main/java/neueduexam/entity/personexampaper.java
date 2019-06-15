package neueduexam.entity;

public class personexampaper {
    private Integer pexamid;

    private Integer testid;

    private Integer stuid;

    private Integer score;

    private String stunickname;

    private String browser;

    private String ipaddress;

    private String operatingsystem;

    private Integer changeout;

    private String duration;

    private String state;

    private String local;

    private String other1;

    private String other2;

    public Integer getPexamid() {
        return pexamid;
    }

    public void setPexamid(Integer pexamid) {
        this.pexamid = pexamid;
    }

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getStunickname() {
        return stunickname;
    }

    public void setStunickname(String stunickname) {
        this.stunickname = stunickname == null ? null : stunickname.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public String getOperatingsystem() {
        return operatingsystem;
    }

    public void setOperatingsystem(String operatingsystem) {
        this.operatingsystem = operatingsystem == null ? null : operatingsystem.trim();
    }

    public Integer getChangeout() {
        return changeout;
    }

    public void setChangeout(Integer changeout) {
        this.changeout = changeout;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local == null ? null : local.trim();
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