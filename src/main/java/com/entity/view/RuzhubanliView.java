package com.entity.view;

import com.entity.RuzhubanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入住办理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
@TableName("ruzhubanli")
public class RuzhubanliView  extends RuzhubanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuzhubanliView(){
	}
 
 	public RuzhubanliView(RuzhubanliEntity ruzhubanliEntity){
 	try {
			BeanUtils.copyProperties(this, ruzhubanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
