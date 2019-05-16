package com.qianfeng.md.controller;


import com.qianfeng.md.vo.JsonResultVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")//根目录
public class UserController {

    /**
     * 登录
     * ResponseBody加上此注解，方法return的是什么，将不会做任何的处理和修饰，直接将返回的字符串给用户。
     * @return
     */
    @ResponseBody
    @PostMapping("/login")
    public JsonResultVO loginAjax(String username, String password){
        JsonResultVO jsonResultVO = new JsonResultVO();
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(username,password));
            jsonResultVO.setCode(1);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("登录失败，用户名或者密码错误");
        }
        /*重定向不会经过视图解析器*/
        //{code:1,msg:'登录成功'}，code是用来进行条件判断的，msg用来显示
        return jsonResultVO;
    }

    /*@RequiresPermissions({"商品管理"})
    @RequestMapping("demo")
    @ResponseBody
    public String demo() throws Exception{
        return "shiro权限";
    }*/


    //登录页面方法:


    /*
    function login() {
       //获取用户输入的用户名和密码
        var usernameStr = $("#username").val();
        var passwordStr = $("#password").val();
        //将用户名和密码通过ajax提交到后台
        //参数1：URL，需要发送数据的后台地址
        //参数2：需要发送到指定URL的数据，只能是json数据
        //参数3：后台返回的数据，回调函数
        $.post("user/login",
            {username:usernameStr,password:passwordStr},
            function (data) {

                if (data.code == 1) {
                    //登录成功
                    window.location.href="hello.jsp";
                } else {
                    alert("登录失败："+data.msg);
                }
            });
    }*/
}
