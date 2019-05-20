package com.qianfeng.md.serviceImpl;

import com.qianfeng.md.bean.TbOrder;
import com.qianfeng.md.dao.IOrderMapper;
import com.qianfeng.md.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderMapper iOrderMapper;

    @Override
    public List<TbOrder> queryTicketByMsg(String routeStart, String routeEnd, String startDate) {
        List<TbOrder> orderList = iOrderMapper.queryTicketByMsg(routeStart,routeEnd,startDate);
        return orderList;
    }
}
