import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        draw();
    }
    public static void draw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Ve hinh tam giac");
        System.out.println("2. Ve hinh vuong");
        System.out.println("3. Ve hinh chu nhat");
        System.out.println("0. Exit");
        System.out.println("Nhap lua chon cua ban");
        byte choice = scanner.nextByte();
        switch (choice){
            case 1 -> {
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
            }
            case 2 -> {
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
            }
            case 3 -> {
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
            }
            case 0 -> {
                System.exit(0);
            }
            default -> System.out.println("No choice!");
        }

    }
}
