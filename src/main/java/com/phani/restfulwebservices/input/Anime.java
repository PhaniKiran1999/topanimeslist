package com.phani.restfulwebservices.input;

import java.util.List;

public class Anime {

    private String request_hash;
    private Boolean request_cached;
    private Long request_cache_expiry;
    private List<Top> top = null;

    public String getRequest_hash() {
        return request_hash;
    }

    public void setRequest_hash(String request_hash) {
        this.request_hash = request_hash;
    }

    public Boolean getRequest_cached() {
        return request_cached;
    }

    public void setRequest_cached(Boolean request_cached) {
        this.request_cached = request_cached;
    }

    public Long getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public void setRequest_cache_expiry(Long request_cache_expiry) {
        this.request_cache_expiry = request_cache_expiry;
    }

    public List<Top> getTop() {
        return top;
    }

    public void setTop(List<Top> top) {
        this.top = top;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Anime.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("request_hash");
        sb.append('=');
        sb.append(((this.request_hash == null) ? "<null>" : this.request_hash));
        sb.append(',');
        sb.append("request_cached");
        sb.append('=');
        sb.append(((this.request_cached == null) ? "<null>" : this.request_cached));
        sb.append(',');
        sb.append("request_cache_expiry");
        sb.append('=');
        sb.append(((this.request_cache_expiry == null) ? "<null>" : this.request_cache_expiry));
        sb.append(',');
        sb.append("top");
        sb.append('=');
        sb.append(((this.top == null) ? "<null>" : this.top));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}