package com.yifan.mall.product.dao;

import com.yifan.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Evan
 * @email m13813521795@163.com
 * @date 2021-04-08 10:03:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
