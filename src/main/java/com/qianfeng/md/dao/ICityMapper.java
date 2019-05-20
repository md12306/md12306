package com.qianfeng.md.dao;

import com.qianfeng.md.bean.TbCity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
@Mapper
public interface ICityMapper {
    List<TbCity> selectCityByProvince(@Param("provinceName") String provinceName);
    List<TbCity> selectAllCity();

}
