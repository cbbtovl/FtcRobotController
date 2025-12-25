package org.firstinspires.ftc.teamcode.mechanism;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DcMotorVariable {
    private DcMotor motor; // ĐẶT GIÁ TRỊ CỦA DCMOTOR LÀ MOTOR
    private double ticksPerRev; // GIÁ TRỊ CỦA TICK QUA MỖI VÒNG QUAY
    public void init(HardwareMap hwMap){
        motor = hwMap.get(DcMotor.class, "motor"); // SET MOTOR ĐỂ NÓ CHUNG VỚI CÁI MOTOR TRONG ROBOT CONFIGTION TRONG DRIVER HUB
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER); // MOTOR CHẠY THEO ENCODER
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE); // ĐỂ KHI DỪNG MOTOR DỪNG NGAY LẬP TỨC
        //motor.setDirection(DcMotorSimple.Direction.REVERSE/FORWARD); // ĐẢO CHIỀU QUAY KHI MOTOR QUAY KHÁC HƯỚNG SO VỚI MONG MUỐN
    }

    public void setMotorSpeed(double Speed){
        motor.setPower(Speed);  // GIÁ TRỊ CỦA TỐC ĐỘ CHO MOTOR
    }

    public double getMotorRevs(){
        return motor.getCurrentPosition() / ticksPerRev; // BÌNH THƯỜNG HÓA SỐ TICK ĐANG CHẠY TRONG 1 VÒNG(REV)
    }
}
