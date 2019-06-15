package neueduexam.dao;

import java.util.List;
import neueduexam.entity.invitation;
import neueduexam.entity.invitationExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface invitationMapper {
    int countByExample(invitationExample example);

    int deleteByExample(invitationExample example);

    int insert(invitation record);

    int insertSelective(invitation record);

    List<invitation> selectByExample(invitationExample example);

    int updateByExampleSelective(@Param("record") invitation record, @Param("example") invitationExample example);

    int updateByExample(@Param("record") invitation record, @Param("example") invitationExample example);
}