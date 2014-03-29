package taskz.plugins.school;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class FieldTripEvent extends TaskzEvent {
    public FieldTripEvent(School source, LocalDateTime eventTime) {
        super(source, eventTime);
    }

    public String toString() {
        return "FieldTripEvent["+source+"]";
    }
}
