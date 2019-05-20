package com.qianfeng.md.dao;

import com.qianfeng.md.bean.TbProvince;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface IProvinceMapper {
    List<TbProvince> selectAllProvince();
}
