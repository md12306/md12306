package com.qianfeng.md.controller;



import com.qianfeng.md.bean.TbRoute;
import com.qianfeng.md.service.IRouteService;
import com.qianfeng.md.vo.HotRouteVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@CrossOrigin
@Controller
@RequestMapping("/route")
public class RouteController {

        @Autowired
        private IRouteService iRouteService;

        @ResponseBody
        @RequestMapping(value = "/allroute",method = RequestMethod.GET)
        public List<TbRoute> List(){
            //所有线路
            List<TbRoute> routeList = iRouteService.allRoute();
            return routeList;
        }

        @ResponseBody
        @RequestMapping(value = "/hotRoute",method = RequestMethod.GET)
        public List<HotRouteVO> hotRoute(){
        //热门线路
            List<HotRouteVO> routeVOList = iRouteService.selectRoute();

        return routeVOList;
    }

}
