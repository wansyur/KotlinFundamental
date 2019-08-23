fun main(args: Array<String>){
    var hashMap = HashMap<Int,String>()
    hashMap.put(1, "iwan")
    hashMap.put(2, "terbang")
    hashMap.put(3, "kembali")

    println(hashMap.get(3))
    hashMap.put(31,"haikawan")

    println("cetak seluruh nama terbaru : ")
    for (k in hashMap.keys){
        println(hashMap.get(k))
    }
}