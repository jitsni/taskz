package taskz.plugins.person;

import taskz.TaskzEvent;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 * @author Jitendra Kotamraju
 */
public class BirthDayEvent extends TaskzEvent {
    public BirthDayEvent(Person source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
