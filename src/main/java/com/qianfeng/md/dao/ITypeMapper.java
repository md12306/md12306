package com.qianfeng.md.dao;

import com.qianfeng.md.bean.TbType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ITypeMapper {

   TbType selectSeatTableByName(@Param("typeName") String typeName);
}
