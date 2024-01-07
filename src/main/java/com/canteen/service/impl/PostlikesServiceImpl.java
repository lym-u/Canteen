package com.canteen.service.impl;

import com.canteen.bean.Postlikes;
import com.canteen.bean.PostlikesExample;
import com.canteen.dao.PostlikesMapper;
import com.canteen.service.PostlikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostlikesServiceImpl implements PostlikesService{
    @Autowired
    private PostlikesMapper postlikesMapper;
    @Override
    public long countByExample(PostlikesExample example) {
        return postlikesMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(PostlikesExample example) {
        return postlikesMapper.deleteByExample(example);
    }
    @Override
    public int deleteByPrimaryKey(Integer likeid) {
        return postlikesMapper.deleteByPrimaryKey(likeid);
    }
    @Override
    public int insert(Postlikes record) {
        return postlikesMapper.insert(record);
    }
    @Override
    public int insertSelective(Postlikes record) {
        return postlikesMapper.insertSelective(record);
    }
    @Override
    public List<Postlikes> selectByExample(PostlikesExample example) {
        return postlikesMapper.selectByExample(example);
    }
    @Override
    public Postlikes selectByPrimaryKey(Integer likeid) {
        return postlikesMapper.selectByPrimaryKey(likeid);
    }
    @Override
    public int updateByExampleSelective(Postlikes record, PostlikesExample example) {
        return postlikesMapper.updateByExampleSelective(record, example);
    }
    @Override
    public int updateByExample(Postlikes record, PostlikesExample example) {
        return postlikesMapper.updateByExample(record, example);
    }
    @Override
    public int updateByPrimaryKeySelective(Postlikes record) {
        return postlikesMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public int updateByPrimaryKey(Postlikes record) {
        return postlikesMapper.updateByPrimaryKey(record);
    }
}


