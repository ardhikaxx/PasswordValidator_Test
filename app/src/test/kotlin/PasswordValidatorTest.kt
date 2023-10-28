import org.junit.Test
import org.junit.Assert.assertEquals

/**
 * Kelas `PasswordValidatorTest` adalah kelas unit test yang digunakan untuk menguji
 * metode `isPasswordLengthValid` dari kelas `PasswordValidator`.
 */
class PasswordValidatorTest {

    /**
     * Metode `testPasswordLength` digunakan untuk menguji validitas panjang password
     * dengan menggunakan metode `isPasswordLengthValid` dari kelas `PasswordValidator`.
     */
    @Test
    fun testPasswordLength() {
        val passwordValidator = PasswordValidator()

        // Tes jika panjang password kurang dari 6 karakter
        val isShortPassword = passwordValidator.isPasswordLengthValid("12345")
        assertEquals(false, isShortPassword)

        // Tes jika panjang password lebih dari atau sama dengan 6 karakter
        val isLongPassword = passwordValidator.isPasswordLengthValid("123456")
        assertEquals(true, isLongPassword)
    }
}