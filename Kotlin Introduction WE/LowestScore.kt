fun main(){
    val score = arrayOf(20,43,3,35)
    var lowest=score[0]
    for (score:Int in score){
        if (score<lowest){
            lowest=score
        }
    }
    println(lowest)
}