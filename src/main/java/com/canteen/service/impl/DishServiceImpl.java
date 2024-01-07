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
     * 全量查询菜品
     * @return 分页
     */
    @Override
    public PageInfo<Dish> getAllDish(Dish dish, int page, int size) {
        // 首先开启PageHelper的分页
        PageHelper.startPage(page, size);
        // 查询分页信息 调用方式与普通方式一致
        List<Dish> list = dishMapper.getAllDish(dish);
        //生成PageInfo对象
        return new PageInfo<Dish>(list);
    }

    /**
     * 查询是否存在
     * @return 菜品
     */
    @Override
    public Dish searchDishByNo(int dishID) {
        return dishMapper.selectByPrimaryKey(dishID);
    }


    /**
     * 增加菜品信息
     * @return 影响的行数
     */
    @Override
    public Integer addDish(Dish dish) {
        return dishMapper.insert(dish);
    }

    /**
     * 删除菜品信息
     * @return 影响的行数
     */
    @Override
    public Integer deleteDish(int dishID) {
        return dishMapper.deleteByPrimaryKey(dishID);
    }


    /**
     * 修改菜品信息
     * @return 影响的行数
     */
    @Override
    public Integer updateDish(Dish dish) {
        return dishMapper.updateByPrimaryKey(dish);
    }

    /**
     * 全量查询用户为下拉框
     * @return 菜品列表
     */
    public List<Dish> selectAllDish(){
        return dishMapper.getAllDish(null);
    }

    public List<Dish> getDishesByCanteen(int canteenid){
        return dishMapper.selectByCanteenId(canteenid);
    }
}
