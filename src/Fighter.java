public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }
    int hit(Fighter foe) {//parametre olarak gönderilen Fighter hit i alır.
        System.out.println(this.name + " =>" + foe.name + " " + this.damage + " hasar vurdu!");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı!");
            System.out.println("-----------");
            return foe.health;//canı gitmeyeceği için can değerini döndürdük ve hit metodu burda bitti.
        }
        if (foe.health - this.damage < 0) {
            return 0; // foe nin canı - lere düşerse 0 döndür. Return den sonrası okunmaz.
        }
        return foe.health - this.damage;
    }
    boolean isDodge() {
        double randomNumber = Math.random() * 100; //math sınıfının random metodu rastgele sayı üretmek için kullanılır. 0 ile 100 arasında double sayı ürettik.
        return randomNumber <= this.dodge; // her vurusta üretilen rastgele sayı girilen dodge dan büyük ise
    }
}
