package com.cc.bms.base.utils;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class BmsPageResponse {
    private Boolean success = true;
    private Page page;

    @Getter
    @Setter
    private static class Page<T> {
        private Integer pageNo;
        private Integer pageSize;
        private Integer totalCount;
        private Integer totalPage;
        private T result;

        public Page withPageNo(Integer pageNo) {
            this.pageNo = pageNo;
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

        public Page withResult(T result) {
            this.result = result;
            return this;
        }
    }
}
