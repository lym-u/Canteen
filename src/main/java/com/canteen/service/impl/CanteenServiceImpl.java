//public class CanteenServiceImpl implements CanteenService {
//    @Autowired
//    private CanteenMapper canteenMapper;
//

//}
package com.canteen.service.impl;

import com.canteen.bean.Canteen;
import com.canteen.bean.CanteenExample;
import com.canteen.dao.CanteenMapper;
import com.canteen.service.CanteenService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanteenServiceImpl implements CanteenService {

    private final CanteenMapper canteenMapper;

    @Autowired
    public CanteenServiceImpl(CanteenMapper canteenMapper) {
        this.canteenMapper = canteenMapper;
    }
//        @Override
//    public Canteen getCanteenById(int id) {
//        return canteenMapper.getCanteenById(id);
//    }
//
//    @Override
//    public List<Canteen> getAllCanteens() {
//
//        return canteenMapper.getAllCanteens();
//    }
//
//    @Override
//    public Integer addCanteen(Canteen canteen) {
//        return canteenMapper.addCanteen(canteen);
//    }
//
//    @Override
//    public Integer updateCanteen(Canteen canteen) {
//        return canteenMapper.updateCanteen(canteen);
//    }
//
//    @Override
//    public Integer deleteCanteen(int id) {
//        return canteenMapper.deleteCanteen(id);
//    }
    @Override
    public PageInfo<Canteen> getAll(CanteenExample example, int page, int size) {
        // 首先开启PageHelper的分页
        PageHelper.startPage(page, size);
        // 查询分页信息 调用方式与普通方式一致
        List<Canteen> list = canteenMapper.selectByExample(example);
        //生成PageInfo对象
        PageInfo<Canteen> pageInfo=new PageInfo<Canteen>(list);
        return pageInfo;
    }
    @Override
    public long countByExample(CanteenExample example) {
        return canteenMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CanteenExample example) {
        return canteenMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer canteenid) {
        return canteenMapper.deleteByPrimaryKey(canteenid);
    }

    @Override
    public int insert(Canteen record) {
        return canteenMapper.insert(record);
    }

    @Override
    public int insertSelective(Canteen record) {
        return canteenMapper.insertSelective(record);
    }

    @Override
    public List<Canteen> selectByExample(CanteenExample example) {
        return canteenMapper.selectByExample(example);
    }

    @Override
    public Canteen selectByPrimaryKey(Integer canteenid) {
        return canteenMapper.selectByPrimaryKey(canteenid);
    }

    @Override
    public int updateByExampleSelective(Canteen record, CanteenExample example) {
        return canteenMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Canteen record, CanteenExample example) {
        return canteenMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Canteen record) {
        return canteenMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Canteen record) {
        return canteenMapper.updateByPrimaryKey(record);
    }
}