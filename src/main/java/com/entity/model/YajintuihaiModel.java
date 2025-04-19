package com.entity.model;

import com.entity.YajintuihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 押金退还
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public class YajintuihaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
