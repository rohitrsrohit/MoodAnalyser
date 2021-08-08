package com.bridgelabz;

public class MoodAnalyser {
    public String analyseMood(String message){
        if (message.contains("happy")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}