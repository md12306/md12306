package com.qianfeng.md.serviceImpl;

import com.qianfeng.md.bean.TbRoute;
import com.qianfeng.md.dao.IRouteMapper;
import com.qianfeng.md.service.IRouteService;
import com.qianfeng.md.vo.HotRouteVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements IRouteService {

    @Autowired
    protected IRouteMapper iRouteMapper;

    @Override
    public List<TbRoute> allRoute() {
        List<TbRoute> routeList = iRouteMapper.allRoute();
        return routeList;
    }

    @Override
    public List<HotRouteVO> selectRoute() {
        List<HotRouteVO> hotRoutes = iRouteMapper.selectRoute();
        return hotRoutes;
    }

    @Override
    public void saveRoute(TbRoute tbRoute) {
        iRouteMapper.saveRoute(tbRoute);

    }

    @Override
    public Integer deleteRoute(Integer routeId) {

        return iRouteMapper.deleteRoute(routeId);
    }

    @Override
    public void updateRoute(TbRoute tbRoute) {
        iRouteMapper.updateRoute(tbRoute);
    }

    @Override
    public TbRoute queryRoute(Integer routId) {

        return iRouteMapper.queryRoute(routId);
    }

    @Override
    public List<TbRoute> allRouteByPage(Integer page) {
        List<TbRoute> routeList = iRouteMapper.allRoute();
        return routeList;
    }
}
