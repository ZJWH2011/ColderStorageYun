package com.example.demo.entity;

import java.util.Date;

public class MotorInfo {
    private int id;
    private String serial;
    private int stepsX;
    private int stepsY;
    private int stepsZ;
    private Date genTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getStepsX() {
        return stepsX;
    }

    public void setStepsX(int stepsX) {
        this.stepsX = stepsX;
    }

    public int getStepsY() {
        return stepsY;
    }

    public void setStepsY(int stepsY) {
        this.stepsY = stepsY;
    }

    public int getStepsZ() {
        return stepsZ;
    }

    public void setStepsZ(int stepsZ) {
        this.stepsZ = stepsZ;
    }

    public Date getGenTime() {
        return genTime;
    }

    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }
}
