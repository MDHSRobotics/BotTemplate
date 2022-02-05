
package frc.robot;

import frc.robot.consoles.Logger;
import frc.robot.commands.swervedriver.*;

// Contains singleton instances of all the commands on the robot.
public class BotCommands {

    // SwerveDrive
    public static SwerveDrive swerveDrive;
    public static RotateSwerveWheelsToStart rotateSwerveWheelsToStart;
    public static ResetModulePositions resetModulePositions;

    // Initialize all robot commands
    public static void initializeCommands() {
        Logger.setup("Initializing BotCommands...");

        // SwerveDriver
        swerveDrive = new SwerveDrive(BotSubsystems.swerveDriver, BotControllers.xbox);
        rotateSwerveWheelsToStart = new RotateSwerveWheelsToStart(BotSubsystems.swerveDriver);
        resetModulePositions = new ResetModulePositions(BotSubsystems.swerveDriver);
    }

}
