package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "pushbot5 (Blocks to Java)")
public class pushbot5 extends LinearOpMode {

  private DcMotor front_left_drive;
  private DcMotor back_left_drive;
  private DcMotor front_right_drive;
  private DcMotor back_right_drive;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    front_left_drive = hardwareMap.get(DcMotor.class, "front_left_drive");
    back_left_drive = hardwareMap.get(DcMotor.class, "back_left_drive");
    front_right_drive = hardwareMap.get(DcMotor.class, "front_right_drive");
    back_right_drive = hardwareMap.get(DcMotor.class, "back_right_drive");

    // Reverse one of the drive motors.
    // You will have to determine which motor to reverse for your robot.
    // In this example, the right motor was reversed so that positive
    // applied power makes it move the robot in the forward direction.
    front_left_drive.setDirection(DcMotor.Direction.REVERSE);
    // You will have to determine which motor to reverse for your robot.
    // In this example, the right motor was reversed so that positive
    // applied power makes it move the robot in the forward direction.
    back_left_drive.setDirection(DcMotor.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        // The Y axis of a joystick ranges from -1 in its topmost position to +1 in its bottommost position.
        // We negate this value so that the topmost position corresponds to maximum forward power.
        front_left_drive.setPower(-gamepad1.left_stick_y * 0.3);
        front_right_drive.setPower(-gamepad1.left_stick_y * 0.3);
        // The Y axis of a joystick ranges from -1 in its topmost position to +1 in its bottommost position.
        // We negate this value so that the topmost position corresponds to maximum forward power.
        back_left_drive.setPower(-gamepad1.left_stick_y * 0.3);
        back_right_drive.setPower(-gamepad1.left_stick_y * 0.3);
        telemetry.addData("Left Pow", front_left_drive.getPower());
        telemetry.addData("Left Pow", front_right_drive.getPower());
        telemetry.addData("Left Pow", back_right_drive.getPower());
        telemetry.addData("Left Pow", front_right_drive.getPower());
      }
    }
  }
}
