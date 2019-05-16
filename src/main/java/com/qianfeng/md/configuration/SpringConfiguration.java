package com.qianfeng.md.configuration;


import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.qianfeng.md.shiro.MyRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.LinkedHashMap;

@Configuration
public class SpringConfiguration {

    /**
     * 整合shiro
     */
    @Bean
    public ShiroFilterFactoryBean provideShiroFilter(MyRealm myRealm){
        System.out.println("----->>>>");
        //spring整合Shiro的过滤器工厂类，在此工厂中由SPring管理Shiro的一些对象。
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        //创建一个SecurityManager
        //厨师
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //需要Realm
        securityManager.setRealm(myRealm);
        factoryBean.setSecurityManager(securityManager);
        //权限拦截的配置
        //为什么要使用有序的map
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("/user/login","anon");
        //linkedHashMap.put("/**","authc");
        factoryBean.setFilterChainDefinitionMap(linkedHashMap);
        // book/query=authc
        return factoryBean;
    }

    /**
     * 因为Thymeleaf支持shiro没有jsp容易，需要让shiro知道当前的页面是jsp还是thymeleaf，
     * 所以需要加入方言。
     *
     * 以下方言是thymeleaf的方言
     * @return
     */
    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }
}
