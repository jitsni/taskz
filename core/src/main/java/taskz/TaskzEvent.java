package taskz;

import java.time.LocalDateTime;
import java.util.EventObject;
import java.util.stream.Stream;

/**
 * @author Jitendra Kotamraju
 */
public abstract class TaskzEvent extends EventObject implements Comparable<TaskzEvent> {

    protected final LocalDateTime eventTime;

    public TaskzEvent(TaskzObject source, LocalDateTime eventTime) {
        super(source);
        this.eventTime = eventTime;
    }

    @Override
    public int compareTo(TaskzEvent o) {
        return this.eventTime.compareTo(o.eventTime);
    }

    public String toString() {
        return this.getClass().getSimpleName()+"["+source+"]";
    }

}
