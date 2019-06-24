package neueduexam.HXBservice;

import java.util.List;

public interface CreateExamPaperService {

	public String createExamPaper(List<Integer> libIds,List<Integer> scores,List<Integer> quesNums,int userId);
}
