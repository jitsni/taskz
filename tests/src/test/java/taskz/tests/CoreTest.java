package taskz.tests;

import junit.framework.TestCase;
import taskz.Engine;
import taskz.plugins.car.Car;
import taskz.plugins.school.School;

import java.time.LocalDateTime;
import java.util.EventObject;
import java.util.stream.Stream;

/**
 * @author Jitendra Kotamraju
 */
public class CoreTest extends TestCase {
    public void testTasks() {
        LocalDateTime hoilChange = LocalDateTime.of(2013, 10, 4, 0, 0);
        Car honda = new Car(2000, "Honda", "Accord", hoilChange);

        LocalDateTime toilChange = LocalDateTime.of(2013, 10, 22, 0, 0);
        Car camry = new Car(2003, "Toyota", "Camry", toilChange);

        LocalDateTime harvestFestival = LocalDateTime.of(2013, 10, 19, 13, 0);
        LocalDateTime walkathon = LocalDateTime.now();
        LocalDateTime movieNight = LocalDateTime.of(2013, 10, 4, 20, 0);
        School school = new School("Millikin", harvestFestival,
                walkathon, movieNight);

        Engine engine = new Engine(honda, camry, school);
        Stream<? extends EventObject> events = engine.getEvents();
        events.sorted().forEach(p -> {
            System.out.println(p);
        });
    }
}
