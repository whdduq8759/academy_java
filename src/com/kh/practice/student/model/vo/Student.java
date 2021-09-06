package com.kh.practice.student.model.vo;

public class Student {
    //필드
    private String name; //이름
    private String subject; //과목
    private int score; //점수

    //생성자 (알트 + 인설트)
    public Student() {


    }

    public Student(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }


    //메소드

    public String inform() {
        return this.name + "|" + this.subject + "|" + this.score;


    }



    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // getter
    public String getName() {
        return name;
    }


    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

}

