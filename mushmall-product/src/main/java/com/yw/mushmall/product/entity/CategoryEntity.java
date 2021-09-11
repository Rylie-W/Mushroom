package com.yw.mushmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÉÌÆ·Èý¼¶·ÖÀà
 * 
 * @author yw
 * @email yiwscu@outlook.com
 * @date 2021-09-01 23:34:49
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ·ÖÀàid
	 */
	@TableId
	private Long catId;
	/**
	 * ·ÖÀàÃû³Æ
	 */
	private String name;
	/**
	 * ¸¸·ÖÀàid
	 */
	private Long parentCid;
	/**
	 * ²ã¼¶
	 */
	private Integer catLevel;
	/**
	 * ÊÇ·ñÏÔÊ¾[0-²»ÏÔÊ¾£¬1ÏÔÊ¾]
	 */
	private Integer showStatus;
	/**
	 * ÅÅÐò
	 */
	private Integer sort;
	/**
	 * Í¼±êµØÖ·
	 */
	private String icon;
	/**
	 * ¼ÆÁ¿µ¥Î»
	 */
	private String productUnit;
	/**
	 * ÉÌÆ·ÊýÁ¿
	 */
	private Integer productCount;

}
