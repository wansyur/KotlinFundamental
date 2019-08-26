fun main(args: Array<String>){
    var var1=setOf(1,4,5,5,5,6,7)

    println("implementasi untuk setof")
    for(item in var1){
        println(item)
    }
    println()
    println("implementasi untuk setof")
    var var2 = mutableSetOf(2,2,4,5,5,6)
    var2.add(7)
    for(item in var2){
        println(item)
    }
}