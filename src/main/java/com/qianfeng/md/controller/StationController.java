package com.qianfeng.md.controller;



import com.qianfeng.md.bean.TbStation;
import com.qianfeng.md.service.IStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@CrossOrigin
@Controller
@RequestMapping("/station")
public class StationController {

        @Autowired
        private IStationService iStationService;



        @ResponseBody
        @RequestMapping(value = "/allstation",method = RequestMethod.GET)
        public List<TbStation> List(){
            //所有线路

            List<TbStation> stationList = iStationService.queryAllStation();
            return stationList;
        }



}
