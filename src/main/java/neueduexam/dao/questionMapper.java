package neueduexam.dao;

import java.util.List;
import neueduexam.entity.question;
import neueduexam.entity.questionExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface questionMapper {
    int countByExample(questionExample example);

    int deleteByExample(questionExample example);

    int deleteByPrimaryKey(Integer quesid);

    int insert(question record);

    int insertSelective(question record);

    List<question> selectByExample(questionExample example);

    question selectByPrimaryKey(Integer quesid);

    int updateByExampleSelective(@Param("record") question record, @Param("example") questionExample example);

    int updateByExample(@Param("record") question record, @Param("example") questionExample example);

    int updateByPrimaryKeySelective(question record);

    int updateByPrimaryKey(question record);
    
    int insertSelectandgetid(question record);

	String selectQuesTypeByPrimaryKey(int quesId);
}