fun main(){
    val a= arrayOf(1, 2, 3, 4, 5)
//    val a= arrayOf(0)
   // val a= arrayOf(-12, -39, 12, 41, 22, 44)
    var sum=0
    for (i in 0..a.size-1){
        sum+=a[i]
    }
    val b=sum/a.size

    print(b)
}