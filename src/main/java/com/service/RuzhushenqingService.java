package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuzhushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuzhushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuzhushenqingView;


/**
 * 入住申请
 *
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface RuzhushenqingService extends IService<RuzhushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuzhushenqingVO> selectListVO(Wrapper<RuzhushenqingEntity> wrapper);
   	
   	RuzhushenqingVO selectVO(@Param("ew") Wrapper<RuzhushenqingEntity> wrapper);
   	
   	List<RuzhushenqingView> selectListView(Wrapper<RuzhushenqingEntity> wrapper);
   	
   	RuzhushenqingView selectView(@Param("ew") Wrapper<RuzhushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuzhushenqingEntity> wrapper);
   	
}

