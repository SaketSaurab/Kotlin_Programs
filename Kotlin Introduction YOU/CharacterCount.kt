fun main(){
//    val a= arrayOf("Hello","Masai")
    val a= arrayOf("HTML", "CSS", "JAVA", "JS", "ANDROID")
    var count=0
    for (i in 0..a.size-1){
        var b=a[i].length-1
        for (j in 0..b){
            count++
        }
    }
    print(count)
}