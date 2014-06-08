package taskz.plugins.taxes;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class TaxesMissedEvent extends TaskzEvent {
    public TaxesMissedEvent(Taxes taxes, LocalDateTime eventTime) {
        super(taxes, eventTime);
    }

    public String toString() {
        return "TaxesMissedEvent["+source+"]";
    }
}
