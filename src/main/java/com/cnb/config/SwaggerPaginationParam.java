package com.cnb.config;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Pagination")
public class SwaggerPaginationParam {

    @Schema(defaultValue = "1")
    private int page = 1;

    @Schema(defaultValue = "100")
    private int pageSize = 100;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
