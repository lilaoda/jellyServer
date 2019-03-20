package com.lhy.springdemo2.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Druid监控过滤器
 */
@WebFilter(
        filterName="druidStatFilter",
        urlPatterns = "/*",
        initParams = {
        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*"),// 忽略资源
})
public class DruidStartFilter extends WebStatFilter {
}
