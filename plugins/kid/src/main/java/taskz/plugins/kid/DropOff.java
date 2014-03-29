package taskz.plugins.kid;

import taskz.TaskzEvent;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 * @author Jitendra Kotamraju
 */
public class DropOff extends TaskzEvent {
    public DropOff(Kid source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
