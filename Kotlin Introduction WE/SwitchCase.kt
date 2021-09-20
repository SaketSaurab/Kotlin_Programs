fun main(){
    val day="Monday"
    when(day){
        "Monday"->println("Mon")
        "Tuesday"->println("Tue")
        "Wednesday"->println("Wed")
        "Thursday"->println("Thur")
        "Friday"->println("Fri")
        "Saturday"->println("Sunday")
        "Sunday"->println("Sunday")
        else -> println("Invalid day")

    }
}