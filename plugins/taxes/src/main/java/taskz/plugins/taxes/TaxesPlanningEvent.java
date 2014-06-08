package taskz.plugins.taxes;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class TaxesPlanningEvent extends TaskzEvent {
    public TaxesPlanningEvent(Taxes taxes, LocalDateTime eventTime) {
        super(taxes, eventTime);
    }

    public String toString() {
        return "TaxesPlanningEvent["+source+"]";
    }
}
