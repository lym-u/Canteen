package com.canteen.service;


import com.canteen.bean.Dish;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DishService {
    /**
     *全量查询菜品
     * @return
     */
    PageInfo<Dish> getAllDish(Dish dishes, int page, int limit);

    /**
     *查询是否存在
     * @return
     */
    Dish serchDishByNo(int dishID);

    /**
     * 增加菜品信息
     * @param dish
     * @return
     */
    Integer addDish(Dish dish);

    /**
     * 删除菜品信息
     * @param dish
     * @return
     */
    Integer deleteDish(int dishID);

    /**
     * 修改菜品信息
     * @param dish
     * @return
     */
    Integer updateDish(Dish dish);

    List<Dish> selectAllDish();
}
