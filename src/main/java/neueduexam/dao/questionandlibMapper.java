package neueduexam.dao;

import java.util.List;
import neueduexam.entity.questionandlib;
import neueduexam.entity.questionandlibExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface questionandlibMapper {
    int countByExample(questionandlibExample example);

    int deleteByExample(questionandlibExample example);

    int insert(questionandlib record);

    int insertSelective(questionandlib record);

    List<questionandlib> selectByExample(questionandlibExample example);

    int updateByExampleSelective(@Param("record") questionandlib record, @Param("example") questionandlibExample example);

    int updateByExample(@Param("record") questionandlib record, @Param("example") questionandlibExample example);
}