package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <string> void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.print("This is without space");
        System.out.println("New Line");

 /*       boolean flag;
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
*/        //Data types and variable
        int a = 10;
        int b = 2;
        float c = 3;
        String name = "Atha";
        char q = 'Y';
        boolean flag2 = false; //true

        //Arithm
        int result = a / b;
        int result2 = (int) (a / c); //1 int dibagi 1 float --> float lbh tinggi
        float result3 = a / c;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        //if, else, else-if
        int timeStart = 8;
        int timeFinish = 17;
        int waktuMasuk = 9;
        int waktuPulang = 18;

        //Karyawan yang masuk tepat dan pulang tepat waktu atau lebih lama, diselamati
        if (waktuMasuk <= timeStart && waktuPulang >= timeFinish){
            System.out.println("Selamat, anda masuk tepat waktu");
        System.out.print("Anda sampai " + (timeStart - waktuMasuk) + " jam lebih cepat");
            //Karyawan yang masuk tepat waktu, pulang duluan, dicengin
        }else if(waktuMasuk <= timeStart && waktuPulang <= timeFinish){
            System.out.println("yeu pulang duluan");
            //Karyawan yang telat masuk, tapi pulang lebih lama atau tepat waktu, dimaafkan
        }else if(waktuMasuk >= timeStart && waktuPulang >= timeFinish){
            System.out.println("dimaafin telatnya");
            //Karyawan yang telat masuk, pulang duluan disoraki
        }else
        {
            System.out.println("Yeu!!! Telat...");
            System.out.print("Anda sampai " + (waktuMasuk-timeStart) + " jam lebih lama");
        }

        //Java switch
        int day = 3;
        char question = 'Y';
        switch (day){
            case 1:
                System.out.print("Saya WFO");
                break;
            case 2:
                System.out.println("Saya cuti");
                break;
            case 3:
                System.out.println("Saya WFH");
                break;
            default:
                System.out.println("Saya ga kerja alias nganggur");
        }


    }
}