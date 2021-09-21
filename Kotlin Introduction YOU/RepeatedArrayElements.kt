fun main(){
//    val a= arrayOf(10,10,20,20,-20)
    val a= arrayOf(-2,-1,-2,1,2,33)
//    val a= arrayOf(20,-20,30,40,50)
    val b=a.size-1
    for (i in 0..b){
        for (j in 0..b){
            if (a[i]==a[j]&&i!=j){
                print(""+a[i]+",")
            }
        }
    }
}