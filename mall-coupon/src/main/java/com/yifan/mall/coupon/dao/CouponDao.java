package com.yifan.mall.coupon.dao;

import com.yifan.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Evan
 * @email m13813521795@163.com
 * @date 2021-04-08 11:31:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
