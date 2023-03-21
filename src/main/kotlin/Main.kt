fun main() {
    println(longName("Anna","Mary"))
    val result=getMinMax(arrayOf(40,20,30,50,25,35))
    println(result.average)
    charSplit("Bree")
    println( joinArray(arrayOf("Anita","Moma")))



    var nums=calculator(10,20,25)
    nums.addition()
    nums.subtraction()
    nums.multiplication()
    nums.division()

}//question1
fun longName(name1:String,name2:String):Char {
    return if (name1.length >= name2.length) {
         name1[0]
    } else {
         name2[0]

    }
}//question2
data class minMax(val min:Int,val max:Int,val average:Double)
 fun getMinMax(number:Array<Int>):minMax {
     val min = number.min()
     val Max=number.max()
     val average=number.average()
     val result=minMax(min,Max,average)
     return result
 }
//question3
fun charSplit(word:String){
    var words=word.split("")
    println(words)

//    for(char in word)
//        println(char)
}
//question 4
fun joinArray(name:Array<String>):String{
   return name.joinToString("")

}

class calculator(var num1:Int,var num2:Int,var num3:Int) {
    fun addition() {
        var sum = num1 + num2
        println(sum)

    }

    fun subtraction() {
        var difference = num2 - num3
        println(difference)

    }

    fun multiplication() {
        var product = num1 * num2
        println(product)

    }

    fun division() {
        var result = num2 / num1
        println(result)

    }
}