package com.testing.spock;

import spock.lang.Specification;

class AppSpec extends Specification {

    def "no greeting is provided, so default should be returned"() {
        given:
            def app = new App();

        when:
            def greeting = app.getGreeting();

        then:
            assert greeting == app.defaultGreeting;
    }

    def "greeting is set, so same should be returned"() {
        given:
        def app = new App();

        when:
        app.setGreeting("Hi Mom");
        def greeting = app.getGreeting();

        then:
        assert greeting == "Hi Mom";
    }
}
