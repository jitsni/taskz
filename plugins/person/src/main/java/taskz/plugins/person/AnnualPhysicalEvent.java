package taskz.plugins.person;

import taskz.TaskzEvent;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 * @author Jitendra Kotamraju
 */
public class AnnualPhysicalEvent extends TaskzEvent {
    public AnnualPhysicalEvent(Person source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
