package com.why.mailorder.dao;

import com.why.mailorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-03 15:10:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
