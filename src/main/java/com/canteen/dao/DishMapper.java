package com.canteen.dao;

import com.canteen.bean.Dish;
import com.canteen.bean.DishExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 菜品数据层
 * @author
 *
 */
@Mapper //标识为mybatis数据层接口
public interface DishMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    long countByExample(DishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    int deleteByExample(DishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer dishid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    int insert(Dish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    int insertSelective(Dish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    List<Dish> selectByExample(DishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    Dish selectByPrimaryKey(Integer dishid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Dish record, @Param("example") DishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Dish record, @Param("example") DishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Dish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Dish
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Dish record);

    List<Dish> getAllDish(Dish dish);

    List<Dish> selectByCanteenId(int cateenid);
}