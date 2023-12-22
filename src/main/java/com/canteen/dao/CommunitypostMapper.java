package com.canteen.dao;

import com.canteen.bean.Communitypost;
import com.canteen.bean.CommunitypostExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 社区数据层
 * @author
 *
 */
@Mapper //标识为mybatis数据层接口
public interface CommunitypostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    long countByExample(CommunitypostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int deleteByExample(CommunitypostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer postid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int insert(Communitypost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int insertSelective(Communitypost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    List<Communitypost> selectByExampleWithBLOBs(CommunitypostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    List<Communitypost> selectByExample(CommunitypostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    Communitypost selectByPrimaryKey(Integer postid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Communitypost record, @Param("example") CommunitypostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Communitypost record, @Param("example") CommunitypostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Communitypost record, @Param("example") CommunitypostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Communitypost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Communitypost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CommunityPost
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Communitypost record);
}