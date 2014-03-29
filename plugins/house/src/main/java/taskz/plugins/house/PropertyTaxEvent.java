package taskz.plugins.house;

import taskz.TaskzEvent;
import taskz.TaskzObject;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 * @author Jitendra Kotamraju
 */
public class PropertyTaxEvent extends TaskzEvent {
    public PropertyTaxEvent(TaskzObject source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
