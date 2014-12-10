
package mapped;

import edu.umn.crisys.plexil.runtime.psx.JavaPlexilScript;
import edu.umn.crisys.plexil.runtime.values.CommandHandleState;
import edu.umn.crisys.plexil.runtime.values.IntegerValue;

public class test4Script
    extends JavaPlexilScript
{


    public test4Script() {
        addEvent(delay());
        addEvent(simultaneous(commandAck(CommandHandleState.COMMAND_FAILED, "rover_drive", IntegerValue.get((10))), stateChange(IntegerValue.get((10)), "time")));
        addEvent(delay());
        addEvent(commandAck(CommandHandleState.COMMAND_SUCCESS, "take_navcam"));
        addEvent(delay());
        addEvent(delay());
        addEvent(commandAck(CommandHandleState.COMMAND_SUCCESS, "rover_stop"));
        addEvent(delay());
        reset();
    }

}
