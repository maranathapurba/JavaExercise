package org.example;
import java.util.Scanner;

public class ShapeDrawer {
    Scanner scanner = new Scanner(System.in); //untuk masukin user input
    public void displayMenu(){
        System.out.println ("Selamat datang di ASCII draw!");
        System.out.println ("Pilih bentuk yang mau digambar");
        System.out.println ("1. Segitiga siku-siku");
        System.out.println ("2. Segitiga sama kaki");
        System.out.println ("3. Exit\n");
    }

    public void drawTriangleSS(int height){
        //Nested loop
        //Outer loop
        for(int i = 1; i <= height; i++){
            //inner loop
            for(int j = 1 ; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawTriangleSK(int height2){
        //Nested loop
        //Outer loop
        for (int i = 1; i <= height2; i++) {
            // Print spaces to center the triangle
            for (int j = height2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars for the triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
    public void DrawShape(int choice){
        switch (choice){
            case 1:
                System.out.println("Masukkan Panjang segitiga siku-siku: ");
                int height = scanner.nextInt();
                drawTriangleSS(height); //Fungsi untuk menggambar segitiganya
                break;
            case 2:
                System.out.println("Masukkan Panjang segitiga sama kaki: ");
                int height2 = scanner.nextInt();
                drawTriangleSK(height2); //Fungsi untuk menggambar segitiganya
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    public void run(){
        //Loop utk terus menampilkan menu
        while(true){
            displayMenu();
            System.out.println("Masukkan pilihan anda: ");
            int choice = scanner.nextInt(); //Input yg jenisnya integer
            DrawShape(choice);
            System.out.println();
        }

    }
    public static void main(String[] args){
        //bikin program utk gambar ASCII shape
        // Runner
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }

}
