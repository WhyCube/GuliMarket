package com.why.coupon.dao;

import com.why.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 09:59:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
