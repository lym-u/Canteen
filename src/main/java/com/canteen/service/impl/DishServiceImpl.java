package com.canteen.service.impl;

import com.canteen.bean.Dish;
import com.canteen.dao.DishMapper;
import com.canteen.service.DishService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 标识为服务类
public class DishServiceImpl implements DishService {
    @Autowired
    private DishMapper dishMapper;

    /**
     *全量查询菜品
     * @return
     */
    @Override
    public PageInfo<Dish> getAllDish(Dish dish, int page, int size) {
        // 首先开启PageHelper的分页
        PageHelper.startPage(page, size);
        // 查询分页信息 调用方式与普通方式一致
        List<Dish> list = dishMapper.getAllDish(dish);
        //生成PageInfo对象
        PageInfo<Dish> pageInfo=new PageInfo<Dish>(list);
        return pageInfo;
    }

    /**
     *查询是否存在
     * @return
     */
    @Override
    public Dish serchDishByNo(int dishID) {
        Dish dish = dishMapper.selectByPrimaryKey(dishID);
        return dish;
    }


    /**
     * 增加菜品信息
     * @param dish
     * @return
     */
    @Override
    public Integer addDish(Dish dish) {
        Integer total=dishMapper.insert(dish);
        return total;
    }

    /**
     * 删除菜品信息
     * @param dish
     * @return
     */
    @Override
    public Integer deleteDish(int dishID) {
        Integer total=dishMapper.deleteByPrimaryKey(dishID);
        return total;
    }


    /**
     * 修改菜品信息
     * @param dish
     * @return
     */
    @Override
    public Integer updateDish(Dish dish) {
        Integer total=dishMapper.updateByPrimaryKey(dish);
        return total;
    }

    /**
     *全量查询用户为下拉框
     * @return
     */
    public List<Dish> selectAllDish(){
        return dishMapper.getAllDish(null);
    }
}
