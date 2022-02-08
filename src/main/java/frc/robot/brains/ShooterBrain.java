
package frc.robot.brains;

import edu.wpi.first.networktables.NetworkTableEntry;

// This class contains all the shared NetworkTableEntries for the Shooter Subsystem,
// their default values, and methods for retrieving their current values.
public class ShooterBrain {

    //----------------//
    // Default Values //
    //----------------//

    public static double pidkFTopDefault = 0.;

    //---------------------//
    // NetworkTableEntries //
    //---------------------//

    public static NetworkTableEntry pidkFTopEntry;


    //---------//
    // Setters //
    //---------//

    public static void setTopWheelCurrentVelocity(double value) {
        pidkFTopEntry.setDouble(value);
    }

    //---------//
    // Getters //
    //---------//

    public static double getPidkFTop() {
        return pidkFTopEntry.getDouble(pidkFTopDefault);
    }

}
