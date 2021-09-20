fun main(){
    val a:Int=1948
    if (a%400==0){
        print("Leap Year")
    }
    else if (a%100==0){
        print("Not a leap year")
    }
    else if (a%4==0){
        print("Leap Year")
    }
    else
        print("Not a leap year")
}