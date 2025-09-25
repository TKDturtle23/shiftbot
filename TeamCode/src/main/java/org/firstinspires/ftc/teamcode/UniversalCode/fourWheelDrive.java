package org.firstinspires.ftc.teamcode.UniversalCode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class fourWheelDrive {
    private DcMotor front_left_drive;
    private DcMotor back_left_drive;
    private DcMotor front_right_drive;
    private DcMotor back_right_drive;
    double forwardsVelocity;
    double horizontalVelocity;
    double speed = 0.3;
    public void Init(com.qualcomm.robotcore.hardware.HardwareMap hardwareMap){
        front_left_drive = hardwareMap.get(DcMotor.class, "front_left_drive");
        back_left_drive = hardwareMap.get(DcMotor.class, "back_left_drive");
        front_right_drive = hardwareMap.get(DcMotor.class, "front_right_drive");
        back_right_drive = hardwareMap.get(DcMotor.class, "back_right_drive");


        // You will have to determine which motor to reverse for your robot.
        // In this example, the right motor was reversed so that positive
        // applied power makes it move the robot in the forward direction.
        front_left_drive.setDirection(DcMotor.Direction.REVERSE);
        // You will have to determine which motor to reverse for your robot.
        // In this example, the right motor was reversed so that positive
        // applied power makes it move the robot in the forward direction.
        back_left_drive.setDirection(DcMotor.Direction.FORWARD);
        back_right_drive.setDirection(DcMotor.Direction.FORWARD);

    }
    public void Update(org.firstinspires.ftc.robotcore.external.Telemetry telemetry, com.qualcomm.robotcore.hardware.Gamepad gamepad1,
                com.qualcomm.robotcore.hardware.Gamepad gamepad2) {
        forwardsVelocity = -gamepad1.left_trigger + gamepad1.right_trigger;
        horizontalVelocity = gamepad1.left_stick_x;
        // Put loop blocks here.
        // The Y axis of a joystick ranges from -1 in its topmost position to +1 in its bottommost position.
        // We negate this value so that the topmost position corresponds to maximum forward power.
        front_left_drive.setPower((forwardsVelocity * speed) - horizontalVelocity);
        front_right_drive.setPower((forwardsVelocity * speed) + horizontalVelocity);
        // The Y axis of a joystick ranges from -1 in its topmost position to +1 in its bottommost position.
        // We negate this value so that the topmost position corresponds to maximum forward power.
        back_left_drive.setPower((forwardsVelocity * speed) - horizontalVelocity);
        back_right_drive.setPower((forwardsVelocity * speed) + horizontalVelocity);
        // Telemetry is how we send data to the driverhub
        telemetry.addData("Power", forwardsVelocity);
        telemetry.addData("direction", horizontalVelocity);
    }

}
