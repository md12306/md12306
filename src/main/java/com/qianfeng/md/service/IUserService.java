package com.qianfeng.md.service;

import com.qianfeng.md.bean.TbUser;

public interface IUserService {
    TbUser login(String username, String password) throws Exception;
}
