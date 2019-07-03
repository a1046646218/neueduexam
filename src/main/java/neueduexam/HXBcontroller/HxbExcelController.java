package neueduexam.HXBcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import neueduexam.HXBservice.TestSituationService;
import neueduexam.HXBservicelmp.TestSituationEntity;
import neueduexam.excelapi.ExcelUtil;
import neueduexam.excelapi.PersonDTO;

@Controller
public class HxbExcelController {
	
	@Autowired
	TestSituationService testSituationService;

    /**
     * 导出 Excel（一个 sheet）
     */
    @RequestMapping("/writeHxbExcel")
    public void test3(HttpServletResponse response,HttpServletRequest request) throws IOException {
    	//测试
        List<TestSituationEntity> list = testSituationService.MakeTestSituationExcelByTestId("1");
        String fileName = "export01";
        String sheetName = "sheet01";

        ExcelUtil.writeExcel(response, list, fileName, sheetName, new TestSituationEntity());
    }
    
    /**
     * 导出 Excel（一个 sheet）
     */
    @RequestMapping("/exportexcel1")
    public void test4(HttpServletResponse response) throws IOException {
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
