package com.example.blog_admin.mapper;

import com.example.blog_admin.model.Article;
import com.example.blog_admin.model.Label;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ArticleMapper {
    @Insert("insert into article(article_date, article_title, article_content) values(#{articleDate}, #{articleTitle}, #{articleContent})")
    void insertArticle(Article article);

    @Delete("delete  from article where article_title=#{articleName}")
    void deleteArticle(@Param("articleName") String articleName);

}
