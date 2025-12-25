package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanism.DcMotorVariable;
@TeleOp
public class DCMotorPractice extends OpMode {
    DcMotorVariable Mov = new DcMotorVariable();
    @Override
    public void init() {
        Mov.init(hardwareMap);
    }

    @Override
    public void loop() {
       /*
       Em đang có 2 trường hợp một là dùng nút a để bật tắt motor thì sẽ xét giá trị
       của motor cố định cho trc luôn 2 là dùng joystick thì sẽ điều khiển đc tốc độ
       theo giá trị từ 1.0 - (-1.0) có thể đi tới đi ngược
       CÁCH 1:

        double MotorSpeed = 0
        if(gamepad1.a){
        motorSpeed = 0.5;   // chạy
        } else {
        motorSpeed = 0.0;   // dừng
        }

       CÁCH 2:

       double motorSpeed = -gamepad1.left_stick_y;
        Mov.setMotorSpeed(motorSpeed);

        -1.0 → chạy ngược

        0.0 → dừng

        1.0 → chạy tối đa

           */
        telemetry.addData("Motor Revs", Mov.getMotorRevs());
    }
}
