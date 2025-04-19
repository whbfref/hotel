package com.dao;

import com.entity.RuzhubanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuzhubanliVO;
import com.entity.view.RuzhubanliView;


/**
 * 入住办理
 * 
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface RuzhubanliDao extends BaseMapper<RuzhubanliEntity> {
	
	List<RuzhubanliVO> selectListVO(@Param("ew") Wrapper<RuzhubanliEntity> wrapper);
	
	RuzhubanliVO selectVO(@Param("ew") Wrapper<RuzhubanliEntity> wrapper);
	
	List<RuzhubanliView> selectListView(@Param("ew") Wrapper<RuzhubanliEntity> wrapper);

	List<RuzhubanliView> selectListView(Pagination page,@Param("ew") Wrapper<RuzhubanliEntity> wrapper);
	
	RuzhubanliView selectView(@Param("ew") Wrapper<RuzhubanliEntity> wrapper);
	
}
