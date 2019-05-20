package com.qianfeng.md.service;

import com.qianfeng.md.bean.TbRoute;

import com.qianfeng.md.vo.HotRouteVO;

import java.util.List;

public interface IRouteService {

    /**
     * 查询热门线路
     * @return 热门路线集合
     */
    List<HotRouteVO> selectRoute();



    /**
     * 后台添加路线
     * @param tbRoute
     */
    void saveRoute(TbRoute tbRoute);


    /**
     * 后台删除路线
     * @param routeId
     */
    Integer deleteRoute(Integer routeId);


    /**
     * 后台修改路线
     * @param tbRoute
     */
    void updateRoute(TbRoute tbRoute);

    /**
     * 查找单个路线
     * @param routId
     */
    TbRoute queryRoute(Integer routId);


    /**
     * 查询所有路线,并分页
     * @param page
     * @return
     */
    List<TbRoute> allRouteByPage(Integer page);

    List<TbRoute> allRoute();
}
