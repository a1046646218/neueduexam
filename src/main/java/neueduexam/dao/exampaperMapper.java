package neueduexam.dao;

import java.util.List;
import neueduexam.entity.exampaper;
import neueduexam.entity.exampaperExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface exampaperMapper {
    int countByExample(exampaperExample example);

    int deleteByExample(exampaperExample example);

    int deleteByPrimaryKey(Integer examid);

    int insert(exampaper record);

    int insertSelective(exampaper record);

    List<exampaper> selectByExample(exampaperExample example);

    exampaper selectByPrimaryKey(Integer examid);

    int updateByExampleSelective(@Param("record") exampaper record, @Param("example") exampaperExample example);

    int updateByExample(@Param("record") exampaper record, @Param("example") exampaperExample example);

    int updateByPrimaryKeySelective(exampaper record);

    int updateByPrimaryKey(exampaper record);
}