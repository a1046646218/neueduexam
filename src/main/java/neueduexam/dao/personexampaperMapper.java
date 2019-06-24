package neueduexam.dao;

import java.util.List;

import neueduexam.HXBservicelmp.TestSituationEntity;
import neueduexam.entity.personexampaper;
import neueduexam.entity.personexampaperExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface personexampaperMapper {
    int countByExample(personexampaperExample example);

    int deleteByExample(personexampaperExample example);

    int deleteByPrimaryKey(Integer pexamid);

    int insert(personexampaper record);

    int insertSelective(personexampaper record);

    List<personexampaper> selectByExample(personexampaperExample example);

    personexampaper selectByPrimaryKey(Integer pexamid);

    int updateByExampleSelective(@Param("record") personexampaper record, @Param("example") personexampaperExample example);

    int updateByExample(@Param("record") personexampaper record, @Param("example") personexampaperExample example);

    int updateByPrimaryKeySelective(personexampaper record);

    int updateByPrimaryKey(personexampaper record);

	List<TestSituationEntity> makeExcelByTestId(personexampaperExample pE);
	
	int insertandgetkey(personexampaper record);
}