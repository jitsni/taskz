package taskz.plugins.taxes;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class TaxesDeadlineEvent extends TaskzEvent {
    public TaxesDeadlineEvent(Taxes taxes, LocalDateTime eventTime) {
        super(taxes, eventTime);
    }

    public String toString() {
        return "TaxesDeadlineEvent["+source+"]";
    }
}
