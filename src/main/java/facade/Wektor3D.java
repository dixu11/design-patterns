package facade;

public class Wektor3D implements Wektor{
    private int x;
    private int y;
    private int z;

    public Wektor3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void add(Wektor wektor2) {
        x = wektor2.getX() + x;
        y = wektor2.getY() + y;
        z = wektor2.getZ() + z;
    }

    public void scale(Wektor wektor2) {
        x = wektor2.getX() * x;
        y = wektor2.getY() * y;
        z = wektor2.getZ() * z;
    }

    @Override
    public String toString() {
        return "Wektor3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }


}
