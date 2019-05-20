package com.qianfeng.md.dao;

import com.qianfeng.md.bean.TbRoute;
import com.qianfeng.md.vo.HotRouteVO;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface IRouteMapper {
    /**
     * 查询热门线路
     * @return 热门路线集合
     */
    List<HotRouteVO> selectRoute();



    /**
     * 后台添加路线
     * @param tbRoute
     */
    void saveRoute(@ProbeParam("tbRoute") TbRoute tbRoute);


    /**
     * 后台删除路线
     * @param routeId
     */
    Integer deleteRoute(@Param("routeId") Integer routeId);


    /**
     * 后台修改路线
     * @param tbRoute
     */
    void updateRoute(TbRoute tbRoute);

    /**
     * 查找单个路线
     * @param routId
     */
    TbRoute queryRoute(@Param("routeId") Integer routId);


    /**
     * 查询所有路线,并分页
     * @param page
     * @return
     */
    List<TbRoute> allRouteByPage(@Param("page") Integer page);

    /**
     * 查所有路线集合
     * @return
     */
    List<TbRoute> allRoute();
}
