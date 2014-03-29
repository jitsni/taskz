package taskz.plugins.passport;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class RenewalEvent extends TaskzEvent {
    public RenewalEvent(Passport source, LocalDateTime eventTime) {
        super(source, eventTime);
    }
}
