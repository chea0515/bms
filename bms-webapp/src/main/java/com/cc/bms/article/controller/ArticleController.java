package com.cc.bms.article.controller;

import com.cc.bms.article.service.ArticleServiceManager;
import com.cc.bms.article.vo.ArticleListRequest;
import com.cc.bms.article.vo.ArticleVO;
import com.cc.bms.base.exception.BmsException;
import com.cc.utils.Result;
import com.cc.utils.ResultPage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = { "/bms/api/article" })
public class ArticleController {

    @Autowired
    private ArticleServiceManager articleService;

    @PostMapping(value = "/alllist")
    public Result<List<ArticleVO>> allList() {
        log.info("article all list start:");
        try {
            Result<List<ArticleVO>> response = new Result<>();
            List<ArticleVO>  allList = articleService.getArticleAllList();
            response.setResult(allList);
            return response;
        } catch (BmsException ex) {
            log.error("article all list error:{}", ex.getMessage());
            throw new BmsException(ex);
        }
    }

    @SuppressWarnings({"unchecked"})
    @PostMapping(value = "/list")
    public ResultPage<ArticleVO> list(@RequestBody ArticleListRequest request) {
        log.info("article list start:");
        try {
            ResultPage<ArticleVO> response = new ResultPage<>();
            List<ArticleVO>  allList = articleService.getArticleList(null);
            response.getPage()
                    .withPageNum(request.getPageNum())
                    .withPageSize(request.getPageSize())
                    .withResult(allList);
            return response;
        } catch (BmsException ex) {
            log.error("article list error:{}", ex.getMessage());
            throw new BmsException(ex);
        }
    }
}
