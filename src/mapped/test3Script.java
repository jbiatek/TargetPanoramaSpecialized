
package mapped;

import edu.umn.crisys.plexil.runtime.psx.JavaPlexilScript;
import edu.umn.crisys.plexil.runtime.values.BooleanValue;
import edu.umn.crisys.plexil.runtime.values.CommandHandleState;
import edu.umn.crisys.plexil.runtime.values.IntegerValue;

public class test3Script
    extends JavaPlexilScript
{


    public test3Script() {
        addEvent(simultaneous(stateChange(IntegerValue.get((0)), "time")));
        addEvent(simultaneous(commandAck(CommandHandleState.COMMAND_FAILED, "rover_drive", IntegerValue.get((10))), stateChange(BooleanValue.get((true)), "target_in_view")));
        addEvent(simultaneous(commandAck(CommandHandleState.COMMAND_SUCCESS, "rover_stop"), stateChange(IntegerValue.get((42)), "time")));
        addEvent(commandAck(CommandHandleState.COMMAND_SUCCESS, "take_pancam"));
        addEvent(delay());
        addEvent(simultaneous(commandAck(CommandHandleState.COMMAND_FAILED, "rover_stop"), commandAck(CommandHandleState.COMMAND_SUCCESS, "self_destruct")));
        addEvent(delay());
        reset();
    }

}
