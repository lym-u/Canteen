package com.canteen.service.impl;

import com.canteen.bean.Dishreview;
import com.canteen.bean.DishreviewExample;
import com.canteen.dao.DishreviewMapper;
import com.canteen.service.DishReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishReviewServiceImpl implements DishReviewService {

    @Autowired
    private DishreviewMapper dishreviewMapper;

    @Override
    public long countByExample(DishreviewExample example) {
        return dishreviewMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DishreviewExample example) {
        return dishreviewMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer canteenreviewid) {
        return dishreviewMapper.deleteByPrimaryKey(canteenreviewid);
    }

    @Override
    public int insert(Dishreview record) {
        return dishreviewMapper.insert(record);
    }

    @Override
    public int insertSelective(Dishreview record) {
        return dishreviewMapper.insertSelective(record);
    }

    @Override
    public List<Dishreview> selectByExampleWithBLOBs(DishreviewExample example) {
        return dishreviewMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<Dishreview> selectByExample(DishreviewExample example) {
        return dishreviewMapper.selectByExample(example);
    }

    @Override
    public Dishreview selectByPrimaryKey(Integer canteenreviewid) {
        return dishreviewMapper.selectByPrimaryKey(canteenreviewid);
    }

    @Override
    public int updateByExampleSelective(Dishreview record, DishreviewExample example) {
        return dishreviewMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs(Dishreview record, DishreviewExample example) {
        return dishreviewMapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample(Dishreview record, DishreviewExample example) {
        return dishreviewMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Dishreview record) {
        return dishreviewMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Dishreview record) {
        return dishreviewMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Dishreview record) {
        return dishreviewMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Dishreview> getDishReviewByDish(int dishid) {
        return dishreviewMapper.selectByDishid(dishid);
    }
}
