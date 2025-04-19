package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuizhushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuizhushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuizhushenqingView;


/**
 * 退住申请
 *
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface TuizhushenqingService extends IService<TuizhushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuizhushenqingVO> selectListVO(Wrapper<TuizhushenqingEntity> wrapper);
   	
   	TuizhushenqingVO selectVO(@Param("ew") Wrapper<TuizhushenqingEntity> wrapper);
   	
   	List<TuizhushenqingView> selectListView(Wrapper<TuizhushenqingEntity> wrapper);
   	
   	TuizhushenqingView selectView(@Param("ew") Wrapper<TuizhushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuizhushenqingEntity> wrapper);
   	
}

