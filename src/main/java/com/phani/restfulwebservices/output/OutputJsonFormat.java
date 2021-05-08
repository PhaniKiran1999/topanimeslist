package com.phani.restfulwebservices.output;

import java.util.List;

public class OutputJsonFormat {
    private List<Result> top;

    public OutputJsonFormat() {
    }

    public OutputJsonFormat(List<Result> top) {
        this.top = top;
    }

    public List<Result> getTop() {
        return top;
    }

    public void setTop(List<Result> top) {
        this.top = top;
    }
    
}
