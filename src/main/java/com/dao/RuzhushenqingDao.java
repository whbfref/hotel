package com.dao;

import com.entity.RuzhushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuzhushenqingVO;
import com.entity.view.RuzhushenqingView;


/**
 * 入住申请
 * 
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface RuzhushenqingDao extends BaseMapper<RuzhushenqingEntity> {
	
	List<RuzhushenqingVO> selectListVO(@Param("ew") Wrapper<RuzhushenqingEntity> wrapper);
	
	RuzhushenqingVO selectVO(@Param("ew") Wrapper<RuzhushenqingEntity> wrapper);
	
	List<RuzhushenqingView> selectListView(@Param("ew") Wrapper<RuzhushenqingEntity> wrapper);

	List<RuzhushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<RuzhushenqingEntity> wrapper);
	
	RuzhushenqingView selectView(@Param("ew") Wrapper<RuzhushenqingEntity> wrapper);
	
}
