package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuangweixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuangweixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuangweixinxiView;


/**
 * 床位信息
 *
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface ChuangweixinxiService extends IService<ChuangweixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuangweixinxiVO> selectListVO(Wrapper<ChuangweixinxiEntity> wrapper);
   	
   	ChuangweixinxiVO selectVO(@Param("ew") Wrapper<ChuangweixinxiEntity> wrapper);
   	
   	List<ChuangweixinxiView> selectListView(Wrapper<ChuangweixinxiEntity> wrapper);
   	
   	ChuangweixinxiView selectView(@Param("ew") Wrapper<ChuangweixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuangweixinxiEntity> wrapper);
   	
}

