package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.Blinker;

@Autonomous

public class Autonomous11908Test {
    private DcMotor arm_Rotation;
    private Servo claw_Grabber;
    private DcMotor claw_Wrist;
    private Blinker control_Hub;
    private Blinker expansion_Hub_2;
    private DcMotor linear_Hex_Motor;
    private DcMotor back_left_drive;
    private DcMotor back_right_drive;
    private DcMotor front_left_drive;
    private DcMotor front_right_drive;
    
    @Override
    public void runOpMode() {
        
    front_left_drive = hardwareMap.get(DcMotor.class, "front_left_drive");
    back_left_drive = hardwareMap.get(DcMotor.class, "back_left_drive");
    ArmRotation = hardwareMap.get(DcMotor.class, "Arm Rotation");
    ClawWrist = hardwareMap.get(DcMotor.class, "Claw Wrist");
    LinearHexMotor = hardwareMap.get(DcMotor.class, "Linear Hex Motor");
    front_right_drive = hardwareMap.get(DcMotor.class, "front_right_drive");
    back_right_drive = hardwareMap.get(DcMotor.class, "back_right_drive");
    ClawGrabber = hardwareMap.get(Servo.class, "Claw Grabber");
    
    front_left_drive.setDirection(DcMotor.Direction.REVERSE);
    back_left_drive.setDirection(DcMotor.Direction.REVERSE);
    ArmRotation.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    ClawWrist.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    LinearHexMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    waitForStart();
    
    }
}
