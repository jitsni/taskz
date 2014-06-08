package taskz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.stream.Stream;

/**
 * @author Jitendra Kotamraju
 */
public class Engine {
    private final TaskzObject[] objects;

    public Engine(TaskzObject... objects) {
        this.objects = objects;
    }

    public Stream<? extends TaskzEvent> getEvents() {
        Stream<TaskzEvent> stream = new ArrayList<TaskzEvent>().stream();
        for(TaskzObject obj : objects) {
            stream = Stream.concat(obj.getEvents(null, null), stream);
        }
        return stream;
    }

    public Stream<? extends TaskzEvent> getTodayEvents() {
        LocalDateTime today = LocalDateTime.now().withHour(0).withMinute(0)
                .withSecond(0).withNano(0);
        return getEvents().filter(p -> p.eventTime.isAfter(today));
    }

    public Stream<? extends TaskzEvent> getWeekEvents() {
        LocalDateTime week = LocalDateTime.now();       // TODO
        return getEvents().filter(p -> p.eventTime.isAfter(week));
    }

    public Stream<? extends TaskzEvent> getMonthEvents() {
        LocalDateTime month = LocalDateTime.now().withDayOfMonth(1)
                .withHour(0).withMinute(0).withSecond(0).withNano(0);
        return getEvents().filter(p -> p.eventTime.isAfter(month));
    }

    public Stream<? extends TaskzEvent> getYearEvents() {
        LocalDateTime year = LocalDateTime.now().withMonth(1).withDayOfMonth(1)
                .withHour(0).withMinute(0).withSecond(0).withNano(0);
        return getEvents().filter(p -> p.eventTime.isAfter(year));
    }

}
