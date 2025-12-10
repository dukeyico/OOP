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
        for (int i = 0; i < 5; i++){
            askQuestion(sc);
        }
        System.out.println("Your final score is: " + score + "/5");
        sc.close();
    }

    private void askQuestion(Scanner sc){
        Question question = new Question();
        question.displayQuestion();
        System.out.println("Your answer is: ");
        double userAnswer = sc.nextDouble();
        if (question.checkAnswer(userAnswer)){
            System.out.println("Your answer is correct");
            score++;
        }
        else{
            System.out.println("Your answer is incorrect");
        }
    }
}
