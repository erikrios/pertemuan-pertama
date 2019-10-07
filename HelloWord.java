public class HelloWorld {  //deklarasi class

    public static void main(String[] args) { //method main

        System.out.println("Hello, Word!");

        Integer umur; //deklarasi
        umur = 18;//inilisasi

        String nama = "gesang"; //variabel


        System.out.println(nama.length());
        System.out.println(umur.equals(18));

        String umurString = umur.toString();//konversi integer ke string
        System.out.println(umurString);


        System.out.println("nilai minimal dari byte adalah " + Byte.MIN_VALUE);
        System.out.println("nilai maxsimal dari byte adalah " + Byte.MAX_VALUE);

        System.out.println("nilai minimal dari integer adalah " + Integer.MIN_VALUE);
        System.out.println("nilai maximal dari integer adalah " + Integer.MAX_VALUE);

        double tinggiBadan;
        tinggiBadan = 165.8;

        System.out.println(tinggiBadan);

        tinggiBadan = 175.8;
        System.out.println(tinggiBadan);

        final int NOMOR_INDUK_KELUARGA = 671919118;

        System.out.println(NOMOR_INDUK_KELUARGA);

        contohMethod();
    }

    static void contohMethod(){
        System.out.println("Statement ini didalam method contoh method");

    }


}
