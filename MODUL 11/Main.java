import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Player> timA = new ArrayList<>();
        ArrayList<Player> timB = new ArrayList<>();

        // TIM A
        timA.add(new Player(168,50));
        timA.add(new Player(170,60));
        timA.add(new Player(165,56));
        timA.add(new Player(168,55));
        timA.add(new Player(172,60));
        timA.add(new Player(170,70));
        timA.add(new Player(169,66));
        timA.add(new Player(165,56));
        timA.add(new Player(171,72));
        timA.add(new Player(166,56));

        // TIM B
        timB.add(new Player(170,66));
        timB.add(new Player(167,60));
        timB.add(new Player(165,59));
        timB.add(new Player(166,58));
        timB.add(new Player(168,58));
        timB.add(new Player(175,71));
        timB.add(new Player(172,68));
        timB.add(new Player(171,68));
        timB.add(new Player(168,65));
        timB.add(new Player(169,60));

        // =========================================
        // 1A - SORT TINGGI
        // =========================================

        timA.sort(Comparator.comparingInt(p -> p.tinggi));

        System.out.println("Tim A Tinggi Ascending:");
        for(Player p : timA){
            System.out.println(p);
        }

        timA.sort((p1,p2) -> p2.tinggi - p1.tinggi);

        System.out.println("\nTim A Tinggi Descending:");
        for(Player p : timA){
            System.out.println(p);
        }

        // =========================================
        // 1B - SORT BERAT
        // =========================================

        timB.sort(Comparator.comparingInt(p -> p.berat));

        System.out.println("\nTim B Berat Ascending:");
        for(Player p : timB){
            System.out.println(p);
        }

        timB.sort((p1,p2) -> p2.berat - p1.berat);

        System.out.println("\nTim B Berat Descending:");
        for(Player p : timB){
            System.out.println(p);
        }

        // =========================================
        // 1C - MAX MIN
        // =========================================

        int maxTinggiA = timA.stream().mapToInt(p -> p.tinggi).max().getAsInt();
        int minTinggiA = timA.stream().mapToInt(p -> p.tinggi).min().getAsInt();

        int maxBeratA = timA.stream().mapToInt(p -> p.berat).max().getAsInt();
        int minBeratA = timA.stream().mapToInt(p -> p.berat).min().getAsInt();

        System.out.println("\nTim A");
        System.out.println("Tinggi Max: " + maxTinggiA);
        System.out.println("Tinggi Min: " + minTinggiA);
        System.out.println("Berat Max: " + maxBeratA);
        System.out.println("Berat Min: " + minBeratA);

        // =========================================
        // 1D - COPY TIM B KE TIM C
        // =========================================

        ArrayList<Player> timC = new ArrayList<>(timB);

        System.out.println("\nTim C:");
        for(Player p : timC){
            System.out.println(p);
        }

        // =========================================
        // 2B - BINARY SEARCH TINGGI TIM B
        // =========================================

        ArrayList<Integer> tinggiB = new ArrayList<>();

        for(Player p : timB){
            tinggiB.add(p.tinggi);
        }

        Collections.sort(tinggiB);

        System.out.println("\n168 ditemukan: " +
                Collections.frequency(tinggiB,168));

        System.out.println("160 ditemukan: " +
                Collections.frequency(tinggiB,160));

        // =========================================
        // 2C - BINARY SEARCH BERAT TIM A
        // =========================================

        ArrayList<Integer> beratA = new ArrayList<>();

        for(Player p : timA){
            beratA.add(p.berat);
        }

        Collections.sort(beratA);

        System.out.println("\n56 ditemukan: " +
                Collections.frequency(beratA,56));

        System.out.println("53 ditemukan: " +
                Collections.frequency(beratA,53));

        // =========================================
        // 2D - CEK DATA SAMA
        // =========================================

        boolean adaSama = false;

        for(Player a : timA){
            for(Player b : timB){

                if(a.tinggi == b.tinggi || a.berat == b.berat){
                    adaSama = true;
                }

            }
        }

        if(adaSama){
            System.out.println("\nAda tinggi/berat yang sama");
        } else {
            System.out.println("\nTidak ada data yang sama");
        }

    }
}