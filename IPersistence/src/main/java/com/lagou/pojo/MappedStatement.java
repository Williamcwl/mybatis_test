package com.lagou.pojo;

import com.lagou.config.SqlTypeEnum;

public class MappedStatement {

    //id标识
    private String id;
    //返回值类型
    private String resultType;
    //参数值类型
    private String paramterType;
    //sql语句
    private String sql;

    private SqlTypeEnum sqlType;

    public MappedStatement() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getParamterType() {
        return paramterType;
    }

    public void setParamterType(String paramterType) {
        this.paramterType = paramterType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SqlTypeEnum getSqlType() {
        return sqlType;
    }

    public void setSqlType(SqlTypeEnum sqlType) {
        this.sqlType = sqlType;
    }
}
