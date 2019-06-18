package neueduexam.dao;

import java.util.List;
import neueduexam.entity.testpaper;
import neueduexam.entity.testpaperExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface testpaperMapper {
    int countByExample(testpaperExample example);

    int deleteByExample(testpaperExample example);

    int insert(testpaper record);

    int insertSelective(testpaper record);

    List<testpaper> selectByExample(testpaperExample example);

    int updateByExampleSelective(@Param("record") testpaper record, @Param("example") testpaperExample example);

    int updateByExample(@Param("record") testpaper record, @Param("example") testpaperExample example);
}