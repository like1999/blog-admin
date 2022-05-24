package com.example.blog_admin.service.impl;

import com.example.blog_admin.mapper.ArticleMapper;
import com.example.blog_admin.mapper.LabelMapper;
import com.example.blog_admin.model.Article;
import com.example.blog_admin.model.Label;
import com.example.blog_admin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    private final LabelMapper labelMapper;

    @Autowired
    public ArticleServiceImpl(ArticleMapper articleMapper, LabelMapper labelMapper) {
        this.articleMapper = articleMapper;
        this.labelMapper = labelMapper;
    }

    /**
     *
     */
    @Override
    public void insertBlogArticle(Article article, Label label) {
        articleMapper.insertArticle(article);
        labelMapper.insertLabel(label);
    }

    /**
     * @param articleName
     */
    @Override
    public void deleteBlogArticle(String articleName) {
        articleMapper.deleteArticle(articleName);

    }
}
