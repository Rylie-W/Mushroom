package com.yw.mushmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÃëÉ±»î¶¯³¡´Î
 * 
 * @author yw
 * @email yiwscu@outlook.com
 * @date 2021-09-01 23:10:04
 */
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ³¡´ÎÃû³Æ
	 */
	private String name;
	/**
	 * Ã¿ÈÕ¿ªÊ¼Ê±¼ä
	 */
	private Date startTime;
	/**
	 * Ã¿ÈÕ½áÊøÊ±¼ä
	 */
	private Date endTime;
	/**
	 * ÆôÓÃ×´Ì¬
	 */
	private Integer status;
	/**
	 * ´´½¨Ê±¼ä
	 */
	private Date createTime;

}
