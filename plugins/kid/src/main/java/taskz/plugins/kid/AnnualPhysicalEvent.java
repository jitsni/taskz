package taskz.plugins.kid;

import taskz.TaskzEvent;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 * @author Jitendra Kotamraju
 */
public class AnnualPhysicalEvent extends TaskzEvent {
    public AnnualPhysicalEvent(Kid source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
