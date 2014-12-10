
package mapped;

import edu.umn.crisys.plexil.runtime.psx.JavaPlexilScript;
import edu.umn.crisys.plexil.runtime.values.BooleanValue;
import edu.umn.crisys.plexil.runtime.values.CommandHandleState;
import edu.umn.crisys.plexil.runtime.values.IntegerValue;

public class test1Script
    extends JavaPlexilScript
{


    public test1Script() {
        addEvent(simultaneous(stateChange(BooleanValue.get((true)), "target_in_view")));
        addEvent(stateChange(IntegerValue.get((1)), "time"));
        addEvent(delay());
        addEvent(commandAck(CommandHandleState.COMMAND_SUCCESS, "rover_stop"));
        addEvent(simultaneous(commandAck(CommandHandleState.COMMAND_SUCCESS, "rover_drive", IntegerValue.get((10))), stateChange(IntegerValue.get((10)), "time")));
        addEvent(commandAck(CommandHandleState.COMMAND_FAILED, "take_pancam"));
        addEvent(commandAck(CommandHandleState.COMMAND_SUCCESS, "rover_stop"));
        addEvent(delay());
        reset();
    }

}
