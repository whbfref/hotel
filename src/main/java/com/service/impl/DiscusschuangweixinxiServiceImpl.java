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


import com.dao.DiscusschuangweixinxiDao;
import com.entity.DiscusschuangweixinxiEntity;
import com.service.DiscusschuangweixinxiService;
import com.entity.vo.DiscusschuangweixinxiVO;
import com.entity.view.DiscusschuangweixinxiView;

@Service("discusschuangweixinxiService")
public class DiscusschuangweixinxiServiceImpl extends ServiceImpl<DiscusschuangweixinxiDao, DiscusschuangweixinxiEntity> implements DiscusschuangweixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschuangweixinxiEntity> page = this.selectPage(
                new Query<DiscusschuangweixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusschuangweixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschuangweixinxiEntity> wrapper) {
		  Page<DiscusschuangweixinxiView> page =new Query<DiscusschuangweixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschuangweixinxiVO> selectListVO(Wrapper<DiscusschuangweixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschuangweixinxiVO selectVO(Wrapper<DiscusschuangweixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschuangweixinxiView> selectListView(Wrapper<DiscusschuangweixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschuangweixinxiView selectView(Wrapper<DiscusschuangweixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
