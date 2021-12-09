// Copyright (c) 2021 Mel Aguoth All rights reserved.
//
// Created By: Mel Aguoth
// Date: December 8, 2021
// Plays "Rock, Paper, Scissors" with the user.

// Import modules.
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
  public static void rockPaperScissors(String gameChoice) {

    // Declare constants.
    Random random = new Random();
    int randomInt = random.nextInt(3 - 0) + 0;

    // Create a new list.
    List<String> rpsGameChoices = new ArrayList<>();

    // Add rock paper, and scissors to the list.
    rpsGameChoices.add("rock");
    rpsGameChoices.add("paper");
    rpsGameChoices.add("scissors");

    // Get the program's choice from the list.
    String programGameChoice = rpsGameChoices.get(randomInt);

    // Display to the user what the program chose.
    System.out.print("The program chose: " + programGameChoice);
    System.out.print("\n");

    // Display the outcome.
    if (gameChoice.equals(programGameChoice)) {
      System.out.print("\n" + "It's a tie! Restart to try again.");
    } else if (gameChoice.equals("rock") && programGameChoice.equals("scissors")) {
      System.out.print("\n" + "You win!");
    } else if (gameChoice.equals("rock") && programGameChoice.equals("paper")) {
      System.out.print("\n" + "You lost. Restart to try again.");
    } else if (gameChoice.equals("paper") && programGameChoice.equals("rock")) {
      System.out.print("\n" + "You win!");
    } else if (gameChoice.equals("paper") && programGameChoice.equals("scissors")) {
      System.out.print("\n" + "You lost. Restart to try again.");
    } else if (gameChoice.equals("scissors") && programGameChoice.equals("paper")) {
      System.out.print("\n" + "You win!");
    } else if (gameChoice.equals("scissors") && programGameChoice.equals("rock")) {
      System.out.print("\n" + "You lost. Restart to try again.");

    // If the user's input isn't valid, display as such to the user.
    } else {
      System.out.print("\n" + "That isn't a valid choice. Please try again.");
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {

    // Introduce the program.
    System.out.print("This program will play 'Rock, Paper, Scissors' with you.");

    // Get the user's choice.
    Scanner input = new Scanner(System.in);
    System.out.print("\n" + "Enter rock, paper, or scissors: ");
    String userGameChoice = input.next();
    input.close();

    // Call rockPaperScissors.
    RockPaperScissors obj = new RockPaperScissors();
    obj.rockPaperScissors(userGameChoice);
  }
}
