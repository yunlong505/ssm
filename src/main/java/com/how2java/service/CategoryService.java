package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

public interface CategoryService {

  //  List<Category> list(Page page); //普通分页的方法
    List<Category> list();
  //  int total(); //普通分页的方法

    int add(Category category);
    void delete(int id);
    int update(Category category);
    Category get(int id);

    //练习事务
    void addTwo();
    void deleteAll();
}