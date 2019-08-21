fun main(args : Array<String>){
    var nilai1 :Int =10
    var nilai2 :Int =3
    var nilai3 :Int?
    var nilai4:Int?

    nilai3 = ++nilai1
    nilai4 = nilai2++
    println("hasil ? $nilai3") //11
    println("hasil ? $nilai4") //3

    println(nilai1) //11
    println(nilai2) //4

    nilai3 = --nilai1
    nilai4 = nilai2--

    println("hasil ? $nilai3") //10
    println("hasil ? $nilai4") //4

}