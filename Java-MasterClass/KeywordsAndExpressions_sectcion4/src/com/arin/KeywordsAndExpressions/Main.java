package com.arin.KeywordsAndExpressions;

public class Main {

    public static void main(String[] args) {
		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("Your final score was " + highScore);

		calculateScore(true, 10_000, 8, 200);
		System.out.println("Your final score was " + highScore);
	}

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}

}
