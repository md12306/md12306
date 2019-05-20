package com.qianfeng.md.serviceImpl;

import com.qianfeng.md.bean.TbCity;
import com.qianfeng.md.dao.ICityMapper;
import com.qianfeng.md.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements ICityService {
    @Autowired
    private ICityMapper iCityMapper;
    @Override
    public List<TbCity> selectCityByProvince(String provinceName) {
        List<TbCity> tbCityList = iCityMapper.selectCityByProvince(provinceName);
        return tbCityList;
    }

    @Override
    public List<TbCity> selectAllCity() {
        List<TbCity> tbCityList = iCityMapper.selectAllCity();
        return tbCityList;
    }
}
