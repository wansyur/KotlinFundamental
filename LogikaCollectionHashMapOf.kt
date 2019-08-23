fun main(args:Array<String>){
    var var1 = hashMapOf(1 to "iwan", 2 to "wansyur")
    var1.put(3,"wan")

    //mencetak hasilnya
    println(var1.get(3))
    println(var1[3])

    println()
    println("implementasi array of")
    var var2=arrayOf(1,5,7,20)
    println(var2[2])

    println()
    println("Implementasi listOf")

    var var3 = listOf(1,3,4,5,2)
    // tidak boleh dikasih nilai , var3[3] =44

    //maka pakai
    var var4 = mutableListOf(1,2,4,5,12)
    var4[3]= 27
    for (item in var3){
        println(item)
    }
}