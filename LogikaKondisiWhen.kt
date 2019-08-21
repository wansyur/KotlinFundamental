fun main(args:Array<String>){
    var nilai :Int=8

    when(nilai){
        1,2,3,4,5,6 -> println("maaf nilai anda kurang dari rata-rata")
        7,8 -> println("nilai anda cukup")
        9,10 -> println("nilai anda bagus")
        else -> println("Diluar batas nilai")
    }
}