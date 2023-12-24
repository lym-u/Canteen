package com.canteen.service.impl;


import com.canteen.bean.Canteen;
import com.canteen.dao.CanteenMapper;
import com.canteen.service.CanteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanteenServiceImpl implements CanteenService {
    @Autowired
    private CanteenMapper canteenMapper;


    public Canteen getCanteenById(int id) {
//        return canteenMapper.getCanteenById(id);
        return canteenMapper.selectByPrimaryKey(id);
    }


    public List<Canteen> getAllCanteens() {
//        return canteenMapper.getAllCanteens();
        return canteenMapper.getAllCanteens();
    }


    public Integer addCanteen(Canteen canteen) {
//        return canteenMapper.addCanteen(canteen);
        return canteenMapper.insert(canteen);
    }


    public Integer updateCanteen(Canteen canteen) {
//        return canteenMapper.updateCanteen(canteen);
        return canteenMapper.updateByPrimaryKey(canteen);
    }


    public Integer deleteCanteen(int id) {
//        return canteenMapper.deleteCanteen(id);
        return canteenMapper.deleteByPrimaryKey(id);
    }

}
