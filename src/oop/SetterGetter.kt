package oop

class SetterGetter {
    private var name : String = ""
    fun setName(nameParam : String){
        this.name = nameParam.plus(" Karenina")
    }

    fun getName() : String{
        return name
    }
}
fun main(){
    val sg = SetterGetter()
    sg.setName("Anna")
    println(sg.getName())
}