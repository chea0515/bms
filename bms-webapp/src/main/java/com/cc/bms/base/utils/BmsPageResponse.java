package com.cc.bms.base.utils;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.LinkedList;

@Getter
public class BmsPageResponse<T> {
    private Boolean success = true;
    private Page<T> page = new Page<>();

    @Getter
    @Setter
    private static class Page<T> {
        private Integer pageNum;
        private Integer pageSize;
        private Integer totalCount;
        private Collection<T> result;

        public Page withPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        public Page withPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Page withTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Page withResult(Collection<T> result) {
            if(CollectionUtils.isEmpty(result)) {
                this.result= new LinkedList<>();
            } else {
                this.result = result;
            }
            return this;
        }

        public Integer getTotalPage() {
            if(totalCount > 0 && pageSize > 0) {
                return (totalCount % pageSize == 0) ?
                        (totalCount / pageSize) : (totalCount / pageSize) + 1;

            }
            return 0;
        }
    }
}
