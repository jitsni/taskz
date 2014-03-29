package taskz.plugins.house;

import taskz.TaskzEvent;
import taskz.TaskzObject;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class CleanersEvent extends TaskzEvent {
    public CleanersEvent(TaskzObject source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
