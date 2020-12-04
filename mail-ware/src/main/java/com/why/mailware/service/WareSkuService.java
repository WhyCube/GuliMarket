package com.why.mailware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.why.common.utils.PageUtils;
import com.why.mailware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 10:18:42
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

