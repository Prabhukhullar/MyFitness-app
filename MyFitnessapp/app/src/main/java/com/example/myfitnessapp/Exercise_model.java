package com.example.myfitnessapp;

import java.util.ArrayList;

public class Exercise_model {
    private int imgname;
    private String txt;
    private ArrayList<Exercise_details> exercise_detail = new ArrayList<>();

    public ArrayList<Exercise_details> getExercise_detail() {
        return exercise_detail;
    }

    public void setExercise_detail(ArrayList<Exercise_details> exercise_detail) {
        this.exercise_detail = exercise_detail;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getImgname() {
        return imgname;
    }

    public void setImgname(int imgname) {
        this.imgname = imgname;
    }


}
