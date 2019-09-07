package com.example.a3lesson5;

import android.content.Intent;

import java.io.Serializable;

public class Task implements Serializable {
    String el1;
    String el2;

    public Task(String el1, String el2) {
        this.el1 = el1;
        this.el2 = el2;

    }
}
