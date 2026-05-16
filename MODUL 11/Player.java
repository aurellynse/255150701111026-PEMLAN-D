public class Player {
    int tinggi;
    int berat;

    public Player(int tinggi, int berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "Tinggi: " + tinggi + " cm, Berat: " + berat + " kg";
    }
}
