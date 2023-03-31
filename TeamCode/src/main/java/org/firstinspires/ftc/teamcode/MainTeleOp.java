package org.firstinspires.ftc.teamcode;
//for good measure
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp (name = "TestTeleOp", group =  "Please work")
public class MainTeleOp extends LinearOpMode {


    private DcMotor motorFL;
    private DcMotor motorFR;
    private DcMotor motorBL;
    private DcMotor motorBR;

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();

        while(opModeIsActive()){

            idle();
        }
    }
}
