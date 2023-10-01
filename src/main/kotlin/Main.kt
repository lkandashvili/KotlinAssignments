fun main(args: Array<String>) {

    println(ex2(123456, 2))

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

fun ex2(number: Int, k: Int) :Int {
    var ans: Int

    var s:String = number.toString()
    s = s.dropLast(k)
    ans = s.toInt()

    return ans
}