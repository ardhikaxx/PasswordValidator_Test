class PasswordValidator {
    fun isPasswordLengthValid(password: String): Boolean {
        return password.length >= 6
    }
}