package neueduexam.HXBservicelmp;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class TestSituationEntity extends BaseRowModel {
    
		@ExcelProperty(index = 0 , value = "试卷id")
		private Integer pexamid;
		
		@ExcelProperty(index = 1 , value = "考卷id")
	    private Integer testid;
		
		@ExcelProperty(index = 2 , value = "考生id")
	    private Integer stuid;
		
		@ExcelProperty(index = 3 , value = "得分")
	    private Integer score;
		
		@ExcelProperty(index = 4 , value = "考试昵称")
	    private String stunickname;
		
		@ExcelProperty(index = 5 , value = "浏览器")
	    private String browser;
		
		@ExcelProperty(index = 6 , value = "考试ip地址")
	    private String ipaddress;
		
		@ExcelProperty(index = 7 , value = "操作系统")
	    private String operatingsystem;
		
		@ExcelProperty(index = 8 , value = "切出次数")
	    private Integer changeout;
		
		@ExcelProperty(index = 9 , value = "考试用时")
	    private String duration;
		
		@ExcelProperty(index = 10 , value = "批改状态")
	    private String state;
		
		@ExcelProperty(index = 11 , value = "考试时的地理位置")
	    private String local;
		
		@ExcelProperty(index = 12 , value = "考卷名称")
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

		@Override
		public String toString() {
			return "TestSituationEntity [pexamid=" + pexamid + ", testid=" + testid + ", stuid=" + stuid + ", score="
					+ score + ", stunickname=" + stunickname + ", browser=" + browser + ", ipaddress=" + ipaddress
					+ ", operatingsystem=" + operatingsystem + ", changeout=" + changeout + ", duration=" + duration
					+ ", state=" + state + ", local=" + local + ", other1=" + other1 + ", other2=" + other2 + "]";
		}
}
