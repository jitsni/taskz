package taskz.plugins.school;

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
public class School extends TaskzObject {

    private final String name;
    private final LocalDateTime harvestFestival;
    private final LocalDateTime walkathon;
    private final LocalDateTime movieNight;

    public School(String name, LocalDateTime harvestFestival,
                  LocalDateTime walkathon, LocalDateTime movieNight) {
        this.name = name;
        this.harvestFestival = harvestFestival;
        this.walkathon = walkathon;
        this.movieNight = movieNight;
    }

    @Override
    public Stream<? extends TaskzEvent> getEvents() {
        List<TaskzEvent> list = new ArrayList<>();
        list.add(new HarvestFestivalEvent(this, harvestFestival));
        list.add(new MovieNightEvent(this, movieNight));
        list.add(new WalkathonEvent(this, walkathon));
        return list.stream();
    }

    public String toString() {
        return name;
    }

}
