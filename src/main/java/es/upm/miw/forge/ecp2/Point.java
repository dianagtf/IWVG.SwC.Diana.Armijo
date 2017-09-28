package es.upm.miw.forge.ecp2;

public class Point {
    private int x, y, z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;      
    }

    public Point(int xyz) {
        this(xyz, xyz, xyz);
    }

    public Point() {
        this(0, 0, 0);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }
    
    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y + (double)this.z * this.z);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
        this.z -= origin.getZ();
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "," + z + "]";
    }
    
}
