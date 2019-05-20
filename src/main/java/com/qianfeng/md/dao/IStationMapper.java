package com.qianfeng.md.dao;

import com.qianfeng.md.bean.TbStation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface IStationMapper {
    List<TbStation> queryAllStation();
}
