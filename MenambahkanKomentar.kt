fun main(args : Array<String>){
    //Mnta data dari user
    print("Masukkan nama anda : ")
    var nama = readLine()
    print("masukkan alamat : ")
    var alamat : String = readLine()!!
    print("masukkan umur : ")
    var umur : Int = readLine()!!.toInt()
    /** tampilkan hasilnya di layar */
    println("Nama saya " + nama)
    println("Alamat saya " + alamat)
    println("Umur saya " + umur)

}