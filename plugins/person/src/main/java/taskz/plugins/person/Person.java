package taskz.plugins.person;

import taskz.TaskzEvent;
import taskz.TaskzObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Jitendra Kotamraju
 */
public class Person extends TaskzObject {

    public Person() {
    }

    @Override
    public Stream<? extends TaskzEvent> getEvents() {
        List<TaskzEvent> list = new ArrayList<>();
        return list.stream();
    }

    public String toString() {
        return " ";
    }

}
