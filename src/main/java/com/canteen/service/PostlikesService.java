package com.canteen.service;
import com.canteen.bean.Postlikes;
import com.canteen.bean.PostlikesExample;

import java.util.List;

public interface PostlikesService {
    long countByExample(PostlikesExample example);

    int deleteByExample(PostlikesExample example);

    int deleteByPrimaryKey(Integer likeid);

    int insert(Postlikes record);

    int insertSelective(Postlikes record);

    List<Postlikes> selectByExample(PostlikesExample example);

    Postlikes selectByPrimaryKey(Integer likeid);

    int updateByExampleSelective(Postlikes record, PostlikesExample example);

    int updateByExample(Postlikes record, PostlikesExample example);

    int updateByPrimaryKeySelective(Postlikes record);

    int updateByPrimaryKey(Postlikes record);
}
