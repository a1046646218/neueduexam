package neueduexam.uploadcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import neueduexam.excelapi.*;

@Controller
public class ExcelController {

	@RequestMapping("/toexceltest")
	public String test1(){
		return "exceltest";
	}
	
	@RequestMapping("/importexcel")
    @ResponseBody
    public Object test2(@RequestParam("file") MultipartFile file,HttpServletRequest request) {
        
		List<Object> list = ExcelUtil.readExcel(file, new PersonDTO());
		
		for (Object o : list) {
			System.out.println(o.toString());
		}
		
		return "exceltest-import-success";
    }
	
    /**
     * 导出 Excel（一个 sheet）
     */
    @RequestMapping("/exportexcel")
    public void test3(HttpServletResponse response) throws IOException {
        List<PersonDTO> list = getList();//模拟从数据库中得到一个数据集合
        String fileName = "export01";
        String sheetName = "sheet01";

        ExcelUtil.writeExcel(response, list, fileName, sheetName, new PersonDTO());
    }
	

    private List<PersonDTO> getList() {
        List<PersonDTO> list = new ArrayList<>();
        PersonDTO model1 = new PersonDTO();
        model1.setName("昆凌");
        model1.setEmail("123456789@gmail.com");
        list.add(model1);
        PersonDTO model2 = new PersonDTO();
        model2.setName("周杰伦");
        model2.setEmail("198752233@gmail.com");
        list.add(model2);
        return list;
    }
}
