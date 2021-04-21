package com.yifan.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yifan.mall.common.utils.PageUtils;
import com.yifan.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author Evan
 * @email m13813521795@163.com
 * @date 2021-04-08 11:37:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

