package com.cc.bms.article.model;

import com.cc.bms.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Article extends BaseEntity {
    private static final long serialVersionUID = -5981027626795340512L;

    private Long id;
    private String title;
    private Date createTime;
    private Date updateTime;
    private String content;
}
