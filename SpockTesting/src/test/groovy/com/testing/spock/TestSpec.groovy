
import spock.lang.Specification;


class TestSpec extends Specification {
    def "test me" () {
        given:
            def a = 1;
        when:
            a--;
        then:
            assert a == 0;

    }
}
