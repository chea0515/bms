package com.cc.bms.article.controller;

import com.cc.bms.article.service.ArticleServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "/bms/api/article" })
public class ArticleController {

    @Autowired
    private ArticleServiceManager articleService;


}
