package com.yw.mushmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yw.common.utils.PageUtils;
import com.yw.mushmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spuÐÅÏ¢
 *
 * @author yw
 * @email yiwscu@outlook.com
 * @date 2021-09-01 17:33:36
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

