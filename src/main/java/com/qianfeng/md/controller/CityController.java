package com.qianfeng.md.controller;




import com.qianfeng.md.bean.TbCity;
import com.qianfeng.md.bean.TbProvince;
import com.qianfeng.md.service.ICityService;
import com.qianfeng.md.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@Controller
@RequestMapping("/province")
public class CityController {
    @Autowired
    private ICityService iCityService;
    @Autowired
    private IProvinceService iProvinceService;
    @RequestMapping("/list/{province}")
    public String queryAllProvince(@PathVariable("province") String province , Model model){
        //查询所有省份集合
        List<TbProvince> provinceList = iProvinceService.selectAllProvince();
        //通过省份查询该省份的城市集合
        List<TbCity> cityList = iCityService.selectCityByProvince(province);
        model.addAttribute("provinceList",provinceList);
        model.addAttribute("cityList",cityList);
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/provinceList",method = RequestMethod.GET)
    public List<TbProvince> provinceList(){
        //通过省份查询该省份的城市集合
        List<TbProvince> provinceList = iProvinceService.selectAllProvince();
        return provinceList;
    }

    @ResponseBody
    @RequestMapping(value = "/cityList",method = RequestMethod.GET)
    public List<TbCity> cityList(){
        //所有城市集合
        List<TbCity> tbCityList = iCityService.selectAllCity();
        return tbCityList;
    }

    @ResponseBody
    @RequestMapping(value = "/city/{province}",method = RequestMethod.GET)
    public List<TbCity> List(@PathVariable("province") String province){
        //通过省份查询该省份的城市集合
        List<TbCity> cityList = iCityService.selectCityByProvince(province);
        return cityList;
    }
}
