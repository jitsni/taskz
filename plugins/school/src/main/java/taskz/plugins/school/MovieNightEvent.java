package taskz.plugins.school;

import taskz.TaskzEvent;

import java.time.LocalDateTime;

/**
 * @author Jitendra Kotamraju
 */
public class MovieNightEvent extends TaskzEvent {
    public MovieNightEvent(School source, LocalDateTime eventTime) {
        super(source, eventTime);
    }

    public String toString() {
        return "MovieNightEvent["+source+"]";
    }
}
