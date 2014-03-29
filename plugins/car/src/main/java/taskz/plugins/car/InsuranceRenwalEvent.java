package taskz.plugins.car;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class InsuranceRenwalEvent extends TaskzEvent {
    public InsuranceRenwalEvent(Car source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
