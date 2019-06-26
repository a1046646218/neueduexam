package neueduexam.HXBservice;

public interface HxbUserService {

	String getStudentList();

	Integer updateStudent(Integer userId,String type);

	String getUserList();

}
