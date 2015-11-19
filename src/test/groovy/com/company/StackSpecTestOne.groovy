package com.company

import spock.lang.Specification

/**
 * Created by pi12894 on 2015-11-18.
 */
class StackSpecTestOne extends Specification {

//    def "adding an element leads to size increase"() {
//        setup: "a new stack instance is created"
//        def stack = new Stack()
//
//        when:
//        stack.push 42
//        println "sdfds"
//
//        then:
//        stack.size() == 1
//    }

    def "returning zero"(Test test1, Test test2) {
        setup: "a new method"
        test1.returnZero();

        when:
        println "sdfds"

        then:
        test1.returnZero() == 0

        where:
        test1 | test2
        new Test() | new Test()
        new Test() | new Test()
        new Test() | new Test()
    }
}