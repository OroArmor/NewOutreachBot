package org.usfirst.frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class RobotMap {
	
	//---------------------------------------------
	public static int frontRightMotorID = 1;
	public static int backRightMotorID = 2;
	public static int frontLeftMotorID = 3;
	public static int backLeftMotorID = 4;
	//---------------------------------------------
	
	public static TalonSRX frontRightMotor = new TalonSRX(frontRightMotorID);
	public static TalonSRX backRightMotor = new TalonSRX(backRightMotorID);
	public static TalonSRX frontLeftMotor = new TalonSRX(frontLeftMotorID);
	public static TalonSRX backLeftMotor = new TalonSRX(backLeftMotorID);

	
	
}
