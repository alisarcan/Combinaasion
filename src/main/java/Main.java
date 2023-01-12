import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,a,i=1,j=1,k=1,fak1=1,fak2=1,fak3=1;
        System.out.print("Kümedeki eleman sayısını giriniz : ");
        n = input.nextInt();
        System.out.print("Kombinasyonu giriniz : ");
        r = input.nextInt();

        a = n - r;

        while (i <= n){
            fak1 = fak1 * i;
            i++;

        }
        while (j <= r){
            fak2 = fak2 * j;
            j++;

        }
        while (k <= a){
            fak3 = fak3 * k;
            k++;

        }
        int comb = fak1 / (fak2*fak3);
        System.out.println(comb);

    }
}
