package com.canteen.service;


import com.canteen.bean.Dish;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DishService {
    /**
     *全量查询菜品
     * @return 分页
     */
    PageInfo<Dish> getAllDish(Dish dishes, int page, int limit);

    /**
     *查询是否存在
     * @return 菜品
     */
    Dish searchDishByNo(int dishID);

    /**
     * 增加菜品信息
     * @param dish
     * @return 影响的行数
     */
    Integer addDish(Dish dish);

    /**
     * 删除菜品信息
     * @param dishID
     * @return 影响的行数
     */
    Integer deleteDish(int dishID);

    /**
     * 修改菜品信息
     * @param dish
     * @return 影响的行数
     */
    Integer updateDish(Dish dish);

    List<Dish> selectAllDish();
}
