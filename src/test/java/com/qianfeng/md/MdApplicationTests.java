package com.qianfeng.md;

import com.qianfeng.md.bean.*;
import com.qianfeng.md.dao.ICityMapper;
import com.qianfeng.md.dao.IProvinceMapper;
import com.qianfeng.md.dao.IRouteMapper;
import com.qianfeng.md.dao.IUserMapper;
import com.qianfeng.md.service.IOrderService;
import com.qianfeng.md.service.ITypeService;
import com.qianfeng.md.vo.HotRouteVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MdApplicationTests {
    @Autowired
    private IUserMapper iUserMapper;
    @Autowired
    private ICityMapper iCityMapper;
    @Autowired
    private IProvinceMapper iProvinceMapper;
    @Autowired
    private IRouteMapper iRouteMapper;
    @Autowired
    private ITypeService iTypeService;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private IOrderService iOrderService;
    @Test
    public void contextLoads() {
        TbUser tbUser = iUserMapper.checkUsername("Champa");
        System.out.println(tbUser);
    }

    @Test
    public void contextLoads1() {
        List<TbCity> tbCityList = iCityMapper.selectCityByProvince("四川");
        System.out.println(tbCityList.size());
        for (int i = 0; i <tbCityList.size() ; i++) {
            System.out.println(tbCityList.get(i));
        }

    }
    @Test
    public void contextLoads2() {
        List<TbProvince> tbProvinceList = iProvinceMapper.selectAllProvince();
        for (int i = 0; i <tbProvinceList.size() ; i++) {
            System.out.println(tbProvinceList.get(i).getProvinceName());
        }

    }

    @Test
    public void contextLoads3() {
        List<HotRouteVO> hotRouteVOS = iRouteMapper.selectRoute();
        for (int i = 0; i <hotRouteVOS.size() ; i++) {
            System.out.println(hotRouteVOS.get(i).toString());
        }
    }

    @Test
    public void testCase8(){
//创建Redis的客户端
//参数1：IP地址，或者主机名称
//参数2：端口，redis的默认端口是6379
        Jedis jedis = new Jedis("62.234.59.28",6379);
//配置登录密码
        jedis.auth("123456");
//存储字符串
        jedis.set("qianfeng","angsan");

//取出缓存中数据
        String username = jedis.get("qianfeng");
        System.out.println("缓存中的数据："+username);

    }



    @Test
    public void testCase1(){


        String qianfeng =  redisTemplate.boundValueOps("qianfeng").get();
        System.out.println(qianfeng);
        redisTemplate.boundValueOps("qianfeng").set("21",10, TimeUnit.SECONDS);

    }
    @Test
    public void testCase2(){
        TbType tbType = iTypeService.selectSeatTableByName("宇通250");
      /*  System.out.println(tbType.getSeatTable());*/
        redisTemplate.boundValueOps("car").set(tbType.getSeatTable());
        System.out.println(redisTemplate.boundValueOps("car").get());

    }

    @Test
    public void testCase3(){
        List<TbOrder> orderList = iOrderService.queryTicketByMsg("成都","重庆","2019-05-15");
        for (TbOrder order:orderList) {
            System.out.println(order);
        }
    }
}
