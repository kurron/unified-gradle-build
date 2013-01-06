package org.kurron.standalone.cli

import spock.lang.Specification

/**
 * Fake unit test.
 */
class MainUnitTest extends Specification {
    def 'given when then'()
    {
        given:
        println 'given'

        when:
        println 'when'

        then:
        println 'then'

        cleanup:
        println 'clean up!'
    }
}
