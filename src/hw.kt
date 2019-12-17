fun main() {
    println("Hello World")

//    var a: Int = 15
//    val b = 15 // Int
//    val c = "" // String
//    val d: String // wartość do odczytu, przypisana później
//    var e: Int? = null // błąd - Int nie jest Nullable
//    var f: Int? = null
//    var g // błąd - brak typu lub wartości
//    a = 10
//    b = 10 // błąd - val jest tylko do odczytu
//    d = ""
//    d = "" // błąd - d zostało juz przypisane

    fun getMultipliedInt(a: Int = 10) =  a * 2
    fun getMutlipliedInts(a: Int = 10, b: Int = 12) = a * b
//    ...
    var b = getMultipliedInt(2) // 4
    b = getMultipliedInt() // 20
    b = getMutlipliedInts(5, 10) // 50
    b = getMutlipliedInts(1) // 12
    b = getMutlipliedInts() // 120

    var c=getMutlipliedInts(14)

    var items = listOf("a", "b", "c", "d")

    for (item in items) { // Java: for (String item : items) {
        println(item)
    }
    for (i in "abcd") {
        println(i)
    }

    var index = 0
    while (index < items.size) {
        println(items[index])
        index++
    }
    index = 0
    do {
        println(items[index])
        index++
    } while (index < items.size)

    val x = 5

    var f = x in 1..10 // true
    f = x !in 1..10 // false
    f = x in 10 downTo 1 // true
    f = x in 0..5 // true
    f = x in 0 until 5 // false, until nie obejmuje końcowej wartości
    f = x in 0..10 step 3 // false, 5 nie ma w {0, 3, 6, 9}
    f = x in 0..10 step 5 // true

    for (k in 1..5) {
        println(k) // [1, 2, 3, 4, 5]
    }
    val itemsy = listOf("a", "b", "c")
    for (index in itemsy.indices) { // równoznaczne z 0..items.size - 1
        println(itemsy[index]) // [a, b, c]
    }

    for (k in 1..10 step 2) {
        println(k) // [1, 3, 5, 7, 9]
    }

    for (k in 1 until 6 step 1) {
        println(k) // [1, 2, 3, 4, 5]
    }

    for (k in 9 downTo 0 step 3) {
        println(k) // [9, 6, 3, 0]
    }

    var i = 10
    var j = 15
    var k = "${i+j}" // "25", Java: String.format("%d", a + b);
    k = "$i+$j" // "10+15", Java: String.format("%d+%d", a, b);

    var values: List<Any>? = null
    var count = values?.size ?: 0 // 0
    values = listOf(1, 2, 3);
    count = values?.size ?: 0 // 3

    var a = if (1 > 0) 1 else 0 // a = 1
    a = try {
        println("instrukcja")
        5/0
    } catch (e: ArithmeticException) {
        7
    }
// a = 7
}