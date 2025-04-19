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


import com.dao.RuzhubanliDao;
import com.entity.RuzhubanliEntity;
import com.service.RuzhubanliService;
import com.entity.vo.RuzhubanliVO;
import com.entity.view.RuzhubanliView;

@Service("ruzhubanliService")
public class RuzhubanliServiceImpl extends ServiceImpl<RuzhubanliDao, RuzhubanliEntity> implements RuzhubanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuzhubanliEntity> page = this.selectPage(
                new Query<RuzhubanliEntity>(params).getPage(),
                new EntityWrapper<RuzhubanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuzhubanliEntity> wrapper) {
		  Page<RuzhubanliView> page =new Query<RuzhubanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuzhubanliVO> selectListVO(Wrapper<RuzhubanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuzhubanliVO selectVO(Wrapper<RuzhubanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuzhubanliView> selectListView(Wrapper<RuzhubanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuzhubanliView selectView(Wrapper<RuzhubanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
