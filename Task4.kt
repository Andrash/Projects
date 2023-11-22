fun main (args: Array<String>){
    println("Task 4.Заполнить пропуски, чтобы функция выдала требуемый результат.")
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)
    var xz = 0;
    var y:Int
    while (xz < 4) {
        y = index[xz];
        println("Fruit = ${fruit[y]}")
        xz += 1
    }
}