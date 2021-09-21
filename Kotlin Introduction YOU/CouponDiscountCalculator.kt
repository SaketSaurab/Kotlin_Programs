fun main(){
    val a= arrayOf(1500,500,250)
    val b=a.size-1
    for (i in 0..b){
        var c=a[i]/10
        if (c<=100){
            println(a[i]-c)
        }
        else println(a[i]-100)
    }
}