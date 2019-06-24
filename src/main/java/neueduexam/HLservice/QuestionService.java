package neueduexam.HLservice;

import java.util.List;

import neueduexam.entity.question;

public interface QuestionService {
public int addquestion(question q);
public question selectByPrimaryKey(Integer quesid);
}
