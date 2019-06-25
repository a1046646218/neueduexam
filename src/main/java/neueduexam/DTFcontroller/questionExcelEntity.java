package neueduexam.DTFcontroller;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class questionExcelEntity extends BaseRowModel{
	

	@ExcelProperty(index = 0 , value = "题目类型")
    private String questype;
	@ExcelProperty(index = 1 , value = "题目内容")
    private String quescontext;
	@ExcelProperty(index = 2 , value = "A")
    private String a;
	@ExcelProperty(index = 3 , value = "B")
    private String b;
	@ExcelProperty(index = 4 , value = "C")
    private String c;
	@ExcelProperty(index = 5 , value = "D")
    private String d;
	@ExcelProperty(index = 6 , value = "答案")
    private String quesanswer;
	@ExcelProperty(index = 7 , value = "难度")
    private String difficulty;
	@ExcelProperty(index = 8 , value = "标签")
    private String tag;
	@ExcelProperty(index = 9 , value = "分析")
    private String analysis;


	@Override
	public String toString() {
		return "questionExcelEntity [questype=" + questype + ", quescontext=" + quescontext + ", a=" + a + ", b=" + b
				+ ", c=" + c + ", d=" + d + ", quesanswer=" + quesanswer + ", difficulty=" + difficulty + ", tag=" + tag
				+ ", analysis=" + analysis + "]";
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
}
