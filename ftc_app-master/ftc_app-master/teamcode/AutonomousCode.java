package org.firstinspires.ftc.teamcode;

/**
 * Created by suhu on 1/7/2018.
 */

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;


@Autonomous(name="Autonomous Code", group="Exercises")
public class AutonomousCode extends LinearOpMode {
    DcMotor leftMotor1;
    DcMotor rightMotor1;
    DcMotor leftMotor2;
    DcMotor rightMotor2;

    @Override
    public void runOpMode() throws InterruptedException
    {
        leftMotor1 = hardwareMap.dcMotor.get("left1");
        rightMotor1 = hardwareMap.dcMotor.get("right1");
        leftMotor2 = hardwareMap.dcMotor.get("left2");
        rightMotor2 = hardwareMap.dcMotor.get("right2");

        rightMotor1.setDirection(DcMotor.Direction.REVERSE); //not sure what this does
        rightMotor2.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Mode", "waiting");
        telemetry.update();

        waitForStart(); // wait for start button

        telemetry.addData("Mode", "running");
        telemetry.update();

        leftMotor1.setPower(8);
        rightMotor1.setPower(8);
        leftMotor2.setPower(8);
        rightMotor2.setPower(8);
        Thread.sleep(7000); //Moves for 18057 milliseconds so it goes 126 cm


        leftMotor1.setPower(0); //set power to 0 so it stops
        rightMotor1.setPower(0);

        leftMotor2.setPower(0); //set power to 0 so it stops
        rightMotor2.setPower(0);
    }
}

