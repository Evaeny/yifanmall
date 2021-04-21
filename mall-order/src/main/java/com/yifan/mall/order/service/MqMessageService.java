package com.yifan.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yifan.mall.common.utils.PageUtils;
import com.yifan.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author Evan
 * @email m13813521795@163.com
 * @date 2021-04-08 11:37:30
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

