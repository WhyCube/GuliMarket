package com.why.mailorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.why.common.utils.PageUtils;
import com.why.mailorder.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-03 15:10:37
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

