fun main(args: Array<String>) {
    val s:IntArray = ex1(1,50)
    for (i:Int in s) {
        println(i)
     }

}

//            დავალება 1               //

fun ex1(n:Int, m:Int) : IntArray {
    var ans = IntArray(0)

    for (i:Int in n..m ) {
        if (checkIfPalindrome(i)) {
            if (checkIfPalindrome(i * i)) {
                ans+=i
            }
        }
    }
    return ans
}
fun checkIfPalindrome(num:Int) :Boolean {
    var number = num
    var reversedI = 0
    var remainder: Int
    var oI = number

    while (number != 0) {
        remainder = number % 10
        reversedI = reversedI * 10 + remainder
        number /= 10
    }

    return oI == reversedI
}

//                                     //

