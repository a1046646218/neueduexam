package neueduexam.dao;

import java.util.List;
import neueduexam.entity.record;
import neueduexam.entity.recordExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface recordMapper {
    int countByExample(recordExample example);

    int deleteByExample(recordExample example);

    int deleteByPrimaryKey(Integer recordid);

    int insert(record record);

    int insertSelective(record record);

    List<record> selectByExample(recordExample example);

    record selectByPrimaryKey(Integer recordid);

    int updateByExampleSelective(@Param("record") record record, @Param("example") recordExample example);

    int updateByExample(@Param("record") record record, @Param("example") recordExample example);

    int updateByPrimaryKeySelective(record record);

    int updateByPrimaryKey(record record);
}