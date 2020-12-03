//fun main(args: Array<String>){
//    println("Hello, world!")
//}
//fun main(args: Array<String>) {
//    println("Hello, world!")
//}

class Person(val name: String, var isMarried: Boolean)

fun main(args: Array<String>) { // 코틀린은 new 키워드를 사용하지 않고 생성자를 호출한다
val person = Person("seohui", false)
// person.name = "gglee" // 수정 불가능
//person.isMarried = true // 수정 가능 }
    println(person.isMarried)
}

