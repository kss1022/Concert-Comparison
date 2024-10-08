package kata.practice.concertcomparison.codable

interface PasswordEncodable{
    fun encode(password: String): String
    fun matches(rawPassword: String, encodedPassword: String): Boolean
}