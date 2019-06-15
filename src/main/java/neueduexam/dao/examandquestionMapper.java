package neueduexam.dao;

import java.util.List;
import neueduexam.entity.examandquestion;
import neueduexam.entity.examandquestionExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface examandquestionMapper {
    int countByExample(examandquestionExample example);

    int deleteByExample(examandquestionExample example);

    int insert(examandquestion record);

    int insertSelective(examandquestion record);

    List<examandquestion> selectByExample(examandquestionExample example);

    int updateByExampleSelective(@Param("record") examandquestion record, @Param("example") examandquestionExample example);

    int updateByExample(@Param("record") examandquestion record, @Param("example") examandquestionExample example);
}