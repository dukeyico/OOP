package MathQuizGame;

import java.util.Scanner;

public class MathQuiz {
    private int score;

    // Constructor
    public MathQuiz() {
        this.score = 0;
    }

    public void startQuiz(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Math Quiz!");

        System.out.println("How many questions do you want: ");
        int num = sc.nextInt();

        System.out.println("What level: easy, medium or hard? ");
        String level = sc.next();

        for (int i = 0; i < num; i++) {
            askQuestion(sc, level);
        }
        System.out.println("Your final score is: " + score + "/" + num);
        sc.close();
    }

    private void askQuestion(Scanner sc, String level){
        Question question = new Question();
        question.generateLevel(level);
        boolean correct = false;

        while (!correct) {
            question.displayQuestion();
            System.out.println("Your answer is: ");
            double userAnswer = sc.nextDouble();
            if (question.checkAnswer(userAnswer)) {
                System.out.println("Your answer is correct");
                score++;
                correct = true;
            }
            else{
                System.out.println("Your answer is incorrect");
                System.out.println("Try again");
            }
        }
    }
}
