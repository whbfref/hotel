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
 * 押金退还
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
@TableName("yajintuihai")
public class YajintuihaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YajintuihaiEntity() {
		
	}
	
	public YajintuihaiEntity(T t) {
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
	 * 押金
	 */
					
	private String yajin;
	
	/**
	 * 退还押金
	 */
					
	private Integer tuihaiyajin;
	
	/**
	 * 退还日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tuihairiqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
	
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
	 * 设置：押金
	 */
	public void setYajin(String yajin) {
		this.yajin = yajin;
	}
	/**
	 * 获取：押金
	 */
	public String getYajin() {
		return yajin;
	}
	/**
	 * 设置：退还押金
	 */
	public void setTuihaiyajin(Integer tuihaiyajin) {
		this.tuihaiyajin = tuihaiyajin;
	}
	/**
	 * 获取：退还押金
	 */
	public Integer getTuihaiyajin() {
		return tuihaiyajin;
	}
	/**
	 * 设置：退还日期
	 */
	public void setTuihairiqi(Date tuihairiqi) {
		this.tuihairiqi = tuihairiqi;
	}
	/**
	 * 获取：退还日期
	 */
	public Date getTuihairiqi() {
		return tuihairiqi;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：老人姓名
	 */
	public void setLaorenxingming(String laorenxingming) {
		this.laorenxingming = laorenxingming;
	}
	/**
	 * 获取：老人姓名
	 */
	public String getLaorenxingming() {
		return laorenxingming;
	}

}
