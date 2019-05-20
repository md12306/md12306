package com.qianfeng.md.service;

import com.qianfeng.md.bean.TbType;


public interface ITypeService {
    TbType selectSeatTableByName(String typeName);
}
