public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            double randomStart = Math.random() * 100;
            while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("======Yeni Round====");
                if (randomStart > 0 && randomStart <= 50) {
                    this.f2.health = this.f1.hit(f2); //f1 in vurusunu f2 ye at.

                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                }
                if (randomStart > 50 && randomStart <= 100) {
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2); //f1 in vurusunu f2 ye at.
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                }

            }
        } else {
            System.out.println("Sikletler uyusmuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) &&
                (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
        //iki dövüşçüün de ağırlığı min ve max ağırlığın arasında ise sikletleri aynıdır ve yukarıdaki döngüye girerler.
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı!!!!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandı!!!!");
            return true;
        }
        return false;//hala dövüş devam eder kazanan biri yok.
    }
}
