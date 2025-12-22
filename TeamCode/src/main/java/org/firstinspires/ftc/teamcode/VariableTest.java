package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariableTest extends OpMode{
    @Override
    public void init() {

        String teamName = "WuD"
        int teamNumber = 23456;
        double motorSpeed= 0.8;
        boolean clawOpen = true;

        telemetry.addData("Team",teamName);
        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw", clawOpen);


    }

    @Override
    public void loop() {

    }
}
