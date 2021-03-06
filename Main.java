import java.util.Random;
import java.util.Scanner;

/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    public static void main (String[] args){
        long aStart = System.currentTimeMillis();
        int[] array = arrayErzeuger(100000000);
        System.out.println((float)(System.currentTimeMillis() - aStart)/1000 + "s");
        System.out.println("Create Array \nStart sorting....");
        
        long start = System.currentTimeMillis();
        array = new MergSort().sort(array);
        System.out.println((float)(System.currentTimeMillis() - start)/1000 + "s");

        /*
        SortMethoden[] list = {
        //new InsertionSort(),
        //new BubbleSort(),
        //new SelectionSort(),
        //new MergSort(),
        //new QuickSort(),
        new CountingSort()
        };

        arrayAuswerfen (array,list);

        //Searching
        int random = array[getRandomNumber(1,array.length-5)];
        System.out.println("\nRandom Number is : "+random);

        searchNumber(array,random,new LinearSearch());

        int[] arraylist = list[3].sort(array);
        for(int i = 0; i< arraylist.length;i++){
        System.out.print(arraylist[i]+",");
        }
        searchNumber(arraylist,random,new LinearSearch());
        searchNumber(arraylist,random,new BinarySearch()); */
    }

    private static void searchNumber (int[] a , int number,ISearch s){
        System.out.println("\n(Random Number) "+s.getAlgorthimsName()+": "+s.search(a,number));
        System.out.println("(Last Number) "+s.getAlgorthimsName()+": "+s.search(a,a[a.length-1]));

    }

    private static void arrayAuswerfen(int [] a, SortMethoden[] list){
        System.out.println("Befor sort");
        for (int i = 0; i < a.length;i++){
            System.out.print(a[i] + ",");
        }

        for (int j = 0; j < list.length;j++){
            int array[] = list[j].sort(a);
            System.out.println("\n\n"+list[j].getAlgoritmusName());
            for (int i = 0; i < a.length;i++){
                System.out.print(array[i]+",");
            }
        }

    }

    private static int[] arrayErzeuger(int size){
        int array[] = new int[size];

        for (int i = 0; i<size;i++){
            array[i] = getRandomNumber(1,size);
        }
        return array;
    }

    private static int getRandomNumber(int min , int max){
        return new Random().nextInt(max - min) + min;

        //Math.random()
        //0.0 * (max - min) + min => min
        //1.0 * (max - min) + min => min
    }
}
