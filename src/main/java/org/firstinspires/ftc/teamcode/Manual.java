package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * A manual OpMode to control the robot with a handheld controller
 */
@TeleOp(name="TeleOp: Manual", group="Linear Opmode")
public class Manual extends LinearOpMode {

    private double normalize(double val) {
        return Math.max(-1.0, Math.min(1.0, val));
    }

    @Override
    public void runOpMode() {
        double power = 0.0, steering = 0.0;

        waitForStart();

        while(opModeIsActive()) {

            power = gamepad1.left_trigger > 0.0 ? Math.pow(gamepad1.left_trigger, 2.0) : -Math.pow(gamepad1.left_trigger, 2.0);

            steering = gamepad1.left_stick_x > 0.0 ? Math.pow(gamepad1.left_stick_x, 2.0) : -Math.pow(gamepad1.left_stick_x, 2.0);

            hardwareMap.dcMotor.get("fr").setPower(normalize(power + steering)); // Front Right
            hardwareMap.dcMotor.get("rr").setPower(normalize(power + steering)); // Rear Right

            hardwareMap.dcMotor.get("fl").setPower(-normalize(power - steering)); // Front Left
            hardwareMap.dcMotor.get("rl").setPower(-normalize(power - steering)); // Rear Left
        }
    }
}
