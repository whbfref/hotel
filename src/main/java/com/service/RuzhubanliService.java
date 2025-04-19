package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuzhubanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuzhubanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuzhubanliView;


/**
 * 入住办理
 *
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface RuzhubanliService extends IService<RuzhubanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuzhubanliVO> selectListVO(Wrapper<RuzhubanliEntity> wrapper);
   	
   	RuzhubanliVO selectVO(@Param("ew") Wrapper<RuzhubanliEntity> wrapper);
   	
   	List<RuzhubanliView> selectListView(Wrapper<RuzhubanliEntity> wrapper);
   	
   	RuzhubanliView selectView(@Param("ew") Wrapper<RuzhubanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuzhubanliEntity> wrapper);
   	
}

