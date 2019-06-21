package neueduexam.dao;

import java.util.List;
import neueduexam.entity.homework;
import neueduexam.entity.homeworkExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface homeworkMapper {
    int countByExample(homeworkExample example);

    int deleteByExample(homeworkExample example);

    int deleteByPrimaryKey(Integer hwid);

    int insert(homework record);

    int insertSelective(homework record);

    List<homework> selectByExample(homeworkExample example);

    homework selectByPrimaryKey(Integer hwid);

    int updateByExampleSelective(@Param("record") homework record, @Param("example") homeworkExample example);

    int updateByExample(@Param("record") homework record, @Param("example") homeworkExample example);

    int updateByPrimaryKeySelective(homework record);

    int updateByPrimaryKey(homework record);
}