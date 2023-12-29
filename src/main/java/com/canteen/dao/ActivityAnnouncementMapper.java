package com.canteen.dao;

import com.canteen.bean.ActivityAnnouncement;
import com.canteen.bean.ActivityAnnouncementExample;
import com.canteen.bean.Canteen;
import com.canteen.bean.CanteenExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 公告数据层
 * @CasseShimada
 *
 */
@Mapper //标识为mybatis数据层接口
public interface ActivityAnnouncementMapper {
    long countByExample(ActivityAnnouncementExample example);

    int deleteByExample(ActivityAnnouncementExample example);

    int deleteByPrimaryKey(Integer announcementid);

    int insert(ActivityAnnouncement record);

    int insertSelective(ActivityAnnouncement record);

    List<ActivityAnnouncement> selectByExample(ActivityAnnouncementExample example);

    ActivityAnnouncement selectByPrimaryKey(Integer announcementid);

    int updateByExampleSelective(@Param("record") ActivityAnnouncement record, @Param("example") ActivityAnnouncementExample example);

    int updateByExample(@Param("record") ActivityAnnouncement record, @Param("example") ActivityAnnouncementExample example);

    int updateByPrimaryKeySelective(ActivityAnnouncement record);

    int updateByPrimaryKey(ActivityAnnouncement record);
}
