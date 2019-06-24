package neueduexam.HLservice;

import java.util.List;

import neueduexam.entity.personquestion;

public interface PersonquestionService {

	public List<personquestion> getperqueslistbypexamid(Integer pexamid);
	
	public int updateByPrimaryKeySelective(personquestion record);
}
