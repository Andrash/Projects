fun main (args: Array<String>){
    println("Task 3. Требуется вывести строку с сообщением для каждого имени в массив firemen.")
    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemenNo = 0;
    while (firemenNo < 6) {
        println("Firemen number $firemenNo is ${firemen[firemenNo]}")
        firemenNo += 1
    }
}