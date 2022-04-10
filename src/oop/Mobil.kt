package oop

import java.awt.Color

data class Mobil (
    var color : Color,
    var engine : String
        )

fun main(){
    var m = Mobil(Color.CYAN,"V6")
    print("${m.color} ${m.engine}")
}