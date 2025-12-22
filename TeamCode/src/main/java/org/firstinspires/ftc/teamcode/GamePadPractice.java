package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode{

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double leftStickX = -gamepad1.left_stick_x;
        double leftStickY = -gamepad1.left_stick_y;

        double rightStickX = -gamepad1.right_stick_x
        double rightStickY = -gamepad1.right_stick_y;

        double differenceX = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTrigger = gamepad1.left_trigger + gamepad1.right_trigger;;

        telemetry.addData("Lx",leftStickX);
        telemetry.addData("Ly",leftStickY);

        telemetry.addData("Rx",rightStickX);
        telemetry.addData("Ry",rightStickY);

        telemetry.addData("B",gamepad1.b);
        telemetry.addData("difference x", differenceX );
        telemetry.addData("sum Trigger", sumTrigger);

    }
}