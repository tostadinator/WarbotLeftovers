// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PneumaticsModuleType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public final class USB {
    public static final int leftJoystick = 0;
    public static final int rightJoystick = 1;
    public static final int xBoxController = 2;

    
  }

  public static final class Pneumatics {
    public static final int pcmOne = 11;
    public static final PneumaticsModuleType pcmType =
        PneumaticsModuleType.CTREPCM; // CTREPCM, REVPH

    public static final int intakePistonForward = pcmType == PneumaticsModuleType.CTREPCM ? 0 : 0;
    public static final int intakePistonReverse = pcmType == PneumaticsModuleType.CTREPCM ? 1 : 1;
  }

  public static class DriveTrainConstants { 
    public static final int pigeonID = 9; 
    public static final int FrontLeftDriveMotor = 20; 
    public static final int FrontRightDriveMotor = 22; 
    public static final int BackLeftDriveMotor = 21; 
    public static final int BackRightDriveMotor = 23; 
    
    public enum DriveTrainNeutralMode {
      BRAKE,
      COAST,
      /** Master motors brake, follower motors coast */
      HALF_BRAKE
    }
  }
  
  public static class IntakeConstants { 
    public static final int intakeMotor = 31; 
    public static final int encoderUnitsPerRotation = 2048;
  }
}
