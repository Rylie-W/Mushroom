package com.yw.mushmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÃëÉ±»î¶¯
 * 
 * @author yw
 * @email yiwscu@outlook.com
 * @date 2021-09-01 23:10:04
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * »î¶¯±êÌâ
	 */
	private String title;
	/**
	 * ¿ªÊ¼ÈÕÆÚ
	 */
	private Date startTime;
	/**
	 * ½áÊøÈÕÆÚ
	 */
	private Date endTime;
	/**
	 * ÉÏÏÂÏß×´Ì¬
	 */
	private Integer status;
	/**
	 * ´´½¨Ê±¼ä
	 */
	private Date createTime;
	/**
	 * ´´½¨ÈË
	 */
	private Long userId;

}
