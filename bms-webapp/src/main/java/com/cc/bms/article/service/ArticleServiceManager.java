package com.cc.bms.article.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cc.bms.article.model.Article;
import com.cc.bms.article.vo.ArticleVO;
import com.cc.bms.base.exception.BmsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ArticleServiceManager {

    @Reference(version = "1.0.1")
    private ArticleService articleService;

    public List<ArticleVO> getArticle(ArticleVO articleVO) throws BmsException {
        try{
            List<Article> allArticleList = articleService.getAllArticleList();
            return null;
        } catch (Exception ex) {
            log.error("");
            throw new BmsException(ex);
        }
    }
}
