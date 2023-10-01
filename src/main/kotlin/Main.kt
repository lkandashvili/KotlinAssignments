fun main(args: Array<String>) {
    var s:IntArray = ex1(1,50)
    for (i:Int in s) {
        println(i)
    }

}
fun ex1(n:Int, m:Int) : IntArray {
    var ans = IntArray(5)

    for (i:Int in n..m ) {
        if (checkIfPalindrome(i)) {
            if (checkIfPalindrome(i * i)) {
                ans+=i
            }
        }
    }
    return ans
}
public fun checkIfPalindrome(num:Int) :Boolean {
    var reversedI = 0
    var remainder: Int
    var oI = num

    while (oI != 0) {
        remainder = oI % 10
        reversedI = reversedI * 10 + remainder
        oI /= 10
    }

    return oI == reversedI
}