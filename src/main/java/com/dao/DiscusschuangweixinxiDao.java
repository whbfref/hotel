package com.dao;

import com.entity.DiscusschuangweixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschuangweixinxiVO;
import com.entity.view.DiscusschuangweixinxiView;


/**
 * 床位信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface DiscusschuangweixinxiDao extends BaseMapper<DiscusschuangweixinxiEntity> {
	
	List<DiscusschuangweixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusschuangweixinxiEntity> wrapper);
	
	DiscusschuangweixinxiVO selectVO(@Param("ew") Wrapper<DiscusschuangweixinxiEntity> wrapper);
	
	List<DiscusschuangweixinxiView> selectListView(@Param("ew") Wrapper<DiscusschuangweixinxiEntity> wrapper);

	List<DiscusschuangweixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschuangweixinxiEntity> wrapper);
	
	DiscusschuangweixinxiView selectView(@Param("ew") Wrapper<DiscusschuangweixinxiEntity> wrapper);
	
}
