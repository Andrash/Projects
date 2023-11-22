fun main (args: Array<String>) {
    var x = 1
    println("Task 1. Cобрать код функции main, которая выводит на экран «YabbaDabbaDo».")
    while (x <4) {
        print (if (x == 1) "Yab" else "ba")
        print (if (x == 2) "Dab" else "")
        x += 1
    }
    if (x == 4) print ("Do")
}