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

    @Override
    public Canteen getCanteenById(int id) {
        return canteenMapper.getCanteenById(id);
    }

    @Override
    public List<Canteen> getAllCanteens() {
        return canteenMapper.getAllCanteens();
    }

    @Override
    public Integer addCanteen(Canteen canteen) {
        return canteenMapper.addCanteen(canteen);
    }

    @Override
    public Integer updateCanteen(Canteen canteen) {
        return canteenMapper.updateCanteen(canteen);
    }

    @Override
    public Integer deleteCanteen(int id) {
        return canteenMapper.deleteCanteen(id);
    }

}