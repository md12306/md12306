package com.qianfeng.md.dao;

import com.qianfeng.md.bean.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface IUserMapper {
   TbUser checkUsername(@Param("username") String username);
}
