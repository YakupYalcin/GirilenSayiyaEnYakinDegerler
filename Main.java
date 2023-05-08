import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
            int [] arr ={15,12,788,1,-1,-778,2,0};
        Scanner inp=new Scanner(System.in);
        System.out.print("Eklenecek Sayıyı Giriniz : ");
        int input=inp.nextInt();


        int [] copyArray=Arrays.copyOf(arr,9);
        Arrays.fill(copyArray,8,9,input);
        Arrays.sort(copyArray);
        int inputindex=Arrays.binarySearch(copyArray,input);

        //Diziyi sıraladığımızda küçükten büyüğe doğru bir sıralama yapıcak
        //Yani input'un indeksinin +1 i bize input değerinden büyük en yakın sayıyı
        //input indeksinin -1'i bize input değerinden küçük en yakın değeri verecektir.


        int enyakinkucukdeger=inputindex-1;
        int enyakinbuyukdeger=inputindex+1;
        System.out.println("Dizi :"+Arrays.toString(arr));
        System.out.println("Girilen Sayı : " + input);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+copyArray[enyakinkucukdeger]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+copyArray[enyakinbuyukdeger]);




    }
}