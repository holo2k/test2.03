package com.example.test20

data class Pics(val image : Int, val text:String)
data class login(val login: String, val name: String)

object list{
    val list = arrayListOf(
        Pics(R.drawable.olive,"ХОЧУ ОЛИВЬЕ)"),
        Pics(R.drawable.dickd,"ПИСЬКА"),
        Pics(R.drawable.cat,"kitty"),
        Pics(R.drawable.bye,"POKA POKA BB LOX")
    )
}

