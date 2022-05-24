package com.example.blog_admin.service;

import com.example.blog_admin.model.Article;
import com.example.blog_admin.model.Label;

public interface ArticleService {
    public void insertBlogArticle(Article article, Label label);

    public void deleteBlogArticle(String articleName);
}
