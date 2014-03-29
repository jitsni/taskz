package taskz.plugins.car;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class OilChangeEvent extends TaskzEvent {
    public OilChangeEvent(Car source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
