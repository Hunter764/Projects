import java.util.*;

class Guesser {
    int gnum;

    int guessingNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser, kindly guess a number!");
        gnum = scan.nextInt();
        return gnum;  // Added return statement
    }
}

class Player {
    int pnum;

    int predictingNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player, kindly predict a number!");
        pnum = scan.nextInt();
        return pnum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectingNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();
    }

    void collectingNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.predictingNum();
        numFromPlayer2 = p2.predictingNum();
        numFromPlayer3 = p3.predictingNum();
    }

    void comparing() {
        if (numFromPlayer1 == numFromGuesser) {
            System.out.println("Player1 won the game!");
        } else if (numFromPlayer2 == numFromGuesser) {
            System.out.println("Player2 won the game!");
        } else if (numFromPlayer3 == numFromGuesser) {
            System.out.println("Player3 won the game!");
        } else {
            System.out.println("Game Lost, Try again!");
        }
    }
}

class GuesserGameApp {
    public static void main(String[] args) {
        Umpire u = new Umpire();

        u.collectingNumFromGuesser();
        u.collectingNumFromPlayers();
        u.comparing();
    }
}
