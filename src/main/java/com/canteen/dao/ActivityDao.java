
import com.canteen.bean.ActivityAnnouncement;
import com.canteen.bean.ActivityAnnouncementExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface ActivityDao {
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
