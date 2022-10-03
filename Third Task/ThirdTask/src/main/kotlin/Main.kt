fun main(args: Array<String>){
    print("Sayı Giriniz: ")
    val kullaniciSayisi = readLine()!!
    println("Girdiğiniz Sayı: $kullaniciSayisi")
    val x: Int = kullaniciSayisi.toInt()
    println(factorial(x))
}

fun factorial(a: Int): Int{
    var factorTetikleyici=1
    var i: Int = a
    while(i>1){
        factorTetikleyici*=i
        i--
    }
    return factorTetikleyici
}