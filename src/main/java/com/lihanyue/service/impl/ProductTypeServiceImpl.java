package com.lihanyue.service.impl;

import com.lihanyue.mapper.ProductTypeMapper;
import com.lihanyue.pojo.ProductType;
import com.lihanyue.pojo.ProductTypeExample;
import com.lihanyue.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductTypeServiceImpl")
public class ProductTypeServiceImpl implements ProductTypeService {

    //在业务逻辑层一定会有数据访问层的对象
    @Autowired
    ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductType> getAll() {
        return productTypeMapper.selectByExample(new ProductTypeExample());
    }
}
