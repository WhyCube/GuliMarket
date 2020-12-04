package com.why.mailorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.why.common.utils.PageUtils;
import com.why.mailorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-03 15:10:37
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

