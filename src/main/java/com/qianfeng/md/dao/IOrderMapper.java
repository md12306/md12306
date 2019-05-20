package com.qianfeng.md.dao;

import com.qianfeng.md.bean.TbOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface IOrderMapper {
    List<TbOrder> queryTicketByMsg(@Param("routeStart") String routeStart, @Param("routeEnd") String routeEnd,@Param("startDate") String startDate);
}
