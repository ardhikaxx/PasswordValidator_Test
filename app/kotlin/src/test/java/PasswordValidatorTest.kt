import org.junit.Test
import org.junit.Assert.assertEquals

class PasswordValidatorTest {

    @Test
    fun testPasswordLength() {
        val passwordValidator = PasswordValidator()

        val isShortPassword = passwordValidator.isPasswordLengthValid("12345")
        assertEquals(false, isShortPassword)

        val isLongPassword = passwordValidator.isPasswordLengthValid("123456")
        assertEquals(true, isLongPassword)
    }
}