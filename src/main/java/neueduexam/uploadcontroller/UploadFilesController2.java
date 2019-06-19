package neueduexam.uploadcontroller;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UploadFilesController2 {

	@GetMapping("/touploadfiles")
	public String multiUpload() {
	    return "uploadfiles";
	}

	@PostMapping("/uploadfiles")
	public void multiUpload(HttpServletRequest request,HttpServletResponse Res) {
		System.out.println(request.getParameter("uid")+"==========");
		//获取前台的文件域对象 , 是一个List<MultipartFile>
	    List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
	    String filePath = request.getServletContext().getRealPath("/excel");
	    //创建文件夹
        File fileFolder = new File(filePath);
		if (!fileFolder.exists()) {
			fileFolder.mkdirs();
		}
	    for (int i = 0; i < files.size(); i++) {
	        MultipartFile file = files.get(i);
	        if (file.isEmpty()) {
	            //return "上传第" + (i++) + "个文件失败";
	        }
	        String fileName = file.getOriginalFilename();

	        File dest=new File(filePath,fileName);
	        try {
	            file.transferTo(dest);
	            System.out.println("第" + (i + 1) + "个文件上传成功");
	        } catch (IOException e) {
	            e.printStackTrace();
	            //return "上传第" + (i++) + "个文件失败";
	        }
	    }
	    try {
			Res.sendRedirect("tostudenthome");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //return "上传成功";
	    
	}
}
