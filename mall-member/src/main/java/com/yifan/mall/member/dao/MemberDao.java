package com.yifan.mall.member.dao;

import com.yifan.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Evan
 * @email m13813521795@163.com
 * @date 2021-04-08 11:44:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}