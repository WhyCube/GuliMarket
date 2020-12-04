package com.why.mailware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.why.common.utils.PageUtils;
import com.why.mailware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 10:18:42
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

