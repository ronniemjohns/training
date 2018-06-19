import com.testing.spock.App;
import spock.lang.Specification;

class AppSpecification extends Specification {



    def "no greeting is provided, so default should be returned"() {
        given:
        App app = new App();

        when:
        def greeting = app.getGreeting();

        then:
        expect greeting == app.defaultGreeting;
    }
}
