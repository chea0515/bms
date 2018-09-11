package com.cc.bms.article.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArticleVO {

    private String title;
    private String content;
    private List<String> label;
    private String createTime;
    private String updateTime;
}