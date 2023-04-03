package Junit

class primeNumberChecker {
    fun validate(primeNumber:Int):Boolean {
        for (i in 2 until  primeNumber/2){
            return (primeNumber % i==0)
        }
        return true
    }
}