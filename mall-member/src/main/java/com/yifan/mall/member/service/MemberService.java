package com.yifan.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yifan.mall.common.utils.PageUtils;
import com.yifan.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Evan
 * @email m13813521795@163.com
 * @date 2021-04-08 11:44:08
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

