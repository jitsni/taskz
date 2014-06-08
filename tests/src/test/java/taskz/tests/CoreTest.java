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
    Engine engine;

    protected void setUp() throws Exception {
        LocalDateTime hoilChange = LocalDateTime.of(2013, 10, 4, 0, 0);
        Car honda = new Car(2000, "Honda", "Accord", hoilChange);

        LocalDateTime toilChange = LocalDateTime.of(2013, 10, 22, 0, 0);
        Car camry = new Car(2003, "Toyota", "Camry", toilChange);

        LocalDateTime harvestFestival = LocalDateTime.of(2013, 10, 19, 13, 0);
        LocalDateTime walkathon = LocalDateTime.now();
        LocalDateTime movieNight = LocalDateTime.of(2013, 10, 4, 20, 0);
        School school = new School("Millikin", harvestFestival,
                walkathon, movieNight);
        engine = new Engine(honda, camry, school);
    }

    public void testTasks() {
        Stream<? extends EventObject> events = engine.getEvents();
        events.sorted().forEach(System.out::println);
    }

    public void testTodayTasks() {
        Stream<? extends EventObject> events = engine.getTodayEvents();
        events.sorted().forEach(System.out::println);
    }

    public void testWeekTasks() {
        Stream<? extends EventObject> events = engine.getWeekEvents();
        events.sorted().forEach(System.out::println);
    }

    public void testMonthTasks() {
        Stream<? extends EventObject> events = engine.getMonthEvents();
        events.sorted().forEach(System.out::println);
    }

    public void testYearTasks() {
        Stream<? extends EventObject> events = engine.getYearEvents();
        events.sorted().forEach(System.out::println);
    }

    protected void tearDown() throws Exception {
    }

}
