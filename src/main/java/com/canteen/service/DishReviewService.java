package com.canteen.service;

import com.canteen.bean.Dishreview;
import com.canteen.bean.DishreviewExample;

import java.util.List;

public interface DishReviewService {
    long countByExample(DishreviewExample example);

    int deleteByExample(DishreviewExample example);

    int deleteByPrimaryKey(Integer dishreviewid);

    int insert(Dishreview record);

    int insertSelective(Dishreview record);

    List<Dishreview> selectByExampleWithBLOBs(DishreviewExample example);

    List<Dishreview> selectByExample(DishreviewExample example);

    Dishreview selectByPrimaryKey(Integer dishreviewid);

    int updateByExampleSelective(Dishreview record, DishreviewExample example);

    int updateByExampleWithBLOBs(Dishreview record, DishreviewExample example);

    int updateByExample(Dishreview record, DishreviewExample example);

    int updateByPrimaryKeySelective(Dishreview record);

    int updateByPrimaryKeyWithBLOBs(Dishreview record);

    int updateByPrimaryKey(Dishreview record);

    List<Dishreview> getDishReviewByDish(int dishid);
}
