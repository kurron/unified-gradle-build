package org.kurron.standalone.shared.errors

import spock.lang.Specification

/**
 * Fake unit test.
 */
class RecoverableErrorUnitTest extends Specification {
    def 'given when then'()
    {
        given:
            RecoverableError sut = new RecoverableError( 'message' )

        when:
            sut.message

        then:
            assert null != sut.message

        cleanup:
            println 'clean up!'
    }
}
