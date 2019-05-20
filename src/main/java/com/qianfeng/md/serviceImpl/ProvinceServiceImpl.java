package com.qianfeng.md.serviceImpl;

import com.qianfeng.md.bean.TbProvince;
import com.qianfeng.md.dao.IProvinceMapper;
import com.qianfeng.md.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceServiceImpl implements IProvinceService {
    @Autowired
    private IProvinceMapper iProvinceMapper;
    @Override
    public List<TbProvince> selectAllProvince() {
        List<TbProvince> provinceList = iProvinceMapper.selectAllProvince();
        return provinceList;
    }
}
