package frc.robot.subsystems;

import frc.robot.devices.*;


// This class contains singleton (static) instances of id mapped subsystem components.
// If a device is not connected at initialization, it should be set to null.
// IMPORTANT: Only ONE subsystem should control any given device.
// Device instances are package-private (neither private nor public) so they can only be used by subsystems.
public class Devices {

    //////////////////////
    // Device Instances //
    //////////////////////

    // SwerveModule
    public static DevTalonFX talonFxSwerveDriveFL = new DevTalonFX("talonFxSwerveDriveWheelFrontLeft", 28);
    public static DevTalonFX talonFxSwerveDriveFR = new DevTalonFX("talonFxSwerveDriveWheelFrontRight", 26);
    public static DevTalonFX talonFxSwerveDriveRL = new DevTalonFX("talonFxSwerveDriveWheelRearLeft", 31);
    public static DevTalonFX talonFxSwerveDriveRR = new DevTalonFX("talonFxSwerveDriveWheelRearRight", 25);
    public static DevTalonFX talonFxSwerveTurnFL = new DevTalonFX("talonFxSwerveTurnWheelFrontLeft", 30);
    public static DevTalonFX talonFxSwerveTurnFR = new DevTalonFX("talonFxSwerveTurnWheelFrontRight", 32);
    public static DevTalonFX talonFxSwerveTurnRL = new DevTalonFX("talonFxSwerveTurnWheelRearLeft", 27);
    public static DevTalonFX talonFxSwerveTurnRR = new DevTalonFX("talonFxSwerveTurnWheelRearRight", 29);
    

}
