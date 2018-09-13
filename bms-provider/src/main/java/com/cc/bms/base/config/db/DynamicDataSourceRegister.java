package com.cc.bms.base.config.db;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

import javax.sql.DataSource;
import java.util.Map;

public class DynamicDataSourceRegister implements ImportBeanDefinitionRegistrar, EnvironmentAware {

    // 默认数据源
    private static final Object DATASOURCE_TYPE_DEFAULT = "org.apache.tomcat.jdbc.pool.DataSource";
    private DataSource defaultDataSource;

    @Override
    public void setEnvironment(Environment environment) {
        initDefaultDataSource(environment);
        initCustomDataSource(environment);
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

    }

    private void initDefaultDataSource(Environment environment) {
        //
    }

    private void initCustomDataSource(Environment environment) {
        //
    }

    private DataSource bindDataSource(Map<String, Object> dataSourceMap) {
        return null;
    }

    private void dataBinder() {
        //
    }
}
