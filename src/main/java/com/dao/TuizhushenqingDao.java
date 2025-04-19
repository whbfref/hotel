package com.dao;

import com.entity.TuizhushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuizhushenqingVO;
import com.entity.view.TuizhushenqingView;


/**
 * 退住申请
 * 
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface TuizhushenqingDao extends BaseMapper<TuizhushenqingEntity> {
	
	List<TuizhushenqingVO> selectListVO(@Param("ew") Wrapper<TuizhushenqingEntity> wrapper);
	
	TuizhushenqingVO selectVO(@Param("ew") Wrapper<TuizhushenqingEntity> wrapper);
	
	List<TuizhushenqingView> selectListView(@Param("ew") Wrapper<TuizhushenqingEntity> wrapper);

	List<TuizhushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<TuizhushenqingEntity> wrapper);
	
	TuizhushenqingView selectView(@Param("ew") Wrapper<TuizhushenqingEntity> wrapper);
	
}
