/**
 * Kelas `PasswordValidator` digunakan untuk melakukan validasi panjang password.
 * Kelas ini memungkinkan pengguna untuk memeriksa apakah panjang suatu password memenuhi aturan tertentu.
 */
class PasswordValidator {

    /**
     * Metode ini memeriksa apakah panjang password memenuhi syarat.
     *
     * @param password Password yang akan diperiksa panjangnya.
     * @return `true` jika panjang password lebih dari atau sama dengan 6 karakter,
     * `false` jika kurang dari 6 karakter.
     */
    fun isPasswordLengthValid(password: String): Boolean {
        return password.length >= 6
    }
}