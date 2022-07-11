import java.util.HashMap;

public class Koordinate {
    private double x;
    private double y;

    public Koordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Koordinate() {
    }

    /**
     * Sukeičia x ir y vietomis
     */
    public void sukeistiVietomis() {
        double laikinas = x;
        x = y;
        y = laikinas;
    }

    /**
     * Apskaičiuoja atstumą nuo šitos koordinatės iki gaunamos per parametruss
     * @param koord koordinatė iki kurios ieškome atstumo
     * @return atstumas - realusis skaičiuss
     */
    public double atstumasIki(Koordinate koord) {
        return Math.sqrt(Math.pow(x - koord.x, 2) + Math.pow(y - koord.y, 2));
    }

    /**
     * Suranda vidurio tašką tarp dviejų plokštumos taškų
     * @param k1 pirmas taškass
     * @param k2 antras taškass
     * @return Koordinate objektą - vidurio tašką
     */
    public static Koordinate vidurioTaskas(Koordinate k1, Koordinate k2) {
        return new Koordinate((k1.x + k2.x) / 2, (k1.y + k2.y) / 2);
    }

    /**
     * Padidina funkcijos koordinates nurodytais dydžiaiss
     * @param dx kiek padidinti x
     * @param dy kiek padidinti y
     */
    public void pokytis(double dx, double dy) {
        x += dx;
        y += dy;
    }

    /**
     * Pati esmė paaiškinta šitoj nuorodoje: https://softwareengineering.stackexchange.com/a/176942
     * Surandu visų kraštinių bei įstrižainių ilgius. Tai darau susidėdamas tas visas keturias koordinates į masyvą.
     * Tada einu per kiekvieną ir surandu atstumus nuo jos iki sekančių masyve (tarkim jeigu dabar 0-inė tai randu atstumus nuo 0 iki 1, iki 2 ir iki 3. Jeigu dabar yra 2, tai randu atstumus tik iki 3 (nes nuo 2 iki 1 bus radę praeiti ciklo etapai, tai nereikia dubliuotis)
     * Atstumus dedu į dažnumo mapą - jeigu tokio pat atstumo kraštinė tą map'o value tiesiog padidinu vienetu. Galiausiai turi būti 4 vienodos kraštinės ir 2 vienodos įstrižainės
     * Hashmap'e Key bus kraštinės ilgis, Value bus kiek tokių kraštinių yra. Automatiškai, jeigu map'e daugiau nei 2 elementai - blogai, nes gali būti tik 4 vienodos kraštinės ir 2 vienodos įstrižainės, tai viso Map'e max 2 elementai kvadratui
     * @param k1 pirmas taškas
     * @param k2 antras taškass
     * @param k3 trečias taškass
     * @param k4 ketvirtas taškas
     * @return true, jeigu kvadratas, false jeigu ne
     */
    public static boolean arKvadratas(Koordinate k1, Koordinate k2, Koordinate k3, Koordinate k4) {
        HashMap<Double, Integer> krastiniuKartojimasis = new HashMap<>();
        Koordinate[] koordinates = {k1, k2, k3, k4};
        for (int i = 0; i < koordinates.length; i++) {
            for (int j = i + 1; j < koordinates.length; j++) {
                double atstumas = koordinates[i].atstumasIki(koordinates[j]);
                if (krastiniuKartojimasis.containsKey(atstumas)) {
                    krastiniuKartojimasis.put(atstumas, krastiniuKartojimasis.get(atstumas) + 1);
                }
                else {
                    krastiniuKartojimasis.put(koordinates[i].atstumasIki(koordinates[j]), 1);
                }
            }
        }
        System.out.println("krastiniuKartojimasis = " + krastiniuKartojimasis);
        return true;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Koordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
