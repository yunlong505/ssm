package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.util.Page;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {

    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

 //   public List<Category> list(@Param("start")int start,@Param("count")int count);

    //  public List<Category> list(Page page);  //普通分页的方法

    public List<Category> list();

    public int count();

 //   public int total(); //普通分页的方法

}