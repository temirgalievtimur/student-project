package edu.JavaCourse.studentOrder.domain;

import edu.JavaCourse.studentOrder.other.Adult;

public class StudentOrder {
    private long sudentOrderId;
    private Adult huband;
    private Adult wife;

    public long getSudentOrderId() {
        return sudentOrderId;
    }

    public void setSudentOrderId(long sudentOrderId) {
        this.sudentOrderId = sudentOrderId;
    }

    public Adult getHuband() {
        return huband;
    }

    public void setHuband(Adult huband) {
        this.huband = huband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    private Child child;
}
