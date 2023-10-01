fun main(args: Array<String>) {

    var s:IntArray = ex3(9)
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

//            დავალება 2              //

fun ex2(number: Int, k: Int) :Int {
    var ans: Int

    var s:String = number.toString()
    s = s.dropLast(k)
    ans = s.toInt()

    return ans
}

//            დავალება 3              //

fun ex3(n: Int) : IntArray {

    var ans = IntArray(0)

    for (i: Int in 1..n) {
        if (n % i == 0 && checkIfSimple(i)) {
            ans+=i
        }
    }
    return ans
}

fun checkIfSimple(num: Int) :Boolean {
    if (num <= 1) {
        return false
    }

    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }

    return true
}