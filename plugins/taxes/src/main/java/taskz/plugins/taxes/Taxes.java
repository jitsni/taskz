package taskz.plugins.taxes;

import taskz.TaskzEvent;
import taskz.TaskzObject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Jitendra Kotamraju
 */
public class Taxes extends TaskzObject {

    private final int year;
    private final boolean filed;

    public Taxes(int year) {
		this.year = year;
        this.filed = false;
    }

    @Override
    public Stream<? extends TaskzEvent> getEvents(LocalDateTime from, LocalDateTime to) {
        List<TaskzEvent> list = new ArrayList<>();
        if (filed) {
            list.add(new TaxesFilingEvent(this, null));
        } else {
            LocalDateTime today = LocalDateTime.now();
            if (today.isAfter(null)) {
                list.add(new TaxesMissedEvent(this, null));
            }
        }
        list.add(new TaxesDeadlineEvent(this, null));

        return list.stream();
    }

    public String toString() {
        return ""+year;
    }

}
