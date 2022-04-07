package com.example.myfitnessapp;

import java.util.ArrayList;

public class Router{
    private static Router instance;
    private ArrayList<Exercise_details> exercise_details;

    public ArrayList<Exercise_details> getExercise_details() {
        return exercise_details;
    }

    public void setExercise_details(ArrayList<Exercise_details> exercise_details) {
        this.exercise_details = exercise_details;
    }

    public static synchronized Router getInstance()  //If you want your method thread safe...
    {
        if (instance == null) {
            instance = new Router();
        }

        return instance;
    }
}
