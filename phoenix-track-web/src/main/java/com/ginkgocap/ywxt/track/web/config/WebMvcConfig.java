package com.ginkgocap.ywxt.track.web.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.ginkgocap.ywxt.excel.export.ExcelExportImpl;
import com.google.common.collect.ImmutableList;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by gintong on 2017/9/4.
 */
@Configuration
@Import({DataSourceConfig.class})
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ServletRegistrationBean druidStatViewRegistrationBean() {
        StatViewServlet statViewServlet = new StatViewServlet();

        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.setName("druidStatView");
        registrationBean.setServlet(statViewServlet);
        registrationBean.setUrlMappings(ImmutableList.of("/druid/*"));
        registrationBean.addInitParameter("allow", "127.0.0.1,192.168.0.1/24,114.112.127.106");

        return registrationBean;
    }

    @Bean("ExcelExport")
    public ExcelExportImpl excelExport() {
        return new ExcelExportImpl();
    }
}
