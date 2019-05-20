package com.qianfeng.md.service;

import com.qianfeng.md.bean.TbCity;

import java.util.List;

public interface ICityService {
    List<TbCity> selectCityByProvince(String provinceName);
    List<TbCity> selectAllCity();
}
