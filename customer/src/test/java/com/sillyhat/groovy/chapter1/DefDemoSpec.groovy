package com.sillyhat.groovy.chapter1

class DefDemoSpec extends spock.lang.Specification{

    public void trivialSum1(){
        when: "number is one"
        int number = 1

        then: "number plus number is two"
        number + number == 2
    }

    def trivialSum2(){
        when: "number is one"
        int number = 1

        then: "number plus number is two"
        number + number == 2
    }


    def "Testing a trivial sum"(){
        when: "number is one"
        int number = 1

        then: "number plus number is two"
        number + number == 2
    }
}