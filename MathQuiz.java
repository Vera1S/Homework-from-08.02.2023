package Homework.From_02_08_23;

import Homework.From_24_07_23.Calculator;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {

    private static int score;

    public static void start() {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int counter;
        int userInput;
        int correctAnswer;

        System.out.println("Добро пожаловать в опросник!");

        for (int i = 0; i <= 6; i++) {
            int w1 = rand.nextInt(1, 100) + 1;
            int w2 = rand.nextInt(1, 100) + 1;
            int result;

           switch (rand.nextInt(4)) {
                case 0:
                    System.out.print("Вопрос " + i + ": " + w1 + " + " + w2 + " = ");
                    result = Calculator.add(w1, w2);
                    break;
                case 1:
                    System.out.print("Вопрос " + i + ": " + w1 + " - " + w2 + " = ");
                    result = Calculator.subtract(w1, w2);
                    break;
                case 2:
                    System.out.print("Вопрос " + i + ": " + w1 + " * " + w2 + " = ");
                    result = Calculator.multiply(w1, w2);
                    break;
                default:
                    System.out.print("Вопрос " + i + ": " + w1 + " / " + w2 + " = ");
                    // Avoid division by zero
                    if (w1 == 0) {
                        w2 = 1;
                    }
                    result = Calculator.divide(w1, w2);
            }

            int userAnswer = scan.nextInt();
            if (userAnswer == result) {
                score += 5;
                System.out.println("Правильно! Текущее количество баллов: " + score);
            } else {
                score -= 5;
                System.out.println("Неправильно! Правильный ответ: " + result + ". Текущее количество баллов: " + score);
            }
        }

        System.out.println("Ура! Опросник завершён! Вы победили! Ваш финальный счёт: " + score);
    }
}


