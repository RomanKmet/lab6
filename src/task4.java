import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int programnum, player, numtry1;
        do {
            programnum = (int) (Math.random() * 3 + 1);
        } while (programnum == 0);
        numtry1 = 0;
// і – змінна для обліку кількості спроб
// j – змінна для підрахунку кількості спроб, що залишились
        while (numtry1 != 2) {
            numtry1++;
            Scanner sc = new Scanner(System.in);
            System.out.print("Введіть число від 1 до 3 включно: ");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                player = input.nextInt();
                if (player == programnum) {
                    System.out.println("Ви вгадали!!! Кількість спроб: " + numtry1);
                    break;
                } else {
                    System.out.println("Ви не вгадали! У вас залишилось спроб: " + (2 - numtry1));
                }
            }
        }
    }
}