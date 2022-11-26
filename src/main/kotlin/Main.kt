fun main(args: Array<String>) {
    println("Разработать программу, которая для заданной строки s подсчитывает количество букв в строке")
    print("Введите текст строки - ")
    val stringVvod: String = (readln())
    val itog = stringVvod.replace("[^a-zA-Zа-яёА-ЯЁ]".toRegex(), "")
    print("Число букв в строке = ")
    println(itog.count())
}