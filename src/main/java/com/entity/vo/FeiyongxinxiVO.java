package com.entity.vo;

import com.entity.FeiyongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 费用信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public class FeiyongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 老人姓名
	 */
	
	private String laorenxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 床位费
	 */
	
	private Integer chuangweifei;
		
	/**
	 * 护理费
	 */
	
	private Integer hulifei;
		
	/**
	 * 餐饮费
	 */
	
	private Integer canyinfei;
		
	/**
	 * 空调暖气
	 */
	
	private Integer kongdiaonuanqi;
		
	/**
	 * 其他费用
	 */
	
	private Integer qitafeiyong;
		
	/**
	 * 总费用
	 */
	
	private String zongfeiyong;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：月份
	 */
	 
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
				
	
	/**
	 * 设置：床位费
	 */
	 
	public void setChuangweifei(Integer chuangweifei) {
		this.chuangweifei = chuangweifei;
	}
	
	/**
	 * 获取：床位费
	 */
	public Integer getChuangweifei() {
		return chuangweifei;
	}
				
	
	/**
	 * 设置：护理费
	 */
	 
	public void setHulifei(Integer hulifei) {
		this.hulifei = hulifei;
	}
	
	/**
	 * 获取：护理费
	 */
	public Integer getHulifei() {
		return hulifei;
	}
				
	
	/**
	 * 设置：餐饮费
	 */
	 
	public void setCanyinfei(Integer canyinfei) {
		this.canyinfei = canyinfei;
	}
	
	/**
	 * 获取：餐饮费
	 */
	public Integer getCanyinfei() {
		return canyinfei;
	}
				
	
	/**
	 * 设置：空调暖气
	 */
	 
	public void setKongdiaonuanqi(Integer kongdiaonuanqi) {
		this.kongdiaonuanqi = kongdiaonuanqi;
	}
	
	/**
	 * 获取：空调暖气
	 */
	public Integer getKongdiaonuanqi() {
		return kongdiaonuanqi;
	}
				
	
	/**
	 * 设置：其他费用
	 */
	 
	public void setQitafeiyong(Integer qitafeiyong) {
		this.qitafeiyong = qitafeiyong;
	}
	
	/**
	 * 获取：其他费用
	 */
	public Integer getQitafeiyong() {
		return qitafeiyong;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setZongfeiyong(String zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	
	/**
	 * 获取：总费用
	 */
	public String getZongfeiyong() {
		return zongfeiyong;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
