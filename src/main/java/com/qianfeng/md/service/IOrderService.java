package com.qianfeng.md.service;

import com.qianfeng.md.bean.TbOrder;

import java.util.List;

public interface IOrderService {
    List<TbOrder> queryTicketByMsg(String routeStart, String routeEnd, String startDate);
}
