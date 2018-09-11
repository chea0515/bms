package com.cc.bms.article.service;

import com.cc.bms.article.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticleList();

    List<Article> getArticleList(Article article);

    Article getArticle(Article article);

    Integer saveArticle(Article article);

    Integer updateArticle(Article article);

    Integer deleteArticle(Long id);
}
