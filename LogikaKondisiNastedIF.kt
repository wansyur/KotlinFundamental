fun main(args : Array<String>){
    print("masukkan umur anda? ")
    var umur : Int = readLine()!!.toInt()
    if(umur < 17){
        println("maaf anda diluar batas usia")
    }else{
        var tinggi :Int=readLine()!!.toInt()
        if(tinggi < 160){                                   //nasted if
            println("maaf tinggi anda kurang dari 160")
        }else if(tinggi == 160){
            println("tinggi anda adalah 160")
        }else{
            println("tinggi anda lebih dari 160")
        }
    }


}