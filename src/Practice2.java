import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        calLoan();
    }
    public static void calLoan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien vay");
        int money = scanner.nextInt();
        System.out.println("Nhap lai suat cho vay theo nam cua ngan hang");
        float interestPerYear = scanner.nextFloat();
        System.out.println("Nhap so thang ban muon vay");
        int months = scanner.nextInt();
        float loan = money * ((interestPerYear / 100f) / 12f) * months;
        System.out.println("So tien lai ban phai tra ngan hang la: " + loan);
    }
}
