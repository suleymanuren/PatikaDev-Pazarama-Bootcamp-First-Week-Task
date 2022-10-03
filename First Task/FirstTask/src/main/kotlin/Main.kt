class ValidUsername {
    companion object {
        @JvmStatic val USER_NAME_REGEX = "^[A-Za-z][A-Za-z0-9_]{3,25}$(?<![-_])$"
        //[A-Za-z] HARF İLE BAŞLAMASINA YARIYOR
        //[A-Za-z0-9_] KALAN HARFLERİN HAVUZU
        //{3,25} MİN VE MAX HARF
        //(?<![-_])$ USERNAME'İN HARF İLE BİTMESİNİ SAĞLIYOR


        fun isValidUsername(userName: String): Boolean {
            return USER_NAME_REGEX.toRegex().matches(userName);
        }
    }
}
fun main(args: Array<String>) {
    println(ValidUsername.isValidUsername("a1a_"));
    println(ValidUsername.isValidUsername("u__hello_world123"));

}