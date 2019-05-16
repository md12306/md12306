package com.qianfeng.md.shiro;


import com.qianfeng.md.bean.TbUser;
import com.qianfeng.md.dao.IUserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private IUserMapper iUserMapper;

    /**
     * 权限查询
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 登录认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //登录的业务逻辑
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        char[] chars = usernamePasswordToken.getPassword();
        String password = new String(chars);
        TbUser tbUser = iUserMapper.checkUsername(username);
        if (tbUser == null) {
            throw new UnknownAccountException();
        }
        SecurityUtils.getSubject().getSession().setAttribute("user",tbUser);
        return new SimpleAuthenticationInfo(username,password,"myrealm");
    }
}
