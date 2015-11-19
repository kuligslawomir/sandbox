package com.company

/**
 * Created by pi12894 on 2015-11-18.
 */
import spock.lang.*

class HelloSpec extends Specification {
    def "length of Spock's and his friends' names"() {

        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }
}
