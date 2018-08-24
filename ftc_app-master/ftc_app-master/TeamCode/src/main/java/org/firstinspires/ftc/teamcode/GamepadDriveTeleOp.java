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

    DcMotor leftWheel1;
    DcMotor rightWheel1;
    DcMotor leftWheel2;
    DcMotor rightWheel2;

    DcMotor jointOne;
    DcMotor jointTwo;
    DcMotor handJoint;


    double leftWheelPower;
    double rightWheelPower;

    


    @Override
    public void init() /*throws InterruptedException*/ {

        leftWheel1 = hardwareMap.dcMotor.get("left1");
        rightWheel1 = hardwareMap.dcMotor.get("right1");
        leftWheel2 = hardwareMap.dcMotor.get("left2");
        rightWheel2 = hardwareMap.dcMotor.get("right2");

        jointOne = hardwareMap.dcMotor.get("jointOne");
        jointTwo = hardwareMap.dcMotor.get("jointTwo");
        handJoint = hardwareMap.dcMotor.get("handJoint");


        //reverses the left wheel motor so that when gamepad push forward, value = +1, when gamepad push back, value = = -1
        leftWheel1.setDirection(DcMotor.Direction.REVERSE);
        leftWheel2.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {

        //gamepad has value between -1 and 1. || -1 goes backward, +1 goes forward
        leftWheelPower = gamepad1.left_stick_y;
        rightWheelPower = gamepad1.right_stick_y;

        leftWheel1.setPower(leftWheelPower);
        rightWheel1.setPower(rightWheelPower);
        leftWheel2.setPower(leftWheelPower);
        rightWheel2.setPower(rightWheelPower);

        //for the jointOne (base joint) (using buttons A and B)
        if (gamepad1.x) {
            jointOne.setPower(0.5);
        }
        if (gamepad1.b) {
            jointOne.setPower(-0.5);
        } else {
            jointOne.setPower(0.0);
        }

        //controls jointTwo using buttons X and Y
        if (gamepad1.y) {
            jointTwo.setPower(-0.5);
        }
        if (gamepad1.a) {
            jointTwo.setPower(0.5);
        } else {
            jointTwo.setPower(0.0);
        }

        //controls the hand using buttons A and B on gamepad 2
        if (gamepad2.y) {
            handJoint.setPower(0.5);
        }
        if (gamepad2.a) {
            handJoint.setPower(-0.5);
        } else {
            handJoint.setPower(0.0);
        }
    }
}
