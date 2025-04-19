package com.entity.view;

import com.entity.YajintuihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 押金退还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
@TableName("yajintuihai")
public class YajintuihaiView  extends YajintuihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YajintuihaiView(){
	}
 
 	public YajintuihaiView(YajintuihaiEntity yajintuihaiEntity){
 	try {
			BeanUtils.copyProperties(this, yajintuihaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
