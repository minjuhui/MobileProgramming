package com.example.customview;

public class Student {
    String mName = ""; // 이름
    String mNum = ""; // 학번
    String mDept = ""; // 학과

    public Student (String name, String num, String dept){
        this.mName=name;
        this.mNum=num;
        this.mDept=dept;
    }

    public Student(){}
}
