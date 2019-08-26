fun hitung(n1:Int,n2:Int):Int{ //output : Int , Unit
    var jumlah = n1+n2
    return jumlah
}
fun hitung(n1:Int,n2:Int,n3:Int):Int{ //output : Int , Unit
    var jumlah = n1+n2+n3
    return jumlah
}
fun hitung(n1:Int,n2:Int,n3:Int,n4:Int):Int{ //output : Int , Unit
    var jumlah = n1+n2+n3+n4
    return jumlah
}
fun main(args : Array<String>){
    var hasil:Int = hitung(6,4)
    println(hasil)
    var hasil2 = hitung(5,2,5)
    println(hasil2)
}