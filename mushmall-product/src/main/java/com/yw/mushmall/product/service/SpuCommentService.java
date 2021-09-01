package com.yw.mushmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yw.common.utils.PageUtils;
import com.yw.mushmall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * ÉÌÆ·ÆÀ¼Û
 *
 * @author yw
 * @email yiwscu@outlook.com
 * @date 2021-09-01 17:33:37
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

