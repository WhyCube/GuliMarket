package com.why.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.why.common.utils.PageUtils;
import com.why.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 10:05:56
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

