package com.qianfeng.md.serviceImpl;

import com.qianfeng.md.bean.TbStation;
import com.qianfeng.md.dao.IStationMapper;
import com.qianfeng.md.service.IStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class StationServiceImpl implements IStationService {
    @Autowired
    private IStationMapper iStationMapper;
    @Override
    public List<TbStation> queryAllStation() {
        List<TbStation> stationList = iStationMapper.queryAllStation();
        return stationList;
    }
}
