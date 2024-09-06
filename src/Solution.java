import java.util.Scanner;

public class Solution {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i<numbers.length; i++){
            
            int sayiTwo = scanner.nextInt();
            int sayi = scanner.nextInt();
            switch(sayiTwo){
                case 1:
                    EvenOrOdd(sayi);
                    break;
                case 2:
                    isPrime(sayi);
                    break;
                case 3:
                    Palindrome(sayi);
                    break;
                
            }
            
            
        }
    } public static void EvenOrOdd(int sayi){
  
            if(sayi%2 == 0){
                System.out.println("EVEN");
            }else{
                System.out.println("ODD");
            }
        }
   
        public static void Palindrome(int sayi){
            int yeniSayi = 0,kalan,temp;
            temp = sayi;
            while(temp>0){
                kalan=temp%10;
                temp=(temp-kalan)/10;
                yeniSayi=yeniSayi*10+kalan;
            }
            if(yeniSayi==sayi) {
            	System.out.println("PALINDROME");
            }else {
            	System.out.println("NOT PALINDROME");
            }
        }
        public static void isPrime(int sayi) {
            boolean isPrime = true;
            for(int i=2;i<sayi; i++) {
                if(sayi%i ==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println("PRIME");
            }else{
                System.out.println("COMPOSITE");
            }
            
        }
}
