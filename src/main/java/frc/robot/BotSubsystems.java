package frc.robot;

import frc.robot.consoles.Logger;
import frc.robot.subsystems.*;

// Contains singleton instances of all the subsystems on the robot.
public class BotSubsystems {

    // Initialize all robot subsystems
    public static void initializeSubsystems() {
        Logger.setup("Initializing BotSubsystems...");
    }

    // Set all the subsystem "teleop" default commands
    public static void setTeleopDefaultCommands() {

        // Pickup
        Logger.setup("Pickup Teleop Default Command -> StopPickup...");

    }

}
