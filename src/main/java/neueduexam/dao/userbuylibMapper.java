package neueduexam.dao;

import java.util.List;
import neueduexam.entity.userbuylib;
import neueduexam.entity.userbuylibExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface userbuylibMapper {
    int countByExample(userbuylibExample example);

    int deleteByExample(userbuylibExample example);

    int insert(userbuylib record);

    int insertSelective(userbuylib record);

    List<userbuylib> selectByExample(userbuylibExample example);

    int updateByExampleSelective(@Param("record") userbuylib record, @Param("example") userbuylibExample example);

    int updateByExample(@Param("record") userbuylib record, @Param("example") userbuylibExample example);
}