package com.cc.bms.article.vo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class ArticleListRequest {

    private String title;
    @NotEmpty
    private Integer pageSize;
    @NotEmpty
    private Integer pageNum;
}
