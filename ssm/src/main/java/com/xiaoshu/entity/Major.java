package com.xiaoshu.entity;

public class Major {
    private Integer mid;
    private String mname;

    @Override
    public String toString() {
        return "Major{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
}
