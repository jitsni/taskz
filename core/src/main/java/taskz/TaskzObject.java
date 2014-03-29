package taskz;

import java.util.EventObject;
import java.util.stream.Stream;

/**
 * @author Jitendra Kotamraju
 */
public abstract class TaskzObject {
    public abstract Stream<? extends TaskzEvent> getEvents();
}
