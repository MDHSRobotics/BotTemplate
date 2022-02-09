package frc.robot;

import frc.robot.consoles.Logger;
import frc.robot.subsystems.*;

// Contains singleton instances of all the subsystems on the robot.
public class BotSubsystems {

    public static SwerveDriver swerveDriver;
    public static PickerUpper pickerupper;

    // Initialize all robot subsystems
    public static void initializeSubsystems() {
        Logger.setup("Initializing BotSubsystems...");

        swerveDriver = new SwerveDriver();
        pickerupper = new PickerUpper();
    }

    // Set all the subsystem "teleop" default commands
    public static void setTeleopDefaultCommands() {

        // Pickup
        Logger.setup("PickerUpper Teleop Default Command -> stopverticalclaw...");
        pickerupper.setDefaultCommand(BotCommands.stopverticalclaw);

        Logger.setup("PickerUpper Teleop Default Command -> stophorizontalclaw...");
        pickerupper.setDefaultCommand(BotCommands.stophorizontalclaw);


        // SwerveDriver
        Logger.setup("SwerveDriver Teleop Default Command -> SwerveDrive...");

    }

}
