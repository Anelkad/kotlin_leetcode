interface Person{
    var firstName: String
    var lastName: String

    fun getInfo(): String{return ""}
}

interface Employee: Person{
    var salary: Int

    fun getSalaryInfo(): String{
        return "Salary is $salary"
    }
}

class Student(override var firstName: String, override var lastName: String): Person{
    override fun getInfo(): String {
        return "Student's name: $firstName $lastName"
    }
}

class Teacher(override var firstName: String, override var lastName: String, override var salary: Int): Employee{
    override fun getInfo(): String {
        return "Teacher's name: $firstName $lastName"
    }
}

fun main(){

}