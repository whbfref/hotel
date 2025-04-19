package com.entity.model;

import com.entity.ChuangweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 床位信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public class ChuangweixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
