package com.testing.spock;

import spock.lang.Specification;

class CourseApiAppSpec extends Specification {

    def "no greeting is provided, so default should be returned"() {
        given:
        def app = new CourseApiApp()


    }
}
