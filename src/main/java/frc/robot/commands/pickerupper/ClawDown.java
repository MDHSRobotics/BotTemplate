
package frc.robot.commands.pickerupper;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.consoles.Logger;
import frc.robot.subsystems.PickerUpper;

public class ClawDown extends CommandBase {

    // TODO: Make these constructor parameters. Use overloading for these default values.
    private PickerUpper m_pickup;

    public ClawDown(PickerUpper pickUp) {
        Logger.setup("Constructing Command: ClawDown...");

        // Add given subsystem requirements
        m_pickup = pickUp;
        addRequirements(m_pickup);
    }

    @Override
    public void initialize() {
        Logger.action("Initializing Command: ClawDown...");

    }

    //real code
    @Override
    public void execute() {
        m_pickup.armsDown();
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
            Logger.ending("Interrupting Command: ClawDown...");
        } else {
            Logger.ending("Ending Command: ClawDown...");
        }
    }

}
