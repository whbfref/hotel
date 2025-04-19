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


import com.dao.RuzhushenqingDao;
import com.entity.RuzhushenqingEntity;
import com.service.RuzhushenqingService;
import com.entity.vo.RuzhushenqingVO;
import com.entity.view.RuzhushenqingView;

@Service("ruzhushenqingService")
public class RuzhushenqingServiceImpl extends ServiceImpl<RuzhushenqingDao, RuzhushenqingEntity> implements RuzhushenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuzhushenqingEntity> page = this.selectPage(
                new Query<RuzhushenqingEntity>(params).getPage(),
                new EntityWrapper<RuzhushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuzhushenqingEntity> wrapper) {
		  Page<RuzhushenqingView> page =new Query<RuzhushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuzhushenqingVO> selectListVO(Wrapper<RuzhushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuzhushenqingVO selectVO(Wrapper<RuzhushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuzhushenqingView> selectListView(Wrapper<RuzhushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuzhushenqingView selectView(Wrapper<RuzhushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
