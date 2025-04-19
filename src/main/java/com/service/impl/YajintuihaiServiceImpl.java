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


import com.dao.YajintuihaiDao;
import com.entity.YajintuihaiEntity;
import com.service.YajintuihaiService;
import com.entity.vo.YajintuihaiVO;
import com.entity.view.YajintuihaiView;

@Service("yajintuihaiService")
public class YajintuihaiServiceImpl extends ServiceImpl<YajintuihaiDao, YajintuihaiEntity> implements YajintuihaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YajintuihaiEntity> page = this.selectPage(
                new Query<YajintuihaiEntity>(params).getPage(),
                new EntityWrapper<YajintuihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YajintuihaiEntity> wrapper) {
		  Page<YajintuihaiView> page =new Query<YajintuihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YajintuihaiVO> selectListVO(Wrapper<YajintuihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YajintuihaiVO selectVO(Wrapper<YajintuihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YajintuihaiView> selectListView(Wrapper<YajintuihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YajintuihaiView selectView(Wrapper<YajintuihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
