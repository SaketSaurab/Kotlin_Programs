import java.util.*

fun main(){
    val sc= Scanner(System.`in`)
    var arr= mutableListOf<Int>()
    val b=sc.nextInt()
    for (i in 1..b){
        arr.add(sc.nextInt())
    }
    for(i in 0..b-1){
        var count=0
        for (j in 0..b-1){
            if (arr[i]==arr[j]){
                count++
            }
        }
        if (count==1){
            print(""+arr[i]+",")
        }
    }





}