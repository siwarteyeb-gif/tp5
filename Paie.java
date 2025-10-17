package tp5;

public class Paie {
    public static void main(String[] args) {
        Employe[] tab = new Employe[4];

        tab[0] = new Employe_res("Amal");
        ((Employe_res) tab[0]).setInfo(45, 150);

        tab[1] = new Employe_ord("Siwar", 50, 200);

        tab[2] = new Commerciaux("Wissem", 10000000, 20000);

        tab[3] = new Employe_ord("Sonya");
        ((Employe_ord) tab[3]).setInfo(50, 300);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i].getNom() + " gagne " + tab[i].getSalaire());
        }
    }
}