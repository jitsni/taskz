package taskz;

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

    public Stream<? extends EventObject> getEvents() {
        Stream<EventObject> stream = new ArrayList<EventObject>().stream();
        for(TaskzObject obj : objects) {
            stream = Stream.concat(obj.getEvents(), stream);
        }
        return stream;
    }

}
