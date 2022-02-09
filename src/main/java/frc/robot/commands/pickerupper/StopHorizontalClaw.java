
package frc.robot.commands.pickerupper;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.consoles.Logger;
import frc.robot.subsystems.PickerUpper;

public class StopHorizontalClaw extends CommandBase {

    // TODO: Make these constructor parameters. Use overloading for these default values.
    private PickerUpper m_pickup;

    public StopHorizontalClaw(PickerUpper pickUp) {
        Logger.setup("Constructing Command: StopHorizontalClaw...");

        // Add given subsystem requirements
        m_pickup = pickUp;
        addRequirements(m_pickup);
    }

    @Override
    public void initialize() {
        Logger.action("Initializing Command: StopHorizontalClaw...");

    }

    //real code
    @Override
    public void execute() {
        m_pickup.stopHorizontal();
    }

    // This command continues until it cycles through the set number of cycles
    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        if (interrupted) {
            System.out.println("--");
            Logger.ending("Interrupting Command: StopHorizontalClaw...");
        } else {
            Logger.ending("Ending Command: StopHorizontalClaw...");
        }
    }

}
