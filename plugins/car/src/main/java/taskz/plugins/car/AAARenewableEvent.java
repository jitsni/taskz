package taskz.plugins.car;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class AAARenewableEvent extends TaskzEvent {
    public AAARenewableEvent(Car source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
