package com.itzyh.pojo;

public class Classes {
    private int agentID;  // 对应工号（房产经纪人ID）
    private String agentName;  // 房产经纪人姓名
    private String agentAddress;  // 家庭住址
    private String phone;  // 手机
    @Override
    public String toString() {
        return "Classes{" +
                "agentID=" + agentID +
                ", agentName=" + agentName + '\'' +
                ", agentAddress=" + agentAddress + '\'' +
                ", phone=" + phone+
                '}';
    }
    // 生成对应的getter和setter方法
    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentAddress() {
        return agentAddress;
    }

    public void setAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}



