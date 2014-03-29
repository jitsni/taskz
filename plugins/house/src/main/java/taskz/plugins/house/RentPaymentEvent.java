package taskz.plugins.house;

import taskz.TaskzEvent;
import taskz.TaskzObject;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class RentPaymentEvent extends TaskzEvent {
    public RentPaymentEvent(TaskzObject source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
