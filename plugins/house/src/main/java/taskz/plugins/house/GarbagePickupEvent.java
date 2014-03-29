package taskz.plugins.house;

import taskz.TaskzEvent;
import taskz.TaskzObject;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class GarbagePickupEvent extends TaskzEvent {
    public GarbagePickupEvent(TaskzObject source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
