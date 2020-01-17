package frc.subsystems.drivetrain;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Joystick;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;
import com.ctre.phoenix.sensors.*;

public class Drivetrain extends SubsystemBase {
    //public CANSparkMax leftA, leftB;
    public SpeedController leftDrive;
   // public CANSparkMax rightA, rightB;
    public SpeedController rightDrive;
    public Differencialdrive drive;
    public TalonSRX leftA,leftB;
    public TalonSRX rightA,rightB;


    public Drivetrain() {
        rightA = new TalonSRX(4);
        rightB = new TalonSRX(2);
        rightDrive = new SpeedController(rightA, rightB);
        leftA = new TalonSRX(3);
        leftB = new TalonSRX(1);
        leftDrive = new SpeedController(leftA, leftB);
        drive = new Differencialdrive(leftDrive, rightDrive);

    }

    @Override
    public void periodic() {
//        leftA.set(ControlMode.PercentOutput,0.1);
       // drive.curvatureDrive(Robot.oi.leftDriverY(), Robot.oi.rightDriverX(), Robot.oi.driverLeftBumper());
    }


}
