package MathQuizGame;

import java.util.Random;

public class Question {
    private int question1;
    private int question2;
    private char operator;
    private double correctAnswer;

    // Default Constructor
    public Question(){

    }

    public void generateLevel(String level){
        Random rand = new Random();
        char[] operators = {'+', '-', '*', '/'};
        this.operator = operators[rand.nextInt(operators.length)];
        switch (level.toLowerCase()){
            case "easy" ->{
                question1 = rand.nextInt(10) + 1;
                question2 = rand.nextInt(10) + 1;
            }
            case "medium" ->{
                question1 = rand.nextInt(11, 50);
                question2 = rand.nextInt(11,50);
            }
            case "hard" ->{
                question1 = rand.nextInt(50,101);
                question2 = rand.nextInt(50,101);
            }
        }
        calculateAnswer();
    }

    private void calculateAnswer(){
        switch (operator){
            case '+':
                correctAnswer = question1 + question2;
                break;
            case '-':
                correctAnswer = question1 - question2;
                break;
            case '*':
                correctAnswer = question1 * question2;
                break;
            case '/':
                correctAnswer = (double) question1 / question2;
                break;
        }
    }

    public void displayQuestion(){
        System.out.println("What is " + question1 + " " + operator + " " + question2 + "?");
    }

    public boolean checkAnswer(double userAnswer){
        return Math.abs(userAnswer - correctAnswer) < 0.001;
    }
}
