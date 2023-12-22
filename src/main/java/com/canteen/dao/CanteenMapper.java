package com.canteen.dao;

import com.canteen.bean.Canteen;
import com.canteen.bean.CanteenExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 食堂数据层
 * @author
 *
 */
@Mapper //标识为mybatis数据层接口
public interface CanteenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    long countByExample(CanteenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    int deleteByExample(CanteenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer canteenid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    int insert(Canteen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    int insertSelective(Canteen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    List<Canteen> selectByExample(CanteenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    Canteen selectByPrimaryKey(Integer canteenid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Canteen record, @Param("example") CanteenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Canteen record, @Param("example") CanteenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Canteen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Canteen
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Canteen record);
}