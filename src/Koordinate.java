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
