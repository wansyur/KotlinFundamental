fun main(args:Array<String>){
    var kalimat ="mari kita belajar kotlin"
    println(kalimat)
    println("cetak kalimat: "+kalimat)
    println("cetak kalimat: $kalimat")

    println("cetak hutuf ke 5" + kalimat[4])
    println("hitung jumlah karakter: "+ kalimat.length + " Karakter")
    println("Huruf capital: " + kalimat.toUpperCase())
    println("Huruf kecil : "+kalimat.toLowerCase())
    
}