package com.yifan.mall.product;

import com.yifan.mall.product.entity.BrandEntity;
import com.yifan.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("亚信");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
