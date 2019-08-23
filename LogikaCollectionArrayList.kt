fun main(args: Array<String>){
    var arrayList = ArrayList<String>()
    arrayList.add("iwan")
    arrayList.add("i")
    arrayList.add("w")
    arrayList.add("a")
    arrayList.add("n")

    println("hasil cetak nama adalah "+arrayList.get(1))
    println("daftar nama-nama: ")
    for (item in arrayList){
        println(item)
    }
    if(arrayList.contains("iwan")){
        println("ada dalam daftar")
    }else{
        println("tidak ada dalam daftar")
    }

    println("cetak sejumlah element yang ada")
    for(index in 0..arrayList.size-1 ){
        println("arrayList.get(index)")
    }
}