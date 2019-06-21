package neueduexam.dao;

import java.util.List;
import neueduexam.entity.groupanduser;
import neueduexam.entity.groupanduserExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface groupanduserMapper {
    int countByExample(groupanduserExample example);

    int deleteByExample(groupanduserExample example);

    int insert(groupanduser record);

    int insertSelective(groupanduser record);

    List<groupanduser> selectByExample(groupanduserExample example);

    int updateByExampleSelective(@Param("record") groupanduser record, @Param("example") groupanduserExample example);

    int updateByExample(@Param("record") groupanduser record, @Param("example") groupanduserExample example);
}