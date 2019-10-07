public class HelloWarld {

    public static void main(String[] args){
        System.out.println("Hello Word");
        Integer umur;
        umur= 22;
        String nama = "Muhammad Ma'ruf Marsudi";

        System.out.println(nama.length());
        System.out.println(umur.equals(50));
        String umurStrng= umur.toString();
        System.out.println(umurStrng);

        System.out.println(" nilai minimal dari byte adalah "+ Byte.MIN_VALUE);
        System.out.println("nilai maksimal dari byte adalah "+ Byte.MAX_VALUE);


        System.out.println(" Nilai minimal dari integer adalah "+ Integer.MIN_VALUE);
        System.out.println("Nilai maksimal dari integer adalah "+ Integer.MAX_VALUE);

        double tinggiBadan;
        tinggiBadan=156.8;
        System.out.println(tinggiBadan);
        tinggiBadan = 175.5;
        System.out.println(tinggiBadan);

        final int NOMOR_INDUKK_ELUARGA;
        NOMOR_INDUKK_ELUARGA=123456789;
        System.out.println(NOMOR_INDUKK_ELUARGA);

        contohmethod();

    }
    static void contohmethod() {
        System.out.println("Statment di dalam method contoh mrthod");
    }
}
