fun main(){
    val country= arrayOf("India", "Aus", "England" , "Canada", "India", "USA", "USA", "Japan", "China", "UK")
    val a="USA"
    for (i in 0..country.size-1){
        if (a==country[i]){
            println(""+a+" "+i)
        }
    }
}