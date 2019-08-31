package com.test.zhang.springBoot_Mybatis.controller;

import com.test.zhang.springBoot_Mybatis.entity.Article;
import com.test.zhang.springBoot_Mybatis.model.AjaxResponse;
import com.test.zhang.springBoot_Mybatis.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

/**
 * @author admin
 * @Title: null.java
 * @Package com.test.zhang.springBoot_Mybatis.controller
 * @Description:
 * @date 2019/8/31 19:10
 */

@RestController
@RequestMapping("crud")
public class ArticleController {


    @Autowired
    private ArticleService articleService;

    @PostMapping("/add")
    public AjaxResponse add(@RequestBody Article article){
        int num = articleService.insertArticle(article);
        if(num>0){
            return AjaxResponse.success("恭喜您!添加成功!" + num) ;
        }else {
            return AjaxResponse.success("对不起，添加失败!请稍后重试" + num);
        }
    }
}
