package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 床位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
@TableName("chuangweixinxi")
public class ChuangweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChuangweixinxiEntity() {
		
	}
	
	public ChuangweixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 床位编号
	 */
					
	private String chuangweibianhao;
	
	/**
	 * 位置
	 */
					
	private String weizhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 每月价格
	 */
					
	private Integer meiyuejiage;
	
	/**
	 * 费用包含
	 */
					
	private String feiyongbaohan;
	
	/**
	 * 床位状态
	 */
					
	private String chuangweizhuangtai;
	
	/**
	 * 押金
	 */
					
	private Integer yajin;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：床位编号
	 */
	public void setChuangweibianhao(String chuangweibianhao) {
		this.chuangweibianhao = chuangweibianhao;
	}
	/**
	 * 获取：床位编号
	 */
	public String getChuangweibianhao() {
		return chuangweibianhao;
	}
	/**
	 * 设置：位置
	 */
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：每月价格
	 */
	public void setMeiyuejiage(Integer meiyuejiage) {
		this.meiyuejiage = meiyuejiage;
	}
	/**
	 * 获取：每月价格
	 */
	public Integer getMeiyuejiage() {
		return meiyuejiage;
	}
	/**
	 * 设置：费用包含
	 */
	public void setFeiyongbaohan(String feiyongbaohan) {
		this.feiyongbaohan = feiyongbaohan;
	}
	/**
	 * 获取：费用包含
	 */
	public String getFeiyongbaohan() {
		return feiyongbaohan;
	}
	/**
	 * 设置：床位状态
	 */
	public void setChuangweizhuangtai(String chuangweizhuangtai) {
		this.chuangweizhuangtai = chuangweizhuangtai;
	}
	/**
	 * 获取：床位状态
	 */
	public String getChuangweizhuangtai() {
		return chuangweizhuangtai;
	}
	/**
	 * 设置：押金
	 */
	public void setYajin(Integer yajin) {
		this.yajin = yajin;
	}
	/**
	 * 获取：押金
	 */
	public Integer getYajin() {
		return yajin;
	}

}
