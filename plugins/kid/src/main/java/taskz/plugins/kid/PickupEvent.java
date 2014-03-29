package taskz.plugins.kid;

import taskz.TaskzEvent;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 * @author Jitendra Kotamraju
 */
public class PickupEvent extends TaskzEvent {
    public PickupEvent(Kid source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
