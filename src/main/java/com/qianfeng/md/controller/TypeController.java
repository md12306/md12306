/*
package com.qianfeng.md.controller;


import com.qianfeng.md.bean.TbProvince;
import com.qianfeng.md.bean.TbType;
import com.qianfeng.md.service.IProvinceService;
import com.qianfeng.md.service.ITypeService;
import com.qianfeng.md.vo.JSONTable;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private ITypeService iTypeService;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private IProvinceService iProvinceService;
    @RequestMapping
    public String selectSeatTableById(Model model){
        List<JSONTable>  dtoList=new ArrayList<JSONTable>();
        TbType tbType = iTypeService.selectSeatTableByName("宇通250");
       redisTemplate.boundValueOps("car").set(tbType.getSeatTable());
       String table =redisTemplate.boundValueOps("car").get();
       System.out.println(table);
       System.out.println("执行成功");
       List<TbProvince> provinceList = iProvinceService.selectAllProvince();
       model.addAttribute("provinceList",provinceList);
       JSONArray jsonArray = JSONArray.fromObject(table);
       System.out.println("json:"+jsonArray);

        for (int i = 0; i <jsonArray.size() ; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            dtoList.add((JSONTable) JSONObject.toBean(jsonObject, JSONTable.class));
            System.out.println(jsonArray.get(i));
        }

        for (int i = 0; i <dtoList.size() ; i++) {

            System.out.println("第"+i+"行"+dtoList.get(i));
        }
        model.addAttribute("tableList",dtoList);
       return "xz1";
    }
}
*/
