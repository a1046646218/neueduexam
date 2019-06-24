package neueduexam.HLservice;
import neueduexam.entity.personexampaper;


public interface PersonExampaperService {
	  public personexampaper selectByPrimaryKey(Integer pexamid);
	  public int updateByPrimaryKeySelective(personexampaper record);
	
}
