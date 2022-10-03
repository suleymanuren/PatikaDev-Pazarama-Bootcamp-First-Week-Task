fun main(args: Array<String>) {

    println(readLine()?.let { questionsMarks(it) }) //kullanıcının sayı girmesini ardından da  fonksiyona iletiyor

}
private fun questionsMarks(str: String): String { //str = terminalden girilen değer
    var counter = 0 //soru işareti sayacı
    var lastDigit = -1
    var result = "false" //terminelden varsayılan çıkış değeri

    for (char in str) { //str girdisini for döngüsü içinde char'a kaydediyor
        if (char.isDigit()) {
            val digit = Integer.valueOf(char.toString()) //char içinde ki int değerleri digite aktarıyor
            val sum = digit + lastDigit
            lastDigit = digit

            if (sum != 10) {
                counter = 0 //toplanan iki sayının toplamı 10 etmiyorsa sayacı sıfırlayıp, döngüyü devam ettiriyor
                continue
            }

            result = if (counter == 3) {
                // if döngüsünde sayılan counter 3 ise yani 3 adet "?" varsa
                // result'u true yapıyor
                "true"
            }
            else {
                "false"  // result'u false yapıyor
            }
            counter = 0
        } else if (char == '?')
            counter++ //char içinde ki ? işaretleri adedi kadar counterı arttırıyor
    }

    return result; //fonksiyonu "true" veya "false" iki seçenek dahilinde sonuçlandırıyor


}

