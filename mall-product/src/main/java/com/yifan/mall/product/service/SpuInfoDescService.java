package com.yifan.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yifan.mall.common.utils.PageUtils;
import com.yifan.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Evan
 * @email m13813521795@163.com
 * @date 2021-04-08 10:03:52
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

