package com.qianfeng.md.serviceImpl;

import com.qianfeng.md.bean.TbUser;
import com.qianfeng.md.commons.MD5Utils;
import com.qianfeng.md.dao.IUserMapper;
import com.qianfeng.md.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper iUserMapper;
    @Override
    public TbUser login(String username, String password) throws AuthenticationException {
        if (username == null||password == null) {
            throw new NullPointerException("param is null");
        }
        if (null == username || "".equals(username)) {
            throw new NullPointerException("username is null");
        }
        //1、检验用户名在数据库是否存在
        TbUser tbUser = iUserMapper.checkUsername(username);
        if (tbUser == null) {
            throw new UnknownAccountException();
        }
        //2、密码校验
        //a、先对用户传入的密码进行加密
        String md5Password = MD5Utils.md5(password, "LL");
        //b、同数据库的密文进行对比
        if (!md5Password.equals(tbUser.getPassword())){
            throw new IncorrectCredentialsException();
        }
        return tbUser;
    }
}
