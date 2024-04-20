public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Birinci Dövüşü", 20, 100, 87,50);
        Fighter f2 = new Fighter("İkinci Dövüşçü", 20, 85, 85,50);

        Match match = new Match(f1, f2, 80, 90);
        match.run();

    }
}