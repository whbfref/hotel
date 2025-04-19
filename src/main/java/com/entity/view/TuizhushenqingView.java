package com.entity.view;

import com.entity.TuizhushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退住申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
@TableName("tuizhushenqing")
public class TuizhushenqingView  extends TuizhushenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuizhushenqingView(){
	}
 
 	public TuizhushenqingView(TuizhushenqingEntity tuizhushenqingEntity){
 	try {
			BeanUtils.copyProperties(this, tuizhushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
