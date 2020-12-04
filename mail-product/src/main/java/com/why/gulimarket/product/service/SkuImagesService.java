package com.why.gulimarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.why.common.utils.PageUtils;
import com.why.gulimarket.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 10:13:26
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

