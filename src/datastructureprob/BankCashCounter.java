package bankcashcounter;

import java.util.Scanner;

public class BankCashCounter {
    int totalAmount = 0;
    int head = -1;
    int tail = -1;
    String queue[];

    /**
     * Constructor
     */
    public BankCashCounter(int size) {
        queue = new String[size];
    }

    /**
     * enqueue method to deposit
     */
    public void enqueue(int amount, String name) {
        if (tail < queue.length - 1) {
            queue[++tail] = name;
            totalAmount += amount;
            if (head == -1)
                head++;
            return;
        }
        System.out.println("Queue is full");
    }

    /**
     * dequeue method to withdraw
     */
    public void dequeue() {
        if (head < queue.length && head < tail) {
            head++;
        }
    }

    /**
     *
     */
    public void display() {
        System.out.println(" QUEUE ");
        if (head > tail || head == -1) {
            System.out.println(" empty ");
            return;
        }
        for (int i = head; i <= tail; i++) {
            System.out.print("\t" + queue[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        BankCashCounter obj = new BankCashCounter(5);
        Scanner sc = new Scanner(System.in);
        int ch;

        while (true) {
            System.out.println(
                    "\n 1. Add customer to queue\n "
                            + " 2. Remove customer from queue\n "
                            + " 3. Display queue\n "
                            + " 4. Exit");

            System.out.println(" Please enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print(" Please enter the name of the customer: ");
                    String name = sc.next();
                    System.out.print(" Please enter the amount to be debited : ");
                    int amount = sc.nextInt();
                    obj.enqueue(amount, name);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println(" Wrong Choice");
            }
        }
    }
}
