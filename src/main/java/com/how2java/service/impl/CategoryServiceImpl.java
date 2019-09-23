package com.how2java.service.impl;

import java.util.List;

import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
//普通分页的方法
//    public List<Category> list(Page page) {
//        return categoryMapper.list(page);
//    }

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

    @Override
    public int add(Category category) {
        return categoryMapper.add(category);
    }

    @Override
    public void delete(int id) {
        categoryMapper.delete(id);
    }

    @Override
    public int update(Category category) {
        return categoryMapper.update(category);
    }

    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    }

    public void deleteAll() {
        List<Category> cs = list();
        for (Category c : cs) {

            categoryMapper.delete(c.getId());
        }
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "Exception")
    public void addTwo() {

        Category c1 = new Category();
        c1.setName("短的名字");
        categoryMapper.add(c1);

        Category c2 = new Category();
        c2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,");
        categoryMapper.add(c2);
    }

    ;


//    @Override //普通分页的方法
//    public int total() {
//        return categoryMapper.total();
//    }

}