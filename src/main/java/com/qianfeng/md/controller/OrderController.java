package com.qianfeng.md.controller;

import com.qianfeng.md.bean.TbOrder;
import com.qianfeng.md.bean.TbProvince;
import com.qianfeng.md.bean.TbType;
import com.qianfeng.md.service.IOrderService;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private ITypeService iTypeService;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private IProvinceService iProvinceService;
    private List<JSONTable> dtoList=new ArrayList<JSONTable>();
    @RequestMapping("/ticket/{routeStart}/{routeEnd}/{startDate}")
    public String selectTicket(@PathVariable("routeStart") String routeStart, @PathVariable("routeEnd") String routeEnd, @PathVariable("startDate") String startDate, Model model){
        List<TbOrder> orderList = iOrderService.queryTicketByMsg(routeStart, routeEnd, startDate);
        model.addAttribute("orderList",orderList);
        model.addAttribute("routeStart",routeStart);
        model.addAttribute("routeEnd",routeEnd);
        model.addAttribute("startDate",startDate);
        return "ticket";
    }



    @RequestMapping("/xz/{typeName}/{carpai}/{ticketPrice}")
    public String selectSeatTableByName(@PathVariable("typeName") String typeName,@PathVariable("carpai") String carpai,@PathVariable("ticketPrice") String ticketPrice,Model model){
        int residue = 0;//余票
        //获取缓存数据
        String table =redisTemplate.boundValueOps(carpai).get();
        if(dtoList.size()==0){
            if( table==null){
                //第一次进来dtolist为空缓存为空 ,从数据库读取数据存入缓存
                TbType tbType = iTypeService.selectSeatTableByName(typeName);
                redisTemplate.boundValueOps(carpai).set(tbType.getSeatTable());
            }
        }else{
            //不为空,清空
            dtoList=new ArrayList<JSONTable>();
        }
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
                    if(dtoList.get(i).getStyle()==0){
                        residue++;
                    }
            System.out.println("第"+i+"行"+dtoList.get(i));
        }
        model.addAttribute("residue",residue);
        model.addAttribute("tableList",dtoList);
        model.addAttribute("ticketPrice",ticketPrice);
        model.addAttribute("carpai",carpai);
        return "xz1";
    }

    //缓存中更改座位状态
    @RequestMapping("/change/{seatnumber}/{carpai}")
    public String change(@PathVariable("seatnumber") String seatnumber,@PathVariable("carpai") String carpai){
            Integer id = Integer.parseInt(seatnumber)-1;
        System.out.println("id:"+id);
        dtoList.get(id).setStyle(1);
        String jsonString = JSONArray.fromObject(dtoList).toString();
        System.out.println("fff");
        System.out.println(jsonString);
        redisTemplate.boundValueOps(carpai).set(jsonString);
        return "createTicketOrder";
    }
}
