package com.why.member.dao;

import com.why.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author why
 * @email 214770624@qq.com
 * @date 2020-12-04 10:05:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
