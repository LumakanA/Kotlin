//класс товара
open class Product {
    // Цена товара
    open val price: Int = 0
}

//класс часов, унаследованный от класса Product
class Watch : Product() {
    // Переопределенное свойство цены товара
    override val price: Int = 100
}

//класс кондитерских изделий, унаследованный от класса Product
class Pastry : Product() {
    //новое свойство цены товара
    override val price: Int = 50
}

fun main() {
//класс часов
    val watch = Watch()

//класс кондитерских изделий
    val pastry = Pastry()

//выводим на экран самый дешевый товар
    if (watch.price < pastry.price) {
        println("Цена продукта: ${watch.price}")
    } else {
        println("Цена продукта: ${pastry.price}")
    }

}