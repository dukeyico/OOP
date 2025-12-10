package MathQuizGame;

import java.util.Random;

public class Question {
    private int question1;
    private int question2;
    private char operator;
    private double correctAnswer;

    // Constructor
    public Question(){
        Random rand = new Random();
        this.question1 = rand.nextInt(100) + 1;
        this.question2 = rand.nextInt(100) + 1;
        char[] operators = {'+', '-', '*', '/'};
        this.operator = operators[rand.nextInt(operators.length)];
        calculateAnswer();
    }

    private void calculateAnswer(){
        switch (operator){
            case '+':
                correctAnswer = question1 + question2;
                break;
            case '-':
                if(question1 > question2){
                    correctAnswer = question1 - question2;
                }
                else{
                    correctAnswer = question2 - question1;
                }
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
