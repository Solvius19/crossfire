package org.example;

import org.example.controller.TriviaController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Trivia Game!");
        TriviaController.setupGame();
        TriviaController.runGame();
    }
}
