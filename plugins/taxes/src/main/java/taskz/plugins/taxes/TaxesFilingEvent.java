package taskz.plugins.taxes;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class TaxesFilingEvent extends TaskzEvent {
    public TaxesFilingEvent(Taxes taxes, LocalDateTime eventTime) {
        super(taxes, eventTime);
    }

    public String toString() {
        return "TaxesFilingEvent["+source+"]";
    }
}
