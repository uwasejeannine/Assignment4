fun main() {
var human=Human("Jeannine Uwase",20,74)
    human.eat(74)
    println("I will create my own city in few years to came, I won't specify cause I want to suprise you.")
    human.born(20)
    var student=Student("Jeannine","Uwase","Jeannine.uwase@gmail.com",785952374,1234)
    student.firstName
    student.lastName
    println(student.firstName)
    println(student.lastName)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speech(speech:String){
        println("$speech")
    }
    fun born(birthday:Int){
        age+=birthday
        println(age)
    }

    }
data class Student (var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:Int )



