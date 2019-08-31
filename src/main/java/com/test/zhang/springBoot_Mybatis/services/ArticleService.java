package com.test.zhang.springBoot_Mybatis.services;


import com.test.zhang.springBoot_Mybatis.entity.Article;
import com.test.zhang.springBoot_Mybatis.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ArticleService {


     @Autowired
     private ArticleMapper articleMapper;


    public   int insertArticle(Article article){
/*        int id = 19;
        String id1 = String.valueOf(id);
        long value = Long.parseLong(id1);
        article.setId(value);*/

        article.setCreateTime(new Date());  //创建时间为当前时间
        int num = articleMapper.insert(article);
        return  num;
  }


}
