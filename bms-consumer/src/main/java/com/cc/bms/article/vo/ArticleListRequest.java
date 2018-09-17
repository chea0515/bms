package com.cc.bms.article.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleListRequest {

    private String title;
    private Integer pageSize;
    private Integer pageNum;
}
