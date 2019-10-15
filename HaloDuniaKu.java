public class HaloDuniaKu {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Integer umur;
        umur = 22;
        String nama = "Warok Droid Dua";

        System.out.println(nama.length());
        System.out.println(umur.equals(22));
        String umurString = umur.toString();
        System.out.println(umurString);

        System.out.println("Nilai minimal dari byte adalah " + Byte.MIN_VALUE);
        System.out.println("Nilai maksimal dari byte adalah " + Byte.MAX_VALUE);

        System.out.println("Nilai minimal dari integer adalah " + Integer.MIN_VALUE);
        System.out.println("Nilai maksimal dari integer adalah " + Integer.MAX_VALUE);

        double tinggiBadan;
        tinggiBadan = 165.8;
        System.out.println(tinggiBadan);
        tinggiBadan = 170.5;
        System.out.println(tinggiBadan);


        final int NOMOR_INDUK_KELUARGA;
        NOMOR_INDUK_KELUARGA = 93475705;
        System.out.println(NOMOR_INDUK_KELUARGA);

        contohMethod();
    }

    static void contohMethod() {
        System.out.println("Statement ini di dalam method contohMethod()");
    }
}
