package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "testMotor", group="Linear OpMode")
public class _testMotor extends LinearOpMode {

    private DcMotor main;
    private DcMotor other;

    /**
     * This function is executed when this OpMode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        double Speed;

        main = hardwareMap.get(DcMotor.class, "z");
        other = hardwareMap.get(DcMotor.class, "a");
        // You will have to determine which motor to reverse for your robot.
        // In this example, the right motor was reversed so that positive
        // applied power makes it move the robot in the forward direction.
        main.setDirection(DcMotor.Direction.REVERSE);
        other.setDirection(DcMotor.Direction.FORWARD);
        Speed = 0.3;
        waitForStart();
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                main.setPower(gamepad1.left_stick_y);
                other.setPower(gamepad1.left_stick_y);           }
        }
    }
}


