/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurkite Koordinate.java papildomą klasę.
3. Susikurkite Koordinate klasei kintamuosius x ir y.
4. Susikurkite (generate...) tai klasei constructor, getter-setter, toString()
5. Susikurkite tai klasei funkciją (void), kuri apkeičia vietomis x ir y reikšmes. T.y., jeigu prieš tai koordinatė buvo x = 5; y = 20, tai paleidus tą funkciją būtų x = 20; y = 5
6. Susikurkite tai klasei funkciją, kuri per parametrus gauna kitą Koordinate objektą ir suskaičiuoja atstumą nuo this (šitos) koordinatės taško iki gautos per parametrus koordinatės taško. Atstumas tarp dviejų koordinačių taškų yra skaičiuojamas šia formule: https://www.ematematikas.lt/forumas/atstumas-tarp-dvieju-tasku-vidurio-taskas-t12116.html
7. Susikurkite tai klasei papildomą static funkciją, kuri gauna du Koordinate objektus per parametrus ir returnina taip pat Koordinate objektą - tai yra vidurio taškas tarp tų dviejų koordinačių. Kaip jį rasti? Toje pačioje nuorodoje: https://www.ematematikas.lt/forumas/atstumas-tarp-dvieju-tasku-vidurio-taskas-t12116.html
8. Susikurkite tai klasei papildoma funkcija, kuri gauna parametrus dx ir dy. dx (delta x) tai kiek pakeisti sio tasko x koordinate. dy (delta y), tia kiek pakeisti sio tasko y koordinate. Pvz., Jeigu dabartine Koordinate k1: {x=5, y=8}, tai paleidus funkcija k1.pakeisti(-3, 6) musu k1 pasikeistu i k1: {x=2, y=14
9. SUNKUS (galima skippint): susikurkite tai klasei static funkciją, kuri gauna per parametrus KETURIS Koordinate objektus ir apskaičiuoja/nusprendžia ar su tais keturiais taškais gaunasi kvadratas?

 */
public class Programa {
    public static void main(String[] args) {
        Koordinate k1 = new Koordinate(5, 20);
        Koordinate k2 = new Koordinate(30, 5);
        System.out.println("k1 = " + k1);
        k1.sukeistiVietomis();
        System.out.println("k1 = " + k1);
        System.out.println("k2 = " + k2);

        System.out.println("k1.atstumasIki(k2) = " + k1.atstumasIki(k2));
    }
}
