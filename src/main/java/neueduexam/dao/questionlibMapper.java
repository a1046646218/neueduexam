package neueduexam.dao;

import java.util.List;

import neueduexam.HXBservicelmp.SimpleQuestionLib;
import neueduexam.entity.questionlib;
import neueduexam.entity.questionlibExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface questionlibMapper {
    int countByExample(questionlibExample example);

    int deleteByExample(questionlibExample example);

    int deleteByPrimaryKey(Integer libid);

    int insert(questionlib record);

    int insertSelective(questionlib record);

    List<questionlib> selectByExample(questionlibExample example);

    questionlib selectByPrimaryKey(Integer libid);

    int updateByExampleSelective(@Param("record") questionlib record, @Param("example") questionlibExample example);

    int updateByExample(@Param("record") questionlib record, @Param("example") questionlibExample example);

    int updateByPrimaryKeySelective(questionlib record);

    int updateByPrimaryKey(questionlib record);
    
    int insertandgetlkey(questionlib record);

	SimpleQuestionLib selectSimpleQuestionLibByPrimaryKey(Integer libid);

	int insertExceptId(questionlib q);

	int deleteSingleNumberBylibId(Integer libId);

	int deleteMultipleNumberBylibId(Integer libId);

	int deleteBlankNumberBylibId(Integer libId);

	int deleteJudgeNumberBylibId(Integer libId);

	int deleteAnswerNumberBylibId(Integer libId);
}