package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschuangweixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschuangweixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschuangweixinxiView;


/**
 * 床位信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface DiscusschuangweixinxiService extends IService<DiscusschuangweixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschuangweixinxiVO> selectListVO(Wrapper<DiscusschuangweixinxiEntity> wrapper);
   	
   	DiscusschuangweixinxiVO selectVO(@Param("ew") Wrapper<DiscusschuangweixinxiEntity> wrapper);
   	
   	List<DiscusschuangweixinxiView> selectListView(Wrapper<DiscusschuangweixinxiEntity> wrapper);
   	
   	DiscusschuangweixinxiView selectView(@Param("ew") Wrapper<DiscusschuangweixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschuangweixinxiEntity> wrapper);
   	
}

