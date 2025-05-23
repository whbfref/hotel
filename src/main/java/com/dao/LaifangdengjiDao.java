package com.dao;

import com.entity.LaifangdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaifangdengjiVO;
import com.entity.view.LaifangdengjiView;


/**
 * 来访登记
 * 
 * @author 
 * @email 
 * @date 2021-03-02 18:52:59
 */
public interface LaifangdengjiDao extends BaseMapper<LaifangdengjiEntity> {
	
	List<LaifangdengjiVO> selectListVO(@Param("ew") Wrapper<LaifangdengjiEntity> wrapper);
	
	LaifangdengjiVO selectVO(@Param("ew") Wrapper<LaifangdengjiEntity> wrapper);
	
	List<LaifangdengjiView> selectListView(@Param("ew") Wrapper<LaifangdengjiEntity> wrapper);

	List<LaifangdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<LaifangdengjiEntity> wrapper);
	
	LaifangdengjiView selectView(@Param("ew") Wrapper<LaifangdengjiEntity> wrapper);
	
}
