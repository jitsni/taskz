package taskz.plugins.school;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class WalkathonEvent extends TaskzEvent {
    public WalkathonEvent(School source, LocalDateTime eventTime) {
        super(source, eventTime);
    }

    public String toString() {
        return "WalkathonEvent["+source+"]";
    }
}
