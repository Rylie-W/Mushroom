package com.yw.mushmall.product;

import com.yw.mushmall.product.entity.BrandEntity;
import com.yw.mushmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MushmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
    }

}
