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
 * 来访登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
@TableName("laifangdengji")
public class LaifangdengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LaifangdengjiEntity() {
		
	}
	
	public LaifangdengjiEntity(T t) {
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
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 老人年龄
	 */
					
	private String laorennianling;
	
	/**
	 * 来访人
	 */
					
	private String laifangren;
	
	/**
	 * 来访时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date laifangshijian;
	
	/**
	 * 来访时长
	 */
					
	private Float laifangshizhang;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
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
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：老人年龄
	 */
	public void setLaorennianling(String laorennianling) {
		this.laorennianling = laorennianling;
	}
	/**
	 * 获取：老人年龄
	 */
	public String getLaorennianling() {
		return laorennianling;
	}
	/**
	 * 设置：来访人
	 */
	public void setLaifangren(String laifangren) {
		this.laifangren = laifangren;
	}
	/**
	 * 获取：来访人
	 */
	public String getLaifangren() {
		return laifangren;
	}
	/**
	 * 设置：来访时间
	 */
	public void setLaifangshijian(Date laifangshijian) {
		this.laifangshijian = laifangshijian;
	}
	/**
	 * 获取：来访时间
	 */
	public Date getLaifangshijian() {
		return laifangshijian;
	}
	/**
	 * 设置：来访时长
	 */
	public void setLaifangshizhang(Float laifangshizhang) {
		this.laifangshizhang = laifangshizhang;
	}
	/**
	 * 获取：来访时长
	 */
	public Float getLaifangshizhang() {
		return laifangshizhang;
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

}
