package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Anne on 8/13/2017.
 */
@TeleOp(name="Gamepad Drive", group="Training")
public class GamepadDriveTeleOp extends OpMode {

    DcMotor leftWheel;
    DcMotor rightWheel;

    double leftWheelPower;
    double rightWheelPower;



    @Override
    public void init() {
        leftWheel = hardwareMap.dcMotor.get("left_wheel");
        rightWheel = hardwareMap.dcMotor.get("right_wheel");

        //reverses the left wheel motor so that when gamepad push forward, value = +1, when gamepad push back, value = = -1
        leftWheel.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {

        //gamepad has value between -1 and 1. || -1 goes backward, +1 goes forward
        leftWheelPower = gamepad1.left_stick_y;
        rightWheelPower = gamepad1.right_stick_y;

        leftWheel.setPower(leftWheelPower);
        rightWheel.setPower(rightWheelPower);


    }
}
