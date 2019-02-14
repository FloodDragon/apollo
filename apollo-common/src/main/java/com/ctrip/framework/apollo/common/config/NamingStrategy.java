package com.ctrip.framework.apollo.common.config;

import org.hibernate.cfg.DefaultNamingStrategy;

/**
 * Created by liuj-ai on 2019/2/14.
 */
public class NamingStrategy extends DefaultNamingStrategy {

    private static final long serialVersionUID = 1L;

    @Override
    public String tableName(String tableName) {
        return tableName.toLowerCase();
    }

    @Override
    public String columnName(String columnName) {
        return super.columnName(columnName).toLowerCase();
    }

    @Override
    public String propertyToColumnName(String propertyName) {
        return super.propertyToColumnName(propertyName).toLowerCase();
    }
}
