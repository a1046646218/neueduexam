package neueduexam.dao;

import java.util.List;
import neueduexam.entity.personquestion;
import neueduexam.entity.personquestionExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface personquestionMapper {
    int countByExample(personquestionExample example);

    int deleteByExample(personquestionExample example);

    int deleteByPrimaryKey(Integer perquesid);

    int insert(personquestion record);

    int insertSelective(personquestion record);

    List<personquestion> selectByExample(personquestionExample example);

    personquestion selectByPrimaryKey(Integer perquesid);

    int updateByExampleSelective(@Param("record") personquestion record, @Param("example") personquestionExample example);

    int updateByExample(@Param("record") personquestion record, @Param("example") personquestionExample example);

    int updateByPrimaryKeySelective(personquestion record);

    int updateByPrimaryKey(personquestion record);
}