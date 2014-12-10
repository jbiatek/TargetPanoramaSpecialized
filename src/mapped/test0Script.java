
package mapped;

import edu.umn.crisys.plexil.runtime.psx.JavaPlexilScript;
import edu.umn.crisys.plexil.runtime.values.BooleanValue;
import edu.umn.crisys.plexil.runtime.values.CommandHandleState;
import edu.umn.crisys.plexil.runtime.values.IntegerValue;

public class test0Script
    extends JavaPlexilScript
{


    public test0Script() {
        addEvent(delay());
        addEvent(delay());
        addEvent(stateChange(BooleanValue.get((true)), "target_in_view"));
        addEvent(simultaneous(commandAck(CommandHandleState.COMMAND_FAILED, "rover_stop"), stateChange(IntegerValue.get((0)), "time")));
        addEvent(simultaneous(commandAck(CommandHandleState.COMMAND_FAILED, "rover_drive", IntegerValue.get((10))), stateChange(IntegerValue.get((0)), "time")));
        addEvent(simultaneous(commandAck(CommandHandleState.COMMAND_SUCCESS, "take_pancam"), stateChange(IntegerValue.get((10)), "time")));
        addEvent(delay());
        addEvent(delay());
        addEvent(delay());
        addEvent(commandAck(CommandHandleState.COMMAND_FAILED, "rover_stop"));
        addEvent(delay());
        reset();
    }

}
