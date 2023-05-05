fun main() {
    println(sentence("Faith",29,"Kenya"))

    println(text("Akirachix"))

    messege("Glenah")
    messege("Faith")




}
//Write a function that takes in 3 parameters, name, age, and country, and returns a String with this
// structure “Hi, my name is x, I am y years old and I am from z.” Where x, y, and z are the provided
// name, age, and country respectively. (3 points)
fun sentence(name:String,age:Int,country:String):String{
    var x="Hi, my name is $name, I am $age years old and I am from $country"
    return x
}

// Write a function that takes in a String and returns its length (2 points)
fun text(word:String):Int{

    return word.length
}

//Write a function that takes in a name and prints out “That’s me!” when your name is passed to it,
// otherwise, it prints out “I don’t know who that is” (3 points)
fun messege(name:String){
    var me = "Faith"
    if(name.equals (me)){
        println("That is me!")
    }else{
        println("I don't know who that is")
    }
}
//Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’.
// Use string interpolation to generate the output. (2 points)
fun vowels(word:String):String{
    var char="[aeiouAEIOU]"
    var answer=""

    for (i in word){
        if ( i in char)
            answer+="*"
    }
    return char
}