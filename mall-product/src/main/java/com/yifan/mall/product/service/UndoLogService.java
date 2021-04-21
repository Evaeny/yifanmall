package com.yifan.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yifan.mall.common.utils.PageUtils;
import com.yifan.mall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Evan
 * @email m13813521795@163.com
 * @date 2021-04-08 10:03:52
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

