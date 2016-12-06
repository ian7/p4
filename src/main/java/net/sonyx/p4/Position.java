package net.sonyx.p4;

/**
 * Created by Marcin on 05-Dec-16.
 */
public class Position {
    public Position(){
        this(0,0);
    }

    public Position( double x, double y){
        this.setX( x );
        this.setY( y );
    }
    public Position move( Position vector ){
        this.setX( vector.getX() + this.getX() );
        this.setY( vector.getY() + this.getY() );
        return this;
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

    double x;

    double y;
}
