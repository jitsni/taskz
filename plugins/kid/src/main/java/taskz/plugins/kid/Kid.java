package taskz.plugins.kid;

import taskz.TaskzEvent;
import taskz.TaskzObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Jitendra Kotamraju
 */
public class Kid extends TaskzObject {

    private final LocalDate birthDate;

    public Kid(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public Stream<? extends TaskzEvent> getEvents(LocalDateTime from, LocalDateTime to) {
        List<TaskzEvent> list = new ArrayList<>();
        return list.stream();
    }

    public String toString() {
        return " ";
    }

}
