import java.util.*
import kotlin.collections.HashMap

fun main(){
    var sc=Scanner(System.`in`)
    var str=sc.nextLine()
    var aMap :HashMap<Char,Int> = HashMap()
    var aChar:Char
    for (i in str.indices){
        aChar=str[i]
        if (aMap.containsKey(aChar)){
            aMap[aChar]=aMap[aChar]!!+1
        }
        else{
            aMap[aChar]=1
        }

    }
    println("$aMap")

}