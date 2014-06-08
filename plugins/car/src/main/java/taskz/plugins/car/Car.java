package taskz.plugins.car;

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
public class Car extends TaskzObject {

    private final int year;
    private final String make;
    private final String model;
    private final LocalDateTime oilChange;

    public Car(int year, String make, String model, LocalDateTime oilChange) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.oilChange = oilChange;
    }

    @Override
    public Stream<? extends TaskzEvent> getEvents(LocalDateTime from, LocalDateTime to) {
        List<TaskzEvent> list = new ArrayList<>();
        list.add(new OilChangeEvent(this, oilChange));     // add multiple of them 3 mths apart
        list.add(new InsuranceRenwalEvent(this, LocalDateTime.now()));
        return list.stream();
    }

    public String toString() {
        return make+" "+model;
    }

}
