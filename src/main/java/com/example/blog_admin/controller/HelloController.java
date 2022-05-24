package com.example.blog_admin.controller;

import com.example.blog_admin.model.Article;
import com.example.blog_admin.model.Label;
import com.example.blog_admin.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Date;

@RestController
public class HelloController {

    private final ArticleServiceImpl articleServiceImpl;

    @Autowired
    public HelloController(ArticleServiceImpl articleServiceImpl) {
        this.articleServiceImpl = articleServiceImpl;
    }


    @RequestMapping("/insert")
    public String hello(){
//        Article article = new Article("大爱仙尊","古月房源微微一笑，不过是些许风霜罢了",new Date());
//        Label label = new Label("netNovel");
//        this.articleServiceImpl.insertBlogArticle(article,label);
        this.articleServiceImpl.deleteBlogArticle("大爱仙尊");
        return "插入成功";
    }

}
