package com.zln.bookkeeping.bean;

public class ConsumeTypeBean {
    private int consume_id;
    private String consume_name;
    private String mody_time;
    private String insert_time;
    private  String remark;
    private int del_type;

    public int getConsume_id() {
        return consume_id;
    }

    public void setConsume_id(int consume_id) {
        this.consume_id = consume_id;
    }

    public String getConsume_name() {
        return consume_name;
    }

    public void setConsume_name(String consume_name) {
        this.consume_name = consume_name;
    }

    public String getMody_time() {
        return mody_time;
    }

    public void setMody_time(String mody_time) {
        this.mody_time = mody_time;
    }

    public String getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(String insert_time) {
        this.insert_time = insert_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getDel_type() {
        return del_type;
    }

    public void setDel_type(int del_type) {
        this.del_type = del_type;
    }

    @Override
    public String toString() {
        return "ConsumeTypeBean{" +
                "consume_id=" + consume_id +
                ", consume_name='" + consume_name + '\'' +
                ", mody_time='" + mody_time + '\'' +
                ", insert_time='" + insert_time + '\'' +
                ", remark='" + remark + '\'' +
                ", del_type=" + del_type +
                '}';
    }






}
