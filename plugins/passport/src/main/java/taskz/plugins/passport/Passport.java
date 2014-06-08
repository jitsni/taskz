package taskz.plugins.passport;

import taskz.TaskzEvent;
import taskz.TaskzObject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Jitendra Kotamraju
 */
public class Passport extends TaskzObject {

    public Passport() {
    }

    @Override
    public Stream<? extends TaskzEvent> getEvents(LocalDateTime from, LocalDateTime to) {
        List<TaskzEvent> list = new ArrayList<>();
        list.add(new RenewalEvent(this, LocalDateTime.now()));
        return list.stream();
    }

    public String toString() {
        return " ";
    }

}
