package taskz.plugins.kid;

import taskz.TaskzEvent;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 * @author Jitendra Kotamraju
 */
public class BirthDayEvent extends TaskzEvent {
    public BirthDayEvent(Kid source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
