package neueduexam.dao;

import java.util.List;
import neueduexam.entity.mygroup;
import neueduexam.entity.mygroupExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface mygroupMapper {
    int countByExample(mygroupExample example);

    int deleteByExample(mygroupExample example);

    int deleteByPrimaryKey(Integer groupid);

    int insert(mygroup record);

    int insertSelective(mygroup record);

    List<mygroup> selectByExample(mygroupExample example);

    mygroup selectByPrimaryKey(Integer groupid);

    int updateByExampleSelective(@Param("record") mygroup record, @Param("example") mygroupExample example);

    int updateByExample(@Param("record") mygroup record, @Param("example") mygroupExample example);

    int updateByPrimaryKeySelective(mygroup record);

    int updateByPrimaryKey(mygroup record);
    
    int insertandgetkey(mygroup record);
}