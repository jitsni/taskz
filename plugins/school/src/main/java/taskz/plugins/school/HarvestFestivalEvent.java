package taskz.plugins.school;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class HarvestFestivalEvent extends TaskzEvent {
    public HarvestFestivalEvent(School source, LocalDateTime eventTime) {
        super(source, eventTime);
    }

    public String toString() {
        return "HarvestFestivalEvent["+source+"]";
    }
}
