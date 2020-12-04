package com.why.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.why.common.utils.PageUtils;
import com.why.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 10:05:57
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

