package neueduexam.DTFcontroller;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
/**
 * 要操作excel的实体类
 * @ExcelProperty 注解表示该注解定义的属性,可以读写excel表
 * @author lgp
 *
 */

public class InviteStudent extends BaseRowModel{
	/** 姓名 **/
    @ExcelProperty(index = 0 , value = "电话")
    private String phonenum;
     
    
	public InviteStudent(String phonenum) {
		super();
		this.phonenum = phonenum;
	}

	public InviteStudent() {
		super();
	}   

	public String getphonenum() {
		return phonenum;
	}

	public void setphonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	@Override
	public String toString() {
		return "InviteStudent [phonenum=" + phonenum +"]";
	}
    
}
