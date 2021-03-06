package com.qianfeng.md.dao;

import com.qianfeng.md.bean.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface IUserMapper {
   TbUser checkUsername(@Param("username") String username);
   List<TbUser> queryAllUsers();
}
