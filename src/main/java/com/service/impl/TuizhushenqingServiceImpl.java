package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TuizhushenqingDao;
import com.entity.TuizhushenqingEntity;
import com.service.TuizhushenqingService;
import com.entity.vo.TuizhushenqingVO;
import com.entity.view.TuizhushenqingView;

@Service("tuizhushenqingService")
public class TuizhushenqingServiceImpl extends ServiceImpl<TuizhushenqingDao, TuizhushenqingEntity> implements TuizhushenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuizhushenqingEntity> page = this.selectPage(
                new Query<TuizhushenqingEntity>(params).getPage(),
                new EntityWrapper<TuizhushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuizhushenqingEntity> wrapper) {
		  Page<TuizhushenqingView> page =new Query<TuizhushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuizhushenqingVO> selectListVO(Wrapper<TuizhushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuizhushenqingVO selectVO(Wrapper<TuizhushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuizhushenqingView> selectListView(Wrapper<TuizhushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuizhushenqingView selectView(Wrapper<TuizhushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
