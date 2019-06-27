package neueduexam.HXBservice;


public interface SelectQuestionListService {
	
	public String getQuestionList(int libId,String quesType) ;

	public String selectIllegalQuestionList();
}
