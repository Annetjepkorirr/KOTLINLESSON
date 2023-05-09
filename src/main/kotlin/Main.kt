fun main() {
    var numbers = number(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    println(numbers)

    var person = listOf( Person("Annette",20,"5ft",40.0),
        Person("Jane",30,"4ft",50.0),
        Person("Mary",21,"7ft",39.9)
    )
    println(person.sortedByDescending { it.age })


    var identifyNames = getNames(arrayOf("Mary","Jane","TIna"))
    println( identifyNames)


    var cars = listOf(Car("kfc128k",100),
        Car("kfr674y",200))
    println(getMileage(cars))






}
//Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)

fun number(nums:Array<Int>){
    var getSum = nums[1]+nums[4]
    println(getSum)
    var getNum = nums.indexOf(158)
    println(getNum)
    var getAscending =nums.sorted()
    println(getAscending)
}

//Given a list of Person objects, each with the attributes, name, age, height, and weight.
//Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:String, var weight:Double){

}


// Create a function that takes in 3 names and returns a string array containing all 3 names
fun getNames(names:Array<String>):Array<String>{
    return  names
}

//Write a function that takes in a list of Car objects each with a registration and mileage
//attribute and returns the average mileage of all the vehicles in the list
data class Car (var regisration:String, var mileage:Int)
fun getMileage(vehicles:List<Car>):Double{
    var sum = 0
    for (vehicle in vehicles){
        sum+= vehicle.mileage
    }
    return sum.toDouble()/vehicles.size
}
