package com.why.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.why.common.utils.PageUtils;
import com.why.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 09:59:22
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

