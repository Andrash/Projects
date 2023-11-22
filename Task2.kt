fun main (args: Array<String>){
println("Task 2. Требуется вывести строку с сообщением для каждого имени из массива hobbits.")
val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
var z = 0;
while (z < 4) {
    println("${hobbits[z]} is good Hobbit name.")
    z += 1
    }
}