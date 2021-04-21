package com.yifan.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yifan.mall.common.utils.PageUtils;
import com.yifan.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author Evan
 * @email m13813521795@163.com
 * @date 2021-04-08 11:31:13
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

