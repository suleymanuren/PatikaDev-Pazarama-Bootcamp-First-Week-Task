fun main(args: Array<String>) {

println("Sayıları giriniz:")
    val arCount = readLine()!!.trim().toInt() //

    val a = readln()
    println(aVeryBigSum(a.split(" ").map { it.toLong() }.toTypedArray()))
}

fun aVeryBigSum(ar: Array<Long>): Long {
    var total: Long = 0
    ar.forEach { it ->
        total += it
    }
    return total
}

