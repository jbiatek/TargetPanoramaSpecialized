
package mapped;

import edu.umn.crisys.plexil.runtime.psx.JavaPlexilScript;
import edu.umn.crisys.plexil.runtime.values.BooleanValue;
import edu.umn.crisys.plexil.runtime.values.CommandHandleState;
import edu.umn.crisys.plexil.runtime.values.IntegerValue;

public class test5Script
    extends JavaPlexilScript
{


    public test5Script() {
        addEvent(simultaneous(stateChange(BooleanValue.get((true)), "target_in_view"), stateChange(IntegerValue.get((0)), "time")));
        addEvent(stateChange(IntegerValue.get((1)), "time"));
        addEvent(simultaneous(commandAck(CommandHandleState.COMMAND_FAILED, "rover_drive", IntegerValue.get((10))), stateChange(IntegerValue.get((0)), "time")));
        addEvent(commandAck(CommandHandleState.COMMAND_SUCCESS, "take_pancam"));
        addEvent(delay());
        addEvent(commandAck(CommandHandleState.COMMAND_SUCCESS, "rover_stop"));
        addEvent(delay());
        addEvent(stateChange(IntegerValue.get((0)), "time"));
        addEvent(stateChange(IntegerValue.get((0)), "time"));
        addEvent(stateChange(IntegerValue.get((1)), "time"));
        addEvent(stateChange(IntegerValue.get((10)), "time"));
        addEvent(delay());
        addEvent(commandAck(CommandHandleState.COMMAND_SUCCESS, "rover_stop"));
        addEvent(delay());
        reset();
    }

}
