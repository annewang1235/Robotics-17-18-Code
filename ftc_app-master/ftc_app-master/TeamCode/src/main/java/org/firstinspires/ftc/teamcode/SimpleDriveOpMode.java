package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Anne on 8/11/2017.
 */
@TeleOp(name="Simple Drive", group="Training")
public class SimpleDriveOpMode extends OpMode {

    DcMotor leftwheel;
    DcMotor rightwheel;
    double drivePower = .5;


    @Override
    public void init() {
        leftwheel = hardwareMap.dcMotor.get("left_wheel");
        rightwheel = hardwareMap.dcMotor.get("right_wheel");

        rightwheel.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        leftwheel.setPower(drivePower);
        rightwheel.setPower(drivePower);


    }
}