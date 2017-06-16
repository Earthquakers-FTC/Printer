package org.firstinspires.ftc.teamcode.printer;

public class PrinterDriver {
    private ServoPosition servoPosition;

    public PrinterDriver() {
        //
    }

    public void setPos(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    protected void setX(double pos) {
        this.servoPosition.set(pos, -pos);
    }

    protected void setY(double pos) {
        this.servoPosition.set(pos, pos);
    }

    public ServoPosition getServoPos() {
        return new ServoPosition();
    }
}
