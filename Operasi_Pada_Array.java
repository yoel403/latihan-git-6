/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operasi_pada_array;

import java.util.*;

public class Operasi_Pada_Array {

    public static void main(String[] args) {
        // OPERASI OPERASI YANG ADA PADA ARRAY
        
        //MERUBAH ARRAY MENJADI STRING
        System.out.println("MERUBAH ARRAY MENJADI STRING");
        int a= 1;
        int[] arrayangka1 = {1,2,3,4,5};
        printarray(arrayangka1);
        enter(a);
        
        
        //MENGKOPI ARRAY
        System.out.println("MENGKOPI ARRAY");
        int[] arrayangka2 = new int[5];
        printarray(arrayangka1);
        printarray(arrayangka2);
        
        System.out.println("MENGKOPI DENGAN LOOP");
        for (int i = 0 ; i < arrayangka1.length;i++){
            arrayangka2[i]=arrayangka1[i];
        }
        printarray(arrayangka1);
        printarray(arrayangka2);
        
        System.out.println("MENGKOPI DENGAN copy0f");
        int[] arrayangka3 = Arrays.copyOf(arrayangka1,3 );
        printarray(arrayangka1);
        printarray(arrayangka3);
        
        System.out.println("MENGKOPI DENGAN copy0frange");
        int[] arrayangka4 = Arrays.copyOfRange(arrayangka1, 2, 5);
        printarray(arrayangka1);
        printarray(arrayangka4);
        enter(a);
        
        
        //FILL ARRAY
        System.out.println("FILL ARRAY");
        int[] arrayangka5 = new int[18];
        printarray(arrayangka5);
        Arrays.fill(arrayangka5, 6);
        printarray(arrayangka5);
        enter(a);
        
        
        //KOMPARASI ARRAY
        System.out.println("KOMPARASI ARRAY");
        int[] arrayangka6 = {1,4,3,4,5};
        int[] arrayangka7 = {1,2,3,4,5};
        System.out.println("MEMBANDINGKAN ANTARA 2 ARRAY");
        System.out.println(Arrays.equals(arrayangka6,arrayangka7));
        if(Arrays.equals(arrayangka6,arrayangka7)){
            System.out.println("Array ini sama");
        }else
            System.out.println("array ini berbeda");enter(a);
        
        System.out.println("MEMBANDINGKAN ARRAY YANG LEBIH BESAR");
        System.out.println(Arrays.compare(arrayangka6, arrayangka7));
        
        System.out.println("\nMENGECEK MANA INDEX YANG BERBEDA");
        System.out.println(Arrays.mismatch(arrayangka6, arrayangka7));
        
                
        //SORT ARRAY
        System.out.println("\nMENSORTIR ARRAY");
        int[] arrayangka8 ={3,8,2,6,0,4,3,6,2};
        printarray (arrayangka8);
        Arrays.sort(arrayangka8);
        printarray (arrayangka8);
    
        
        
        //SEARCH ARRAY
        System.out.println("\nSEARCH ARRAY");
        int angka=6;
        int posisi = Arrays.binarySearch(arrayangka8,angka);
        System.out.println("angka " + angka + " berada di index-"+posisi);
        
    }
    private static void printarray(int[] array){
        System.out.println("array = " + Arrays.toString(array));
    }
    private static void enter(int enterr){
        System.out.print("\n");
    }
}
