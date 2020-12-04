package com.why.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.why.common.utils.PageUtils;
import com.why.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 10:05:57
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

