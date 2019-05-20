package com.qianfeng.md.service;

import com.qianfeng.md.bean.TbUser;

import java.util.List;

public interface IUserService {
    TbUser login(String username, String password) throws Exception;
    List<TbUser> queryAllUsers();
}
