package org.firstinspires.ftc.teamcode.printer;

public class ServoPosition {
    private double left, right;

    private double normalize(double x) {
        return Math.min(1.0, Math.max(-1.0, x));
    }

    public ServoPosition(double left, double right) {
        this.left = this.normalize(left);
        this.right = this.normalize(right);
    }

    public ServoPosition() {
        this(0.0, 0.0);
    }

    public double getLeft() {
        return this.left;
    }

    public double getRight() {
        return this.right;
    }

    public void set(double left, double right) {
        this.setLeft(left);
        this.setRight(right);
    }

    public void setLeft(double left) {
        this.left = this.normalize(left);
    }

    public void setRight(double right) {
        this.right = this.normalize(right);
    }
}
