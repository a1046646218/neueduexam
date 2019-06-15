package neueduexam.dao;

import java.util.List;
import neueduexam.entity.userhavelib;
import neueduexam.entity.userhavelibExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface userhavelibMapper {
    int countByExample(userhavelibExample example);

    int deleteByExample(userhavelibExample example);

    int insert(userhavelib record);

    int insertSelective(userhavelib record);

    List<userhavelib> selectByExample(userhavelibExample example);

    int updateByExampleSelective(@Param("record") userhavelib record, @Param("example") userhavelibExample example);

    int updateByExample(@Param("record") userhavelib record, @Param("example") userhavelibExample example);
}