import java.util.Scanner;

public class Practice3NewVersion {
    public static void main(String[] args) {
        System.out.println(findCommonDevisor());
    }
    public static int findCommonDevisor(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a;
        while (a % i != 0 || b % i != 0){
                i --;
            } return i;
    }
}
