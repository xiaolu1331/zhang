package com.test.zhang.springBoot_Mybatis.mapper;


import com.test.zhang.springBoot_Mybatis.entity.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper {


    int insert(Article article);


}