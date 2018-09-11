package com.cc.bms.article.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cc.bms.article.dao.ArticleDAO;
import com.cc.bms.article.model.Article;
import com.cc.bms.article.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@Service(version = "1.0.1")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDAO articleDAO;

    @Override
    public List<Article> getAllArticleList() {
        List<Article> articleList = articleDAO.select(null);
        return articleList;
    }

    @Override
    public List<Article> getArticleList(Article article) {
        log.info("getArticleList (articleId{})-->", article.getId());
        List<Article> articleList = articleDAO.select(article);
        System.out.println(articleList);
        return articleList;
    }

    @Override
    public List<Article> getArticlePage(Article article, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Article> list = articleDAO.select(article);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo.getList();
    }

    @Override
    public Integer getArticleCount(Article article) {
        return null;
    }

    @Override
    public Article getArticle(Article article) {
        return null;
    }

    @Override
    public Integer saveArticle(Article article) {
        return null;
    }

    @Override
    public Integer updateArticle(Article article) {
        return null;
    }

    @Override
    public Integer deleteArticle(Long id) {
        return null;
    }
}
