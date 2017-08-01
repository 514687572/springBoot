package com.beyond.net.domain;

import java.io.Serializable;

import com.stip.mybatis.generator.plugin.BaseModel;

public class BIplog extends BaseModel<String> implements Serializable {
    private String ip;

    private String api;

    private static final long serialVersionUID = 1L;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api == null ? null : api.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ip=").append(ip);
        sb.append(", api=").append(api);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return result;
    }
}