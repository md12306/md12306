package com.qianfeng.md.serviceImpl;

import com.qianfeng.md.bean.TbType;
import com.qianfeng.md.dao.ITypeMapper;
import com.qianfeng.md.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TypeServiceImpl implements ITypeService {
    @Autowired
    private ITypeMapper iTypeMapper;
    @Override
    public TbType selectSeatTableByName(String typeName) {
        TbType type = iTypeMapper.selectSeatTableByName(typeName);
        return type;
    }
}
