
package frc.robot;

import frc.robot.commands.pickerupper.ClawDown;
import frc.robot.commands.pickerupper.ClawUp;
import frc.robot.commands.pickerupper.CloseClaw;
import frc.robot.commands.pickerupper.OpenClaw;
import frc.robot.commands.pickerupper.StopHorizontalClaw;
import frc.robot.commands.pickerupper.StopVerticalClaw;
import frc.robot.commands.swervedriver.SwerveDrive;
import frc.robot.consoles.Logger;

// Contains singleton instances of all the commands on the robot.
public class BotCommands {

    // DiffDriver
    public static SwerveDrive swerveDrive;

    // PickUp
    public static ClawDown clawdown;
    public static ClawUp clawup;
    public static CloseClaw closeclaw;
    public static OpenClaw openclaw;
    public static StopHorizontalClaw stophorizontalclaw;
    public static StopVerticalClaw stopverticalclaw;

    // Initialize all robot commands
    public static void initializeCommands() {
        Logger.setup("Initializing BotCommands...");

        // SwerveDriver
        swerveDrive = new SwerveDrive(BotSubsystems.swerveDriver, BotControllers.xbox);

        // Pickup
        clawdown = new ClawDown(BotSubsystems.pickerupper);
        clawup = new ClawUp(BotSubsystems.pickerupper);
        closeclaw = new CloseClaw(BotSubsystems.pickerupper);
        openclaw = new OpenClaw(BotSubsystems.pickerupper);
        stophorizontalclaw = new StopHorizontalClaw(BotSubsystems.pickerupper);
        stopverticalclaw = new StopVerticalClaw(BotSubsystems.pickerupper);
    }
}
