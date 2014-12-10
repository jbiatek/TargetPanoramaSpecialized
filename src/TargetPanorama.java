import edu.umn.crisys.plexil.runtime.plx.CommandHandle;
import edu.umn.crisys.plexil.runtime.plx.JavaPlan;
import edu.umn.crisys.plexil.runtime.plx.LibraryInterface;
import edu.umn.crisys.plexil.runtime.plx.SimpleCurrentNext;
import edu.umn.crisys.plexil.runtime.plx.SimplePValue;
import edu.umn.crisys.plexil.runtime.values.BooleanValue;
import edu.umn.crisys.plexil.runtime.values.CommandHandleState;
import edu.umn.crisys.plexil.runtime.values.IntegerValue;
import edu.umn.crisys.plexil.runtime.values.NodeFailureType;
import edu.umn.crisys.plexil.runtime.values.NodeOutcome;
import edu.umn.crisys.plexil.runtime.values.NodeState;
import edu.umn.crisys.plexil.runtime.values.PBoolean;
import edu.umn.crisys.plexil.runtime.values.PNumeric;
import edu.umn.crisys.plexil.runtime.values.PlexilType;
import edu.umn.crisys.plexil.runtime.values.RealValue;
import edu.umn.crisys.plexil.runtime.values.StringValue;
import edu.umn.crisys.plexil.runtime.values.UnknownValue;
import edu.umn.crisys.plexil.runtime.world.ExternalWorld;
import edu.umn.crisys.plexil.test.java.PlanState;
import edu.umn.crisys.plexil.test.java.PlexilTestable;

public class TargetPanorama
    extends JavaPlan
    implements PlexilTestable
{

    private SimplePValue<CommandHandleState> DriveToTarget__HighlySpecificNode____command_handle = new SimplePValue<CommandHandleState>(CommandHandleState.UNKNOWN, PlexilType.COMMAND_HANDLE);
    private SimplePValue<CommandHandleState> DriveToTarget__Drive____command_handle = new SimplePValue<CommandHandleState>(CommandHandleState.UNKNOWN, PlexilType.COMMAND_HANDLE);
    private SimplePValue<PBoolean> DriveToTarget__timeout = new SimplePValue<PBoolean>(BooleanValue.get((false)), PlexilType.BOOLEAN);
    private SimplePValue<NodeOutcome> DriveToTarget____outcome = new SimplePValue<NodeOutcome>(NodeOutcome.UNKNOWN, PlexilType.OUTCOME);
    private SimplePValue<PBoolean> DriveToTarget__StopForTarget__SetDriveFlag____previous_value = new SimplePValue<PBoolean>(UnknownValue.get(), PlexilType.BOOLEAN);
    private SimplePValue<CommandHandleState> DriveToTarget__TakeNavcam____command_handle = new SimplePValue<CommandHandleState>(CommandHandleState.UNKNOWN, PlexilType.COMMAND_HANDLE);
    private SimplePValue<NodeFailureType> DriveToTarget__TakePancam____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<CommandHandleState> DriveToTarget__StopForTarget__Stop____command_handle = new SimplePValue<CommandHandleState>(CommandHandleState.UNKNOWN, PlexilType.COMMAND_HANDLE);
    private SimplePValue<NodeFailureType> DriveToTarget__TakeNavcam____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<PBoolean> DriveToTarget__drive_done = new SimplePValue<PBoolean>(BooleanValue.get((false)), PlexilType.BOOLEAN);
    private SimplePValue<NodeFailureType> DriveToTarget__StopForTarget__SetDriveFlag____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<NodeFailureType> DriveToTarget____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<NodeFailureType> DriveToTarget__StopForTimeout__SetTimeoutFlag____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<NodeFailureType> DriveToTarget__HighlySpecificNode____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<CommandHandleState> DriveToTarget__StopForTimeout__Stop____command_handle = new SimplePValue<CommandHandleState>(CommandHandleState.UNKNOWN, PlexilType.COMMAND_HANDLE);
    private SimplePValue<NodeFailureType> DriveToTarget__Drive____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<NodeFailureType> DriveToTarget__StopForTarget__Stop____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<NodeFailureType> DriveToTarget__StopForTimeout____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<NodeFailureType> DriveToTarget__StopForTarget____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimplePValue<CommandHandleState> DriveToTarget__TakePancam____command_handle = new SimplePValue<CommandHandleState>(CommandHandleState.UNKNOWN, PlexilType.COMMAND_HANDLE);
    private SimplePValue<PBoolean> DriveToTarget__StopForTimeout__SetTimeoutFlag____previous_value = new SimplePValue<PBoolean>(UnknownValue.get(), PlexilType.BOOLEAN);
    private SimplePValue<NodeFailureType> DriveToTarget__StopForTimeout__Stop____failure = new SimplePValue<NodeFailureType>(NodeFailureType.UNKNOWN, PlexilType.FAILURE);
    private SimpleCurrentNext<Integer> DriveToTarget__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__Drive__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__StopForTimeout__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__StopForTimeout__Stop__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__StopForTimeout__SetTimeoutFlag__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__StopForTarget__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__StopForTarget__Stop__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__StopForTarget__SetDriveFlag__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__TakeNavcam__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__TakePancam__state = new SimpleCurrentNext<Integer>(0);
    private SimpleCurrentNext<Integer> DriveToTarget__HighlySpecificNode__state = new SimpleCurrentNext<Integer>(0);

    public TargetPanorama(ExternalWorld world) {
        super(world);
    }

    public TargetPanorama(LibraryInterface inParent) {
        super(((LibraryInterface) null));
        throw new IllegalArgumentException("This PLEXIL file didn't look like a library, so library support isn't included. Please either add an interface to the root node, or use the \"--libs\" option when translating.");
    }

    void MicroStep___DriveToTarget() {
        switch (DriveToTarget__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__4();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__state.getNext()) {
            case  1 :
                MicroStep___DriveToTarget__StopForTimeout();
                MicroStep___DriveToTarget__Drive();
                MicroStep___DriveToTarget__StopForTarget();
                MicroStep___DriveToTarget__TakePancam();
                MicroStep___DriveToTarget__HighlySpecificNode();
                MicroStep___DriveToTarget__TakeNavcam();
                break;
            case  2 :
                MicroStep___DriveToTarget__StopForTimeout();
                MicroStep___DriveToTarget__Drive();
                MicroStep___DriveToTarget__StopForTarget();
                MicroStep___DriveToTarget__TakePancam();
                MicroStep___DriveToTarget__HighlySpecificNode();
                MicroStep___DriveToTarget__TakeNavcam();
                break;
            case  3 :
                MicroStep___DriveToTarget__StopForTimeout();
                MicroStep___DriveToTarget__Drive();
                MicroStep___DriveToTarget__StopForTarget();
                MicroStep___DriveToTarget__TakePancam();
                MicroStep___DriveToTarget__HighlySpecificNode();
                MicroStep___DriveToTarget__TakeNavcam();
                break;
            case  4 :
                MicroStep___DriveToTarget__StopForTimeout();
                MicroStep___DriveToTarget__Drive();
                MicroStep___DriveToTarget__StopForTarget();
                MicroStep___DriveToTarget__TakePancam();
                MicroStep___DriveToTarget__HighlySpecificNode();
                MicroStep___DriveToTarget__TakeNavcam();
                break;
            case  5 :
                MicroStep___DriveToTarget__StopForTimeout();
                MicroStep___DriveToTarget__Drive();
                MicroStep___DriveToTarget__StopForTarget();
                MicroStep___DriveToTarget__TakePancam();
                MicroStep___DriveToTarget__HighlySpecificNode();
                MicroStep___DriveToTarget__TakeNavcam();
                break;
        }
    }

    private void MicroStep___DriveToTarget__0() {
        PBoolean temp;
        /*
(State #0) priority 1 ----> 
DriveToTarget : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (EXECUTING == EXECUTING)
 ----> (State #1)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget : INACTIVE (1) -> WAITING");
        }
        DriveToTarget__state.setNext(1);
        commitAfterMicroStep(DriveToTarget__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__1() {
        PBoolean temp;
        /*
(State #1) priority 6 ----> 
DriveToTarget : WAITING (6) -> EXECUTING
<START_CONDITION T?> (true)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget : WAITING (6) -> EXECUTING");
        }
        DriveToTarget__state.setNext(2);
        commitAfterMicroStep(DriveToTarget__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__2() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #2) priority 5 ----> 
DriveToTarget : EXECUTING (5) -> FINISHING
<END_CONDITION T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state)
 ----> (State #3)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget : EXECUTING (5) -> FINISHING");
            }
            DriveToTarget__state.setNext(3);
            commitAfterMicroStep(DriveToTarget__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__3() {
        PBoolean temp;
        if ((((((STATE___DriveToTarget__Drive().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__Drive().equalTo(NodeState.FINISHED).isTrue())&&(STATE___DriveToTarget__StopForTimeout().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__StopForTimeout().equalTo(NodeState.FINISHED).isTrue()))&&(STATE___DriveToTarget__StopForTarget().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__StopForTarget().equalTo(NodeState.FINISHED).isTrue()))&&(STATE___DriveToTarget__TakeNavcam().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__TakeNavcam().equalTo(NodeState.FINISHED).isTrue()))&&(STATE___DriveToTarget__TakePancam().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__TakePancam().equalTo(NodeState.FINISHED).isTrue()))&&(STATE___DriveToTarget__HighlySpecificNode().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__HighlySpecificNode().equalTo(NodeState.FINISHED).isTrue())) {
            /*
(State #3) priority 5 ----> 
DriveToTarget : FINISHING (5) -> ITERATION_ENDED
<ALL_CHILDREN_WAITING_OR_FINISHED T?> (DriveToTarget__Drive.state == WAITING || DriveToTarget__Drive.state == FINISHED && DriveToTarget__StopForTimeout.state == WAITING || DriveToTarget__StopForTimeout.state == FINISHED && DriveToTarget__StopForTarget.state == WAITING || DriveToTarget__StopForTarget.state == FINISHED && DriveToTarget__TakeNavcam.state == WAITING || DriveToTarget__TakeNavcam.state == FINISHED && DriveToTarget__TakePancam.state == WAITING || DriveToTarget__TakePancam.state == FINISHED && DriveToTarget__HighlySpecificNode.state == WAITING || DriveToTarget__HighlySpecificNode.state == FINISHED)
<POST_CONDITION T?> (true)
[ Assignment: DriveToTarget.outcome = SUCCESS, Assignment: DriveToTarget.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget : FINISHING (5) -> ITERATION_ENDED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("DriveToTarget.outcome: New value set to "+ NodeOutcome.SUCCESS));
            }
            DriveToTarget____outcome.setNext(NodeOutcome.SUCCESS);
            commitAfterMicroStep(DriveToTarget____outcome);
            if (JavaPlan.DEBUG) {
                System.out.println(("DriveToTarget.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget____failure);
            DriveToTarget__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__4() {
        PBoolean temp;
        /*
(State #4) priority 4 ----> 
DriveToTarget : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #5)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget : ITERATION_ENDED (4) -> FINISHED");
        }
        DriveToTarget__state.setNext(5);
        commitAfterMicroStep(DriveToTarget__state);
        changeOccurred();
    }

    public NodeState STATE___DriveToTarget() {
        switch (DriveToTarget__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  4 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  5 :
                return NodeState.FINISHED;
            case  3 :
                return NodeState.FINISHING;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget");
    }

    void MicroStep___DriveToTarget__Drive() {
        switch (DriveToTarget__Drive__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__Drive__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__Drive__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__Drive__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__Drive__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__Drive__4();
                break;
            case  5 :
                MicroStep___DriveToTarget__Drive__5();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__Drive__state.getNext()) {
        }
    }

    private void MicroStep___DriveToTarget__Drive__0() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__Drive : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget.state == FINISHED)
[ Assignment: Drive.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__Drive : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("Drive.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__Drive____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__Drive____failure);
            DriveToTarget__Drive__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__Drive__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__Drive : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__Drive : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__Drive__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__Drive__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__Drive__1() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__Drive : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: Drive.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__Drive : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("Drive.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__Drive____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__Drive____failure);
            DriveToTarget__Drive__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__Drive__state);
            changeOccurred();
        } else {
            /*
(State #1) priority 6 ----> 
DriveToTarget__Drive : WAITING (6) -> EXECUTING
<START_CONDITION T?> (true)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__Drive : WAITING (6) -> EXECUTING");
            }
            getWorld().command(new CommandHandle(DriveToTarget__Drive____command_handle), StringValue.get(("rover_drive")), IntegerValue.get((10)));
            endMacroStep();
            DriveToTarget__Drive__state.setNext(2);
            commitAfterMicroStep(DriveToTarget__Drive__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__Drive__2() {
        PBoolean temp;
        /*
(State #2) priority 5 ----> 
DriveToTarget__Drive : EXECUTING (5) -> FINISHING
<END_CONDITION T?> (true || Drive.command_handle == COMMAND_DENIED || Drive.command_handle == COMMAND_FAILED)
 ----> (State #3)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget__Drive : EXECUTING (5) -> FINISHING");
        }
        DriveToTarget__Drive__state.setNext(3);
        commitAfterMicroStep(DriveToTarget__Drive__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__Drive__3() {
        PBoolean temp;
        if (BooleanValue.get(DriveToTarget__Drive____command_handle.getCurrent().isKnown()).isTrue()) {
            /*
(State #3) priority 5 ----> 
DriveToTarget__Drive : FINISHING (5) -> ITERATION_ENDED
<COMMAND_ACCEPTED T?> (isKnown(Drive.command_handle))
<POST_CONDITION T?> (true)
[ Assignment: Drive.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__Drive : FINISHING (5) -> ITERATION_ENDED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("Drive.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__Drive____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__Drive____failure);
            DriveToTarget__Drive__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__Drive__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__Drive__4() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #4) priority 3 ----> 
DriveToTarget__Drive : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__Drive : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__Drive__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__Drive__state);
            changeOccurred();
        } else {
            /*
(State #4) priority 4 ----> 
DriveToTarget__Drive : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__Drive : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__Drive__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__Drive__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__Drive__5() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #5) priority 1 ----> 
DriveToTarget__Drive : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget.state == WAITING)
[ Reset variables: Drive.command_handle, Drive.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__Drive : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__Drive____command_handle.setNext(CommandHandleState.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__Drive____command_handle);
            DriveToTarget__Drive____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__Drive____failure);
            DriveToTarget__Drive__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__Drive__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__Drive() {
        switch (DriveToTarget__Drive__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  4 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  5 :
                return NodeState.FINISHED;
            case  3 :
                return NodeState.FINISHING;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__Drive");
    }

    void MicroStep___DriveToTarget__StopForTimeout() {
        switch (DriveToTarget__StopForTimeout__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__StopForTimeout__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__StopForTimeout__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__StopForTimeout__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__StopForTimeout__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__StopForTimeout__4();
                break;
            case  5 :
                MicroStep___DriveToTarget__StopForTimeout__5();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__StopForTimeout__state.getNext()) {
            case  1 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag();
                MicroStep___DriveToTarget__StopForTimeout__Stop();
                break;
            case  2 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag();
                MicroStep___DriveToTarget__StopForTimeout__Stop();
                break;
            case  3 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag();
                MicroStep___DriveToTarget__StopForTimeout__Stop();
                break;
            case  4 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag();
                MicroStep___DriveToTarget__StopForTimeout__Stop();
                break;
            case  5 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag();
                MicroStep___DriveToTarget__StopForTimeout__Stop();
                break;
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__0() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTimeout : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget.state == FINISHED)
[ Assignment: StopForTimeout.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("StopForTimeout.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTimeout____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout____failure);
            DriveToTarget__StopForTimeout__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTimeout : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__StopForTimeout : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__StopForTimeout__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__StopForTimeout__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__1() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__StopForTimeout : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: StopForTimeout.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("StopForTimeout.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTimeout____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout____failure);
            DriveToTarget__StopForTimeout__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__state);
            changeOccurred();
        } else {
            if (((PNumeric) getWorld().lookupOnChange(StringValue.get(("time")), RealValue.get((0.1)))).ge(IntegerValue.get((10))).isTrue()) {
                /*
(State #1) priority 6 ----> 
DriveToTarget__StopForTimeout : WAITING (6) -> EXECUTING
<START_CONDITION T?> ((PNumeric) (LookupOnChange(time, 0.1)) >= 10)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__StopForTimeout : WAITING (6) -> EXECUTING");
                }
                DriveToTarget__StopForTimeout__state.setNext(2);
                commitAfterMicroStep(DriveToTarget__StopForTimeout__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__2() {
        PBoolean temp;
        if (NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__SetTimeoutFlag()).isTrue()) {
            /*
(State #2) priority 5 ----> 
DriveToTarget__StopForTimeout : EXECUTING (5) -> FINISHING
<END_CONDITION T?> (FINISHED == DriveToTarget__StopForTimeout__Stop.state && FINISHED == DriveToTarget__StopForTimeout__SetTimeoutFlag.state)
 ----> (State #3)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout : EXECUTING (5) -> FINISHING");
            }
            DriveToTarget__StopForTimeout__state.setNext(3);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__3() {
        PBoolean temp;
        if ((STATE___DriveToTarget__StopForTimeout__Stop().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__StopForTimeout__Stop().equalTo(NodeState.FINISHED).isTrue())&&(STATE___DriveToTarget__StopForTimeout__SetTimeoutFlag().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__StopForTimeout__SetTimeoutFlag().equalTo(NodeState.FINISHED).isTrue())) {
            /*
(State #3) priority 5 ----> 
DriveToTarget__StopForTimeout : FINISHING (5) -> ITERATION_ENDED
<ALL_CHILDREN_WAITING_OR_FINISHED T?> (DriveToTarget__StopForTimeout__Stop.state == WAITING || DriveToTarget__StopForTimeout__Stop.state == FINISHED && DriveToTarget__StopForTimeout__SetTimeoutFlag.state == WAITING || DriveToTarget__StopForTimeout__SetTimeoutFlag.state == FINISHED)
<POST_CONDITION T?> (true)
[ Assignment: StopForTimeout.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout : FINISHING (5) -> ITERATION_ENDED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("StopForTimeout.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTimeout____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout____failure);
            DriveToTarget__StopForTimeout__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__4() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #4) priority 3 ----> 
DriveToTarget__StopForTimeout : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__StopForTimeout__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__state);
            changeOccurred();
        } else {
            /*
(State #4) priority 4 ----> 
DriveToTarget__StopForTimeout : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__StopForTimeout__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__5() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #5) priority 1 ----> 
DriveToTarget__StopForTimeout : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget.state == WAITING)
[ Reset variables: StopForTimeout.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__StopForTimeout____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout____failure);
            DriveToTarget__StopForTimeout__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__StopForTimeout() {
        switch (DriveToTarget__StopForTimeout__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  4 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  5 :
                return NodeState.FINISHED;
            case  3 :
                return NodeState.FINISHING;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__StopForTimeout");
    }

    void MicroStep___DriveToTarget__StopForTimeout__Stop() {
        switch (DriveToTarget__StopForTimeout__Stop__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__StopForTimeout__Stop__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__StopForTimeout__Stop__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__StopForTimeout__Stop__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__StopForTimeout__Stop__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__StopForTimeout__Stop__4();
                break;
            case  5 :
                MicroStep___DriveToTarget__StopForTimeout__Stop__5();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__StopForTimeout__Stop__state.getNext()) {
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__Stop__0() {
        PBoolean temp;
        if (STATE___DriveToTarget__StopForTimeout().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTimeout__Stop : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget__StopForTimeout.state == FINISHED)
[ Assignment: Stop.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__Stop : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("Stop.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTimeout__Stop____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop____failure);
            DriveToTarget__StopForTimeout__Stop__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget__StopForTimeout().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTimeout__Stop : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget__StopForTimeout.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__StopForTimeout__Stop : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__StopForTimeout__Stop__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__Stop__1() {
        PBoolean temp;
        if ((NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__SetTimeoutFlag()).isTrue())||(((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue())) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__StopForTimeout__Stop : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__StopForTimeout__Stop.state && FINISHED == DriveToTarget__StopForTimeout__SetTimeoutFlag.state || FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: Stop.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__Stop : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("Stop.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTimeout__Stop____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop____failure);
            DriveToTarget__StopForTimeout__Stop__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop__state);
            changeOccurred();
        } else {
            /*
(State #1) priority 6 ----> 
DriveToTarget__StopForTimeout__Stop : WAITING (6) -> EXECUTING
<START_CONDITION T?> (true)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__Stop : WAITING (6) -> EXECUTING");
            }
            getWorld().command(new CommandHandle(DriveToTarget__StopForTimeout__Stop____command_handle), StringValue.get(("rover_stop")));
            endMacroStep();
            DriveToTarget__StopForTimeout__Stop__state.setNext(2);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__Stop__2() {
        PBoolean temp;
        /*
(State #2) priority 5 ----> 
DriveToTarget__StopForTimeout__Stop : EXECUTING (5) -> FINISHING
<END_CONDITION T?> (true || Stop.command_handle == COMMAND_DENIED || Stop.command_handle == COMMAND_FAILED)
 ----> (State #3)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget__StopForTimeout__Stop : EXECUTING (5) -> FINISHING");
        }
        DriveToTarget__StopForTimeout__Stop__state.setNext(3);
        commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__StopForTimeout__Stop__3() {
        PBoolean temp;
        if (BooleanValue.get(DriveToTarget__StopForTimeout__Stop____command_handle.getCurrent().isKnown()).isTrue()) {
            /*
(State #3) priority 5 ----> 
DriveToTarget__StopForTimeout__Stop : FINISHING (5) -> ITERATION_ENDED
<COMMAND_ACCEPTED T?> (isKnown(Stop.command_handle))
<POST_CONDITION T?> (true)
[ Assignment: Stop.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__Stop : FINISHING (5) -> ITERATION_ENDED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("Stop.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTimeout__Stop____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop____failure);
            DriveToTarget__StopForTimeout__Stop__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__Stop__4() {
        PBoolean temp;
        if ((NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__SetTimeoutFlag()).isTrue())||(((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue())) {
            /*
(State #4) priority 3 ----> 
DriveToTarget__StopForTimeout__Stop : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__StopForTimeout__Stop.state && FINISHED == DriveToTarget__StopForTimeout__SetTimeoutFlag.state || FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__Stop : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__StopForTimeout__Stop__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop__state);
            changeOccurred();
        } else {
            /*
(State #4) priority 4 ----> 
DriveToTarget__StopForTimeout__Stop : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__Stop : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__StopForTimeout__Stop__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__Stop__5() {
        PBoolean temp;
        if (STATE___DriveToTarget__StopForTimeout().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #5) priority 1 ----> 
DriveToTarget__StopForTimeout__Stop : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget__StopForTimeout.state == WAITING)
[ Reset variables: Stop.command_handle, Stop.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__Stop : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__StopForTimeout__Stop____command_handle.setNext(CommandHandleState.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop____command_handle);
            DriveToTarget__StopForTimeout__Stop____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop____failure);
            DriveToTarget__StopForTimeout__Stop__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__Stop__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__StopForTimeout__Stop() {
        switch (DriveToTarget__StopForTimeout__Stop__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  4 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  5 :
                return NodeState.FINISHED;
            case  3 :
                return NodeState.FINISHING;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__StopForTimeout__Stop");
    }

    void MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag() {
        switch (DriveToTarget__StopForTimeout__SetTimeoutFlag__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__4();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__StopForTimeout__SetTimeoutFlag__state.getNext()) {
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__0() {
        PBoolean temp;
        if (STATE___DriveToTarget__StopForTimeout().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTimeout__SetTimeoutFlag : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget__StopForTimeout.state == FINISHED)
[ Assignment: SetTimeoutFlag.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__SetTimeoutFlag : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("SetTimeoutFlag.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTimeout__SetTimeoutFlag____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag____failure);
            DriveToTarget__StopForTimeout__SetTimeoutFlag__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget__StopForTimeout().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTimeout__SetTimeoutFlag : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget__StopForTimeout.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__StopForTimeout__SetTimeoutFlag : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__StopForTimeout__SetTimeoutFlag__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__1() {
        PBoolean temp;
        if ((NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__SetTimeoutFlag()).isTrue())||(((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue())) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__StopForTimeout__SetTimeoutFlag : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__StopForTimeout__Stop.state && FINISHED == DriveToTarget__StopForTimeout__SetTimeoutFlag.state || FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: SetTimeoutFlag.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__SetTimeoutFlag : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("SetTimeoutFlag.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTimeout__SetTimeoutFlag____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag____failure);
            DriveToTarget__StopForTimeout__SetTimeoutFlag__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag__state);
            changeOccurred();
        } else {
            /*
(State #1) priority 6 ----> 
DriveToTarget__StopForTimeout__SetTimeoutFlag : WAITING (6) -> EXECUTING
<START_CONDITION T?> (true)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__SetTimeoutFlag : WAITING (6) -> EXECUTING");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("timeout: New value set to "+ BooleanValue.get((true))));
            }
            DriveToTarget__timeout.setNext(BooleanValue.get((true)));
            commitAfterMicroStep(DriveToTarget__timeout);
            if (JavaPlan.DEBUG) {
                System.out.println(("SetTimeoutFlag.previous_value: New value set to "+ DriveToTarget__timeout.getCurrent()));
            }
            DriveToTarget__StopForTimeout__SetTimeoutFlag____previous_value.setNext(DriveToTarget__timeout.getCurrent());
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag____previous_value);
            endMacroStep();
            DriveToTarget__StopForTimeout__SetTimeoutFlag__state.setNext(2);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__2() {
        PBoolean temp;
        /*
(State #2) priority 5 ----> 
DriveToTarget__StopForTimeout__SetTimeoutFlag : EXECUTING (5) -> ITERATION_ENDED
<END_CONDITION T?> (true)
<POST_CONDITION T?> (true)
[ Assignment: SetTimeoutFlag.failure = UNKNOWN ]
 ----> (State #3)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget__StopForTimeout__SetTimeoutFlag : EXECUTING (5) -> ITERATION_ENDED");
        }
        if (JavaPlan.DEBUG) {
            System.out.println(("SetTimeoutFlag.failure: New value set to "+ NodeFailureType.UNKNOWN));
        }
        DriveToTarget__StopForTimeout__SetTimeoutFlag____failure.setNext(NodeFailureType.UNKNOWN);
        commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag____failure);
        DriveToTarget__StopForTimeout__SetTimeoutFlag__state.setNext(3);
        commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__3() {
        PBoolean temp;
        if ((NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout__SetTimeoutFlag()).isTrue())||(((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue())) {
            /*
(State #3) priority 3 ----> 
DriveToTarget__StopForTimeout__SetTimeoutFlag : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__StopForTimeout__Stop.state && FINISHED == DriveToTarget__StopForTimeout__SetTimeoutFlag.state || FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__SetTimeoutFlag : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__StopForTimeout__SetTimeoutFlag__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag__state);
            changeOccurred();
        } else {
            /*
(State #3) priority 4 ----> 
DriveToTarget__StopForTimeout__SetTimeoutFlag : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__SetTimeoutFlag : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__StopForTimeout__SetTimeoutFlag__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTimeout__SetTimeoutFlag__4() {
        PBoolean temp;
        if (STATE___DriveToTarget__StopForTimeout().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #4) priority 1 ----> 
DriveToTarget__StopForTimeout__SetTimeoutFlag : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget__StopForTimeout.state == WAITING)
[ Reset variables: SetTimeoutFlag.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTimeout__SetTimeoutFlag : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__StopForTimeout__SetTimeoutFlag____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag____failure);
            DriveToTarget__StopForTimeout__SetTimeoutFlag__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__StopForTimeout__SetTimeoutFlag__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__StopForTimeout__SetTimeoutFlag() {
        switch (DriveToTarget__StopForTimeout__SetTimeoutFlag__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  3 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  4 :
                return NodeState.FINISHED;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__StopForTimeout__SetTimeoutFlag");
    }

    void MicroStep___DriveToTarget__StopForTarget() {
        switch (DriveToTarget__StopForTarget__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__StopForTarget__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__StopForTarget__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__StopForTarget__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__StopForTarget__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__StopForTarget__4();
                break;
            case  5 :
                MicroStep___DriveToTarget__StopForTarget__5();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__StopForTarget__state.getNext()) {
            case  1 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag();
                MicroStep___DriveToTarget__StopForTarget__Stop();
                break;
            case  2 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag();
                MicroStep___DriveToTarget__StopForTarget__Stop();
                break;
            case  3 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag();
                MicroStep___DriveToTarget__StopForTarget__Stop();
                break;
            case  4 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag();
                MicroStep___DriveToTarget__StopForTarget__Stop();
                break;
            case  5 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag();
                MicroStep___DriveToTarget__StopForTarget__Stop();
                break;
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__0() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTarget : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget.state == FINISHED)
[ Assignment: StopForTarget.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("StopForTarget.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTarget____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget____failure);
            DriveToTarget__StopForTarget__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTarget__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTarget : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__StopForTarget : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__StopForTarget__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__StopForTarget__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__1() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__StopForTarget : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: StopForTarget.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("StopForTarget.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTarget____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget____failure);
            DriveToTarget__StopForTarget__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTarget__state);
            changeOccurred();
        } else {
            if (DriveToTarget__timeout.getCurrent().isTrue()) {
                /*
(State #1) priority 5 ----> 
DriveToTarget__StopForTarget : WAITING (5) -> FINISHED
<SKIP_CONDITION T?> (timeout)
[ Assignment: StopForTarget.failure = UNKNOWN ]
 ----> (State #5)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__StopForTarget : WAITING (5) -> FINISHED");
                }
                if (JavaPlan.DEBUG) {
                    System.out.println(("StopForTarget.failure: New value set to "+ NodeFailureType.UNKNOWN));
                }
                DriveToTarget__StopForTarget____failure.setNext(NodeFailureType.UNKNOWN);
                commitAfterMicroStep(DriveToTarget__StopForTarget____failure);
                DriveToTarget__StopForTarget__state.setNext(5);
                commitAfterMicroStep(DriveToTarget__StopForTarget__state);
                changeOccurred();
            } else {
                if (((PBoolean) getWorld().lookupOnChange(StringValue.get(("target_in_view")), RealValue.get((0.0)))).isTrue()) {
                    /*
(State #1) priority 6 ----> 
DriveToTarget__StopForTarget : WAITING (6) -> EXECUTING
<START_CONDITION T?> ((PBoolean) (LookupOnChange(target_in_view, 0.0)))
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
                    if (JavaPlan.DEBUG) {
                        System.out.println("DriveToTarget__StopForTarget : WAITING (6) -> EXECUTING");
                    }
                    DriveToTarget__StopForTarget__state.setNext(2);
                    commitAfterMicroStep(DriveToTarget__StopForTarget__state);
                    changeOccurred();
                }
            }
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__2() {
        PBoolean temp;
        if (NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__SetDriveFlag()).isTrue()) {
            /*
(State #2) priority 5 ----> 
DriveToTarget__StopForTarget : EXECUTING (5) -> FINISHING
<END_CONDITION T?> (FINISHED == DriveToTarget__StopForTarget__Stop.state && FINISHED == DriveToTarget__StopForTarget__SetDriveFlag.state)
 ----> (State #3)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget : EXECUTING (5) -> FINISHING");
            }
            DriveToTarget__StopForTarget__state.setNext(3);
            commitAfterMicroStep(DriveToTarget__StopForTarget__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__3() {
        PBoolean temp;
        if ((STATE___DriveToTarget__StopForTarget__Stop().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__StopForTarget__Stop().equalTo(NodeState.FINISHED).isTrue())&&(STATE___DriveToTarget__StopForTarget__SetDriveFlag().equalTo(NodeState.WAITING).isTrue()||STATE___DriveToTarget__StopForTarget__SetDriveFlag().equalTo(NodeState.FINISHED).isTrue())) {
            /*
(State #3) priority 5 ----> 
DriveToTarget__StopForTarget : FINISHING (5) -> ITERATION_ENDED
<ALL_CHILDREN_WAITING_OR_FINISHED T?> (DriveToTarget__StopForTarget__Stop.state == WAITING || DriveToTarget__StopForTarget__Stop.state == FINISHED && DriveToTarget__StopForTarget__SetDriveFlag.state == WAITING || DriveToTarget__StopForTarget__SetDriveFlag.state == FINISHED)
<POST_CONDITION T?> (true)
[ Assignment: StopForTarget.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget : FINISHING (5) -> ITERATION_ENDED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("StopForTarget.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTarget____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget____failure);
            DriveToTarget__StopForTarget__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTarget__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__4() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #4) priority 3 ----> 
DriveToTarget__StopForTarget : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__StopForTarget__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTarget__state);
            changeOccurred();
        } else {
            /*
(State #4) priority 4 ----> 
DriveToTarget__StopForTarget : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__StopForTarget__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTarget__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__5() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #5) priority 1 ----> 
DriveToTarget__StopForTarget : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget.state == WAITING)
[ Reset variables: StopForTarget.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__StopForTarget____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget____failure);
            DriveToTarget__StopForTarget__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__StopForTarget__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__StopForTarget() {
        switch (DriveToTarget__StopForTarget__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  4 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  5 :
                return NodeState.FINISHED;
            case  3 :
                return NodeState.FINISHING;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__StopForTarget");
    }

    void MicroStep___DriveToTarget__StopForTarget__Stop() {
        switch (DriveToTarget__StopForTarget__Stop__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__StopForTarget__Stop__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__StopForTarget__Stop__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__StopForTarget__Stop__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__StopForTarget__Stop__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__StopForTarget__Stop__4();
                break;
            case  5 :
                MicroStep___DriveToTarget__StopForTarget__Stop__5();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__StopForTarget__Stop__state.getNext()) {
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__Stop__0() {
        PBoolean temp;
        if (STATE___DriveToTarget__StopForTarget().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTarget__Stop : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget__StopForTarget.state == FINISHED)
[ Assignment: Stop.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__Stop : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("Stop.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTarget__Stop____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop____failure);
            DriveToTarget__StopForTarget__Stop__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget__StopForTarget().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTarget__Stop : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget__StopForTarget.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__StopForTarget__Stop : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__StopForTarget__Stop__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__StopForTarget__Stop__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__Stop__1() {
        PBoolean temp;
        if ((NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__SetDriveFlag()).isTrue())||(((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue())) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__StopForTarget__Stop : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__StopForTarget__Stop.state && FINISHED == DriveToTarget__StopForTarget__SetDriveFlag.state || FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: Stop.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__Stop : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("Stop.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTarget__Stop____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop____failure);
            DriveToTarget__StopForTarget__Stop__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop__state);
            changeOccurred();
        } else {
            /*
(State #1) priority 6 ----> 
DriveToTarget__StopForTarget__Stop : WAITING (6) -> EXECUTING
<START_CONDITION T?> (true)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__Stop : WAITING (6) -> EXECUTING");
            }
            getWorld().command(new CommandHandle(DriveToTarget__StopForTarget__Stop____command_handle), StringValue.get(("rover_stop")));
            endMacroStep();
            DriveToTarget__StopForTarget__Stop__state.setNext(2);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__Stop__2() {
        PBoolean temp;
        /*
(State #2) priority 5 ----> 
DriveToTarget__StopForTarget__Stop : EXECUTING (5) -> FINISHING
<END_CONDITION T?> (true || Stop.command_handle == COMMAND_DENIED || Stop.command_handle == COMMAND_FAILED)
 ----> (State #3)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget__StopForTarget__Stop : EXECUTING (5) -> FINISHING");
        }
        DriveToTarget__StopForTarget__Stop__state.setNext(3);
        commitAfterMicroStep(DriveToTarget__StopForTarget__Stop__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__StopForTarget__Stop__3() {
        PBoolean temp;
        if (BooleanValue.get(DriveToTarget__StopForTarget__Stop____command_handle.getCurrent().isKnown()).isTrue()) {
            /*
(State #3) priority 5 ----> 
DriveToTarget__StopForTarget__Stop : FINISHING (5) -> ITERATION_ENDED
<COMMAND_ACCEPTED T?> (isKnown(Stop.command_handle))
<POST_CONDITION T?> (true)
[ Assignment: Stop.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__Stop : FINISHING (5) -> ITERATION_ENDED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("Stop.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTarget__Stop____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop____failure);
            DriveToTarget__StopForTarget__Stop__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__Stop__4() {
        PBoolean temp;
        if ((NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__SetDriveFlag()).isTrue())||(((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue())) {
            /*
(State #4) priority 3 ----> 
DriveToTarget__StopForTarget__Stop : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__StopForTarget__Stop.state && FINISHED == DriveToTarget__StopForTarget__SetDriveFlag.state || FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__Stop : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__StopForTarget__Stop__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop__state);
            changeOccurred();
        } else {
            /*
(State #4) priority 4 ----> 
DriveToTarget__StopForTarget__Stop : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__Stop : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__StopForTarget__Stop__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__Stop__5() {
        PBoolean temp;
        if (STATE___DriveToTarget__StopForTarget().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #5) priority 1 ----> 
DriveToTarget__StopForTarget__Stop : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget__StopForTarget.state == WAITING)
[ Reset variables: Stop.command_handle, Stop.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__Stop : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__StopForTarget__Stop____command_handle.setNext(CommandHandleState.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop____command_handle);
            DriveToTarget__StopForTarget__Stop____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop____failure);
            DriveToTarget__StopForTarget__Stop__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__StopForTarget__Stop__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__StopForTarget__Stop() {
        switch (DriveToTarget__StopForTarget__Stop__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  4 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  5 :
                return NodeState.FINISHED;
            case  3 :
                return NodeState.FINISHING;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__StopForTarget__Stop");
    }

    void MicroStep___DriveToTarget__StopForTarget__SetDriveFlag() {
        switch (DriveToTarget__StopForTarget__SetDriveFlag__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__4();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__StopForTarget__SetDriveFlag__state.getNext()) {
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__0() {
        PBoolean temp;
        if (STATE___DriveToTarget__StopForTarget().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTarget__SetDriveFlag : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget__StopForTarget.state == FINISHED)
[ Assignment: SetDriveFlag.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__SetDriveFlag : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("SetDriveFlag.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTarget__SetDriveFlag____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag____failure);
            DriveToTarget__StopForTarget__SetDriveFlag__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget__StopForTarget().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__StopForTarget__SetDriveFlag : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget__StopForTarget.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__StopForTarget__SetDriveFlag : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__StopForTarget__SetDriveFlag__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__1() {
        PBoolean temp;
        if ((NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__SetDriveFlag()).isTrue())||(((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue())) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__StopForTarget__SetDriveFlag : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__StopForTarget__Stop.state && FINISHED == DriveToTarget__StopForTarget__SetDriveFlag.state || FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: SetDriveFlag.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__SetDriveFlag : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("SetDriveFlag.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__StopForTarget__SetDriveFlag____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag____failure);
            DriveToTarget__StopForTarget__SetDriveFlag__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag__state);
            changeOccurred();
        } else {
            /*
(State #1) priority 6 ----> 
DriveToTarget__StopForTarget__SetDriveFlag : WAITING (6) -> EXECUTING
<START_CONDITION T?> (true)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__SetDriveFlag : WAITING (6) -> EXECUTING");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("drive_done: New value set to "+ BooleanValue.get((true))));
            }
            DriveToTarget__drive_done.setNext(BooleanValue.get((true)));
            commitAfterMicroStep(DriveToTarget__drive_done);
            if (JavaPlan.DEBUG) {
                System.out.println(("SetDriveFlag.previous_value: New value set to "+ DriveToTarget__drive_done.getCurrent()));
            }
            DriveToTarget__StopForTarget__SetDriveFlag____previous_value.setNext(DriveToTarget__drive_done.getCurrent());
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag____previous_value);
            endMacroStep();
            DriveToTarget__StopForTarget__SetDriveFlag__state.setNext(2);
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__2() {
        PBoolean temp;
        /*
(State #2) priority 5 ----> 
DriveToTarget__StopForTarget__SetDriveFlag : EXECUTING (5) -> ITERATION_ENDED
<END_CONDITION T?> (true)
<POST_CONDITION T?> (true)
[ Assignment: SetDriveFlag.failure = UNKNOWN ]
 ----> (State #3)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget__StopForTarget__SetDriveFlag : EXECUTING (5) -> ITERATION_ENDED");
        }
        if (JavaPlan.DEBUG) {
            System.out.println(("SetDriveFlag.failure: New value set to "+ NodeFailureType.UNKNOWN));
        }
        DriveToTarget__StopForTarget__SetDriveFlag____failure.setNext(NodeFailureType.UNKNOWN);
        commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag____failure);
        DriveToTarget__StopForTarget__SetDriveFlag__state.setNext(3);
        commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__3() {
        PBoolean temp;
        if ((NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__Stop()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget__SetDriveFlag()).isTrue())||(((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue())) {
            /*
(State #3) priority 3 ----> 
DriveToTarget__StopForTarget__SetDriveFlag : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__StopForTarget__Stop.state && FINISHED == DriveToTarget__StopForTarget__SetDriveFlag.state || FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__SetDriveFlag : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__StopForTarget__SetDriveFlag__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag__state);
            changeOccurred();
        } else {
            /*
(State #3) priority 4 ----> 
DriveToTarget__StopForTarget__SetDriveFlag : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__SetDriveFlag : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__StopForTarget__SetDriveFlag__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__StopForTarget__SetDriveFlag__4() {
        PBoolean temp;
        if (STATE___DriveToTarget__StopForTarget().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #4) priority 1 ----> 
DriveToTarget__StopForTarget__SetDriveFlag : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget__StopForTarget.state == WAITING)
[ Reset variables: SetDriveFlag.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__StopForTarget__SetDriveFlag : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__StopForTarget__SetDriveFlag____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag____failure);
            DriveToTarget__StopForTarget__SetDriveFlag__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__StopForTarget__SetDriveFlag__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__StopForTarget__SetDriveFlag() {
        switch (DriveToTarget__StopForTarget__SetDriveFlag__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  3 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  4 :
                return NodeState.FINISHED;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__StopForTarget__SetDriveFlag");
    }

    void MicroStep___DriveToTarget__TakeNavcam() {
        switch (DriveToTarget__TakeNavcam__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__TakeNavcam__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__TakeNavcam__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__TakeNavcam__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__TakeNavcam__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__TakeNavcam__4();
                break;
            case  5 :
                MicroStep___DriveToTarget__TakeNavcam__5();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__TakeNavcam__state.getNext()) {
        }
    }

    private void MicroStep___DriveToTarget__TakeNavcam__0() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__TakeNavcam : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget.state == FINISHED)
[ Assignment: TakeNavcam.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakeNavcam : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("TakeNavcam.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__TakeNavcam____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakeNavcam____failure);
            DriveToTarget__TakeNavcam__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__TakeNavcam : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__TakeNavcam : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__TakeNavcam__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__TakeNavcam__1() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__TakeNavcam : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: TakeNavcam.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakeNavcam : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("TakeNavcam.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__TakeNavcam____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakeNavcam____failure);
            DriveToTarget__TakeNavcam__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
            changeOccurred();
        } else {
            if (DriveToTarget__drive_done.getCurrent().isTrue()) {
                /*
(State #1) priority 5 ----> 
DriveToTarget__TakeNavcam : WAITING (5) -> FINISHED
<SKIP_CONDITION T?> (drive_done)
[ Assignment: TakeNavcam.failure = UNKNOWN ]
 ----> (State #5)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__TakeNavcam : WAITING (5) -> FINISHED");
                }
                if (JavaPlan.DEBUG) {
                    System.out.println(("TakeNavcam.failure: New value set to "+ NodeFailureType.UNKNOWN));
                }
                DriveToTarget__TakeNavcam____failure.setNext(NodeFailureType.UNKNOWN);
                commitAfterMicroStep(DriveToTarget__TakeNavcam____failure);
                DriveToTarget__TakeNavcam__state.setNext(5);
                commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
                changeOccurred();
            } else {
                if (DriveToTarget__timeout.getCurrent().isTrue()) {
                    /*
(State #1) priority 6 ----> 
DriveToTarget__TakeNavcam : WAITING (6) -> EXECUTING
<START_CONDITION T?> (timeout)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
                    if (JavaPlan.DEBUG) {
                        System.out.println("DriveToTarget__TakeNavcam : WAITING (6) -> EXECUTING");
                    }
                    getWorld().command(new CommandHandle(DriveToTarget__TakeNavcam____command_handle), StringValue.get(("take_navcam")));
                    endMacroStep();
                    DriveToTarget__TakeNavcam__state.setNext(2);
                    commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
                    changeOccurred();
                }
            }
        }
    }

    private void MicroStep___DriveToTarget__TakeNavcam__2() {
        PBoolean temp;
        /*
(State #2) priority 5 ----> 
DriveToTarget__TakeNavcam : EXECUTING (5) -> FINISHING
<END_CONDITION T?> (true || TakeNavcam.command_handle == COMMAND_DENIED || TakeNavcam.command_handle == COMMAND_FAILED)
 ----> (State #3)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget__TakeNavcam : EXECUTING (5) -> FINISHING");
        }
        DriveToTarget__TakeNavcam__state.setNext(3);
        commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__TakeNavcam__3() {
        PBoolean temp;
        if (BooleanValue.get(DriveToTarget__TakeNavcam____command_handle.getCurrent().isKnown()).isTrue()) {
            /*
(State #3) priority 5 ----> 
DriveToTarget__TakeNavcam : FINISHING (5) -> ITERATION_ENDED
<COMMAND_ACCEPTED T?> (isKnown(TakeNavcam.command_handle))
<POST_CONDITION T?> (true)
[ Assignment: TakeNavcam.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakeNavcam : FINISHING (5) -> ITERATION_ENDED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("TakeNavcam.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__TakeNavcam____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakeNavcam____failure);
            DriveToTarget__TakeNavcam__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__TakeNavcam__4() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #4) priority 3 ----> 
DriveToTarget__TakeNavcam : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakeNavcam : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__TakeNavcam__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
            changeOccurred();
        } else {
            /*
(State #4) priority 4 ----> 
DriveToTarget__TakeNavcam : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakeNavcam : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__TakeNavcam__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__TakeNavcam__5() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #5) priority 1 ----> 
DriveToTarget__TakeNavcam : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget.state == WAITING)
[ Reset variables: TakeNavcam.command_handle, TakeNavcam.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakeNavcam : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__TakeNavcam____command_handle.setNext(CommandHandleState.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakeNavcam____command_handle);
            DriveToTarget__TakeNavcam____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakeNavcam____failure);
            DriveToTarget__TakeNavcam__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__TakeNavcam__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__TakeNavcam() {
        switch (DriveToTarget__TakeNavcam__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  4 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  5 :
                return NodeState.FINISHED;
            case  3 :
                return NodeState.FINISHING;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__TakeNavcam");
    }

    void MicroStep___DriveToTarget__TakePancam() {
        switch (DriveToTarget__TakePancam__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__TakePancam__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__TakePancam__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__TakePancam__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__TakePancam__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__TakePancam__4();
                break;
            case  5 :
                MicroStep___DriveToTarget__TakePancam__5();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__TakePancam__state.getNext()) {
        }
    }

    private void MicroStep___DriveToTarget__TakePancam__0() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__TakePancam : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget.state == FINISHED)
[ Assignment: TakePancam.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakePancam : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("TakePancam.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__TakePancam____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakePancam____failure);
            DriveToTarget__TakePancam__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__TakePancam__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__TakePancam : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__TakePancam : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__TakePancam__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__TakePancam__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__TakePancam__1() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__TakePancam : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: TakePancam.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakePancam : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("TakePancam.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__TakePancam____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakePancam____failure);
            DriveToTarget__TakePancam__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__TakePancam__state);
            changeOccurred();
        } else {
            if (DriveToTarget__timeout.getCurrent().isTrue()) {
                /*
(State #1) priority 5 ----> 
DriveToTarget__TakePancam : WAITING (5) -> FINISHED
<SKIP_CONDITION T?> (timeout)
[ Assignment: TakePancam.failure = UNKNOWN ]
 ----> (State #5)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__TakePancam : WAITING (5) -> FINISHED");
                }
                if (JavaPlan.DEBUG) {
                    System.out.println(("TakePancam.failure: New value set to "+ NodeFailureType.UNKNOWN));
                }
                DriveToTarget__TakePancam____failure.setNext(NodeFailureType.UNKNOWN);
                commitAfterMicroStep(DriveToTarget__TakePancam____failure);
                DriveToTarget__TakePancam__state.setNext(5);
                commitAfterMicroStep(DriveToTarget__TakePancam__state);
                changeOccurred();
            } else {
                if (DriveToTarget__drive_done.getCurrent().isTrue()) {
                    /*
(State #1) priority 6 ----> 
DriveToTarget__TakePancam : WAITING (6) -> EXECUTING
<START_CONDITION T?> (drive_done)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
                    if (JavaPlan.DEBUG) {
                        System.out.println("DriveToTarget__TakePancam : WAITING (6) -> EXECUTING");
                    }
                    getWorld().command(new CommandHandle(DriveToTarget__TakePancam____command_handle), StringValue.get(("take_pancam")));
                    endMacroStep();
                    DriveToTarget__TakePancam__state.setNext(2);
                    commitAfterMicroStep(DriveToTarget__TakePancam__state);
                    changeOccurred();
                }
            }
        }
    }

    private void MicroStep___DriveToTarget__TakePancam__2() {
        PBoolean temp;
        /*
(State #2) priority 5 ----> 
DriveToTarget__TakePancam : EXECUTING (5) -> FINISHING
<END_CONDITION T?> (true || TakePancam.command_handle == COMMAND_DENIED || TakePancam.command_handle == COMMAND_FAILED)
 ----> (State #3)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget__TakePancam : EXECUTING (5) -> FINISHING");
        }
        DriveToTarget__TakePancam__state.setNext(3);
        commitAfterMicroStep(DriveToTarget__TakePancam__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__TakePancam__3() {
        PBoolean temp;
        if (BooleanValue.get(DriveToTarget__TakePancam____command_handle.getCurrent().isKnown()).isTrue()) {
            /*
(State #3) priority 5 ----> 
DriveToTarget__TakePancam : FINISHING (5) -> ITERATION_ENDED
<COMMAND_ACCEPTED T?> (isKnown(TakePancam.command_handle))
<POST_CONDITION T?> (true)
[ Assignment: TakePancam.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakePancam : FINISHING (5) -> ITERATION_ENDED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("TakePancam.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__TakePancam____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakePancam____failure);
            DriveToTarget__TakePancam__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__TakePancam__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__TakePancam__4() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #4) priority 3 ----> 
DriveToTarget__TakePancam : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakePancam : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__TakePancam__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__TakePancam__state);
            changeOccurred();
        } else {
            /*
(State #4) priority 4 ----> 
DriveToTarget__TakePancam : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakePancam : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__TakePancam__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__TakePancam__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__TakePancam__5() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #5) priority 1 ----> 
DriveToTarget__TakePancam : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget.state == WAITING)
[ Reset variables: TakePancam.command_handle, TakePancam.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__TakePancam : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__TakePancam____command_handle.setNext(CommandHandleState.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakePancam____command_handle);
            DriveToTarget__TakePancam____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__TakePancam____failure);
            DriveToTarget__TakePancam__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__TakePancam__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__TakePancam() {
        switch (DriveToTarget__TakePancam__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  4 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  5 :
                return NodeState.FINISHED;
            case  3 :
                return NodeState.FINISHING;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__TakePancam");
    }

    void MicroStep___DriveToTarget__HighlySpecificNode() {
        switch (DriveToTarget__HighlySpecificNode__state.getCurrent()) {
            case  0 :
                MicroStep___DriveToTarget__HighlySpecificNode__0();
                break;
            case  1 :
                MicroStep___DriveToTarget__HighlySpecificNode__1();
                break;
            case  2 :
                MicroStep___DriveToTarget__HighlySpecificNode__2();
                break;
            case  3 :
                MicroStep___DriveToTarget__HighlySpecificNode__3();
                break;
            case  4 :
                MicroStep___DriveToTarget__HighlySpecificNode__4();
                break;
            case  5 :
                MicroStep___DriveToTarget__HighlySpecificNode__5();
                break;
        }
        /* In Actions executed here: */
        switch (DriveToTarget__HighlySpecificNode__state.getNext()) {
        }
    }

    private void MicroStep___DriveToTarget__HighlySpecificNode__0() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.FINISHED).isTrue()) {
            /*
(State #0) priority 1 ----> 
DriveToTarget__HighlySpecificNode : INACTIVE (1) -> FINISHED
<PARENT_FINISHED T?> (DriveToTarget.state == FINISHED)
[ Assignment: HighlySpecificNode.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__HighlySpecificNode : INACTIVE (1) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("HighlySpecificNode.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__HighlySpecificNode____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode____failure);
            DriveToTarget__HighlySpecificNode__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget().equalTo(NodeState.EXECUTING).isTrue()) {
                /*
(State #0) priority 1 ----> 
DriveToTarget__HighlySpecificNode : INACTIVE (1) -> WAITING
<PARENT_EXECUTING T?> (DriveToTarget.state == EXECUTING)
 ----> (State #1)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__HighlySpecificNode : INACTIVE (1) -> WAITING");
                }
                DriveToTarget__HighlySpecificNode__state.setNext(1);
                commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
                changeOccurred();
            }
        }
    }

    private void MicroStep___DriveToTarget__HighlySpecificNode__1() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #1) priority 4 ----> 
DriveToTarget__HighlySpecificNode : WAITING (4) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
[ Assignment: HighlySpecificNode.failure = UNKNOWN ]
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__HighlySpecificNode : WAITING (4) -> FINISHED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("HighlySpecificNode.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__HighlySpecificNode____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode____failure);
            DriveToTarget__HighlySpecificNode__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
            changeOccurred();
        } else {
            if (STATE___DriveToTarget__TakeNavcam().equalTo(NodeState.FINISHED).isTrue()&&STATE___DriveToTarget__TakePancam().equalTo(NodeState.FINISHED).isTrue()) {
                /*
(State #1) priority 5 ----> 
DriveToTarget__HighlySpecificNode : WAITING (5) -> FINISHED
<SKIP_CONDITION T?> (DriveToTarget__TakeNavcam.state == FINISHED && DriveToTarget__TakePancam.state == FINISHED)
[ Assignment: HighlySpecificNode.failure = UNKNOWN ]
 ----> (State #5)
*/
                if (JavaPlan.DEBUG) {
                    System.out.println("DriveToTarget__HighlySpecificNode : WAITING (5) -> FINISHED");
                }
                if (JavaPlan.DEBUG) {
                    System.out.println(("HighlySpecificNode.failure: New value set to "+ NodeFailureType.UNKNOWN));
                }
                DriveToTarget__HighlySpecificNode____failure.setNext(NodeFailureType.UNKNOWN);
                commitAfterMicroStep(DriveToTarget__HighlySpecificNode____failure);
                DriveToTarget__HighlySpecificNode__state.setNext(5);
                commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
                changeOccurred();
            } else {
                if ((DriveToTarget__drive_done.getCurrent().isTrue()&&DriveToTarget__timeout.getCurrent().isTrue())&&((PNumeric) getWorld().lookupOnChange(StringValue.get(("time")), RealValue.get((0.0)))).equalTo(IntegerValue.get((42))).isTrue()) {
                    /*
(State #1) priority 6 ----> 
DriveToTarget__HighlySpecificNode : WAITING (6) -> EXECUTING
<START_CONDITION T?> (drive_done && timeout && (PNumeric) (LookupOnChange(time, 0.0)) == 42)
<PRE_CONDITION T?> (true)
 ----> (State #2)
*/
                    if (JavaPlan.DEBUG) {
                        System.out.println("DriveToTarget__HighlySpecificNode : WAITING (6) -> EXECUTING");
                    }
                    getWorld().command(new CommandHandle(DriveToTarget__HighlySpecificNode____command_handle), StringValue.get(("self_destruct")));
                    endMacroStep();
                    DriveToTarget__HighlySpecificNode__state.setNext(2);
                    commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
                    changeOccurred();
                }
            }
        }
    }

    private void MicroStep___DriveToTarget__HighlySpecificNode__2() {
        PBoolean temp;
        /*
(State #2) priority 5 ----> 
DriveToTarget__HighlySpecificNode : EXECUTING (5) -> FINISHING
<END_CONDITION T?> (true || HighlySpecificNode.command_handle == COMMAND_DENIED || HighlySpecificNode.command_handle == COMMAND_FAILED)
 ----> (State #3)
*/
        if (JavaPlan.DEBUG) {
            System.out.println("DriveToTarget__HighlySpecificNode : EXECUTING (5) -> FINISHING");
        }
        DriveToTarget__HighlySpecificNode__state.setNext(3);
        commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
        changeOccurred();
    }

    private void MicroStep___DriveToTarget__HighlySpecificNode__3() {
        PBoolean temp;
        if (BooleanValue.get(DriveToTarget__HighlySpecificNode____command_handle.getCurrent().isKnown()).isTrue()) {
            /*
(State #3) priority 5 ----> 
DriveToTarget__HighlySpecificNode : FINISHING (5) -> ITERATION_ENDED
<COMMAND_ACCEPTED T?> (isKnown(HighlySpecificNode.command_handle))
<POST_CONDITION T?> (true)
[ Assignment: HighlySpecificNode.failure = UNKNOWN ]
 ----> (State #4)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__HighlySpecificNode : FINISHING (5) -> ITERATION_ENDED");
            }
            if (JavaPlan.DEBUG) {
                System.out.println(("HighlySpecificNode.failure: New value set to "+ NodeFailureType.UNKNOWN));
            }
            DriveToTarget__HighlySpecificNode____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode____failure);
            DriveToTarget__HighlySpecificNode__state.setNext(4);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__HighlySpecificNode__4() {
        PBoolean temp;
        if (((((NodeState.FINISHED.equalTo(STATE___DriveToTarget__Drive()).isTrue()&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTimeout()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__StopForTarget()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakeNavcam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__TakePancam()).isTrue())&&NodeState.FINISHED.equalTo(STATE___DriveToTarget__HighlySpecificNode()).isTrue()) {
            /*
(State #4) priority 3 ----> 
DriveToTarget__HighlySpecificNode : ITERATION_ENDED (3) -> FINISHED
<ANCESTOR_ENDS_DISJOINED T?> (FINISHED == DriveToTarget__Drive.state && FINISHED == DriveToTarget__StopForTimeout.state && FINISHED == DriveToTarget__StopForTarget.state && FINISHED == DriveToTarget__TakeNavcam.state && FINISHED == DriveToTarget__TakePancam.state && FINISHED == DriveToTarget__HighlySpecificNode.state || false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__HighlySpecificNode : ITERATION_ENDED (3) -> FINISHED");
            }
            DriveToTarget__HighlySpecificNode__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
            changeOccurred();
        } else {
            /*
(State #4) priority 4 ----> 
DriveToTarget__HighlySpecificNode : ITERATION_ENDED (4) -> FINISHED
<REPEAT_CONDITION F?> (false)
 ----> (State #5)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__HighlySpecificNode : ITERATION_ENDED (4) -> FINISHED");
            }
            DriveToTarget__HighlySpecificNode__state.setNext(5);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
            changeOccurred();
        }
    }

    private void MicroStep___DriveToTarget__HighlySpecificNode__5() {
        PBoolean temp;
        if (STATE___DriveToTarget().equalTo(NodeState.WAITING).isTrue()) {
            /*
(State #5) priority 1 ----> 
DriveToTarget__HighlySpecificNode : FINISHED (1) -> INACTIVE
<PARENT_WAITING T?> (DriveToTarget.state == WAITING)
[ Reset variables: HighlySpecificNode.command_handle, HighlySpecificNode.failure, ]
 ----> (State #0)
*/
            if (JavaPlan.DEBUG) {
                System.out.println("DriveToTarget__HighlySpecificNode : FINISHED (1) -> INACTIVE");
            }
            DriveToTarget__HighlySpecificNode____command_handle.setNext(CommandHandleState.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode____command_handle);
            DriveToTarget__HighlySpecificNode____failure.setNext(NodeFailureType.UNKNOWN);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode____failure);
            DriveToTarget__HighlySpecificNode__state.setNext(0);
            commitAfterMicroStep(DriveToTarget__HighlySpecificNode__state);
            changeOccurred();
        }
    }

    public NodeState STATE___DriveToTarget__HighlySpecificNode() {
        switch (DriveToTarget__HighlySpecificNode__state.getCurrent()) {
            case  1 :
                return NodeState.WAITING;
            case  4 :
                return NodeState.ITERATION_ENDED;
            case  2 :
                return NodeState.EXECUTING;
            case  0 :
                return NodeState.INACTIVE;
            case  5 :
                return NodeState.FINISHED;
            case  3 :
                return NodeState.FINISHING;
        }
        throw new RuntimeException("No state mapping found for DriveToTarget__HighlySpecificNode");
    }

    public void doMicroStep() {
        MicroStep___DriveToTarget();
        notifyMicroStep();
    }

    public NodeOutcome getRootNodeOutcome() {
        return DriveToTarget____outcome.getCurrent();
    }

    public NodeState getRootNodeState() {
        return STATE___DriveToTarget();
    }

    public PlanState getSnapshot() {
        PlanState DriveToTarget = new PlanState("DriveToTarget");
        DriveToTarget.addVariable(".state", STATE___DriveToTarget());
        DriveToTarget.addVariable(".outcome", DriveToTarget____outcome.getCurrent());
        DriveToTarget.addVariable("drive_done", DriveToTarget__drive_done.getCurrent());
        DriveToTarget.addVariable(".failure", DriveToTarget____failure.getCurrent());
        DriveToTarget.addVariable("timeout", DriveToTarget__timeout.getCurrent());
        PlanState DriveToTarget__Drive = new PlanState("Drive", DriveToTarget);
        DriveToTarget__Drive.addVariable(".state", STATE___DriveToTarget__Drive());
        DriveToTarget__Drive.addVariable(".command_handle", DriveToTarget__Drive____command_handle.getCurrent());
        DriveToTarget__Drive.addVariable(".failure", DriveToTarget__Drive____failure.getCurrent());
        DriveToTarget.addChild(DriveToTarget__Drive);
        PlanState DriveToTarget__StopForTimeout = new PlanState("StopForTimeout", DriveToTarget);
        DriveToTarget__StopForTimeout.addVariable(".state", STATE___DriveToTarget__StopForTimeout());
        DriveToTarget__StopForTimeout.addVariable(".failure", DriveToTarget__StopForTimeout____failure.getCurrent());
        PlanState DriveToTarget__StopForTimeout__Stop = new PlanState("Stop", DriveToTarget__StopForTimeout);
        DriveToTarget__StopForTimeout__Stop.addVariable(".state", STATE___DriveToTarget__StopForTimeout__Stop());
        DriveToTarget__StopForTimeout__Stop.addVariable(".command_handle", DriveToTarget__StopForTimeout__Stop____command_handle.getCurrent());
        DriveToTarget__StopForTimeout__Stop.addVariable(".failure", DriveToTarget__StopForTimeout__Stop____failure.getCurrent());
        DriveToTarget__StopForTimeout.addChild(DriveToTarget__StopForTimeout__Stop);
        PlanState DriveToTarget__StopForTimeout__SetTimeoutFlag = new PlanState("SetTimeoutFlag", DriveToTarget__StopForTimeout);
        DriveToTarget__StopForTimeout__SetTimeoutFlag.addVariable(".state", STATE___DriveToTarget__StopForTimeout__SetTimeoutFlag());
        DriveToTarget__StopForTimeout__SetTimeoutFlag.addVariable(".failure", DriveToTarget__StopForTimeout__SetTimeoutFlag____failure.getCurrent());
        DriveToTarget__StopForTimeout.addChild(DriveToTarget__StopForTimeout__SetTimeoutFlag);
        DriveToTarget.addChild(DriveToTarget__StopForTimeout);
        PlanState DriveToTarget__StopForTarget = new PlanState("StopForTarget", DriveToTarget);
        DriveToTarget__StopForTarget.addVariable(".state", STATE___DriveToTarget__StopForTarget());
        DriveToTarget__StopForTarget.addVariable(".failure", DriveToTarget__StopForTarget____failure.getCurrent());
        PlanState DriveToTarget__StopForTarget__Stop = new PlanState("Stop", DriveToTarget__StopForTarget);
        DriveToTarget__StopForTarget__Stop.addVariable(".state", STATE___DriveToTarget__StopForTarget__Stop());
        DriveToTarget__StopForTarget__Stop.addVariable(".command_handle", DriveToTarget__StopForTarget__Stop____command_handle.getCurrent());
        DriveToTarget__StopForTarget__Stop.addVariable(".failure", DriveToTarget__StopForTarget__Stop____failure.getCurrent());
        DriveToTarget__StopForTarget.addChild(DriveToTarget__StopForTarget__Stop);
        PlanState DriveToTarget__StopForTarget__SetDriveFlag = new PlanState("SetDriveFlag", DriveToTarget__StopForTarget);
        DriveToTarget__StopForTarget__SetDriveFlag.addVariable(".state", STATE___DriveToTarget__StopForTarget__SetDriveFlag());
        DriveToTarget__StopForTarget__SetDriveFlag.addVariable(".failure", DriveToTarget__StopForTarget__SetDriveFlag____failure.getCurrent());
        DriveToTarget__StopForTarget.addChild(DriveToTarget__StopForTarget__SetDriveFlag);
        DriveToTarget.addChild(DriveToTarget__StopForTarget);
        PlanState DriveToTarget__TakeNavcam = new PlanState("TakeNavcam", DriveToTarget);
        DriveToTarget__TakeNavcam.addVariable(".state", STATE___DriveToTarget__TakeNavcam());
        DriveToTarget__TakeNavcam.addVariable(".command_handle", DriveToTarget__TakeNavcam____command_handle.getCurrent());
        DriveToTarget__TakeNavcam.addVariable(".failure", DriveToTarget__TakeNavcam____failure.getCurrent());
        DriveToTarget.addChild(DriveToTarget__TakeNavcam);
        PlanState DriveToTarget__TakePancam = new PlanState("TakePancam", DriveToTarget);
        DriveToTarget__TakePancam.addVariable(".state", STATE___DriveToTarget__TakePancam());
        DriveToTarget__TakePancam.addVariable(".command_handle", DriveToTarget__TakePancam____command_handle.getCurrent());
        DriveToTarget__TakePancam.addVariable(".failure", DriveToTarget__TakePancam____failure.getCurrent());
        DriveToTarget.addChild(DriveToTarget__TakePancam);
        PlanState DriveToTarget__HighlySpecificNode = new PlanState("HighlySpecificNode", DriveToTarget);
        DriveToTarget__HighlySpecificNode.addVariable(".state", STATE___DriveToTarget__HighlySpecificNode());
        DriveToTarget__HighlySpecificNode.addVariable(".command_handle", DriveToTarget__HighlySpecificNode____command_handle.getCurrent());
        DriveToTarget__HighlySpecificNode.addVariable(".failure", DriveToTarget__HighlySpecificNode____failure.getCurrent());
        DriveToTarget.addChild(DriveToTarget__HighlySpecificNode);
        return DriveToTarget;
    }

}
