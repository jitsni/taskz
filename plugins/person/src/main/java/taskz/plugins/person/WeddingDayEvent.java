package taskz.plugins.person;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class WeddingDayEvent extends TaskzEvent {
    public WeddingDayEvent(Person source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
