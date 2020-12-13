package com.why.gulimarket.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.why.common.utils.PageUtils;
import com.why.common.utils.Query;

import com.why.gulimarket.product.dao.CategoryDao;
import com.why.gulimarket.product.entity.CategoryEntity;
import com.why.gulimarket.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        //组装成父子的树形结构

        List<CategoryEntity> level1menus = categoryEntities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0).map((menu)->{
                    menu.setChild(getChild(menu,categoryEntities));
                    return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());


        return level1menus;


    }

    @Override
    public boolean removeMenuByIds(List<Long> asList) {
        //Todo 检查当前菜单是否被其他调用


        if(baseMapper.deleteBatchIds(asList)>0)
            return true;
        else
            return false;
    }

    private List<CategoryEntity> getChild(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> child = all.stream().filter(menu -> menu.getParentCid() == root.getCatId()).map(menu -> {
            menu.setChild(getChild(menu,all));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return child;
    }


}