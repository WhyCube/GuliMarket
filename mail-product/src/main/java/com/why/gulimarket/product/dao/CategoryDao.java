package com.why.gulimarket.product.dao;

import com.why.gulimarket.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 10:13:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}