class Cookie(
  val name: String, val softBaked: Boolean, val hasFilling: Boolean, val price: Double
)

val cookies: List<Cookie> = listOf(
  Cookie(name = "Chocolate Chip", softBaked = false, hasFilling = false, price = 1.69),
  Cookie(name = "Banana Walnut", softBaked = true, hasFilling = false, price = 1.49),
  Cookie(name = "Vanilla Creme", softBaked = false, hasFilling = true, price = 1.59),
  Cookie(name = "Chocolate Peanut Butter", softBaked = false, hasFilling = true, price = 1.49),
  Cookie(name = "Snickerdoodle", softBaked = true, hasFilling = false, price = 1.39),
  Cookie(name = "Blueberry Tart", softBaked = true, hasFilling = true, price = 1.79),
  Cookie(name = "Sugar and Sprinkles", softBaked = false, hasFilling = false, price = 1.39)
)

fun main() {
  // You can loop over each element in a collection using forEach().
  // Expressions can be inserted into strings.

  // map() is used to format the items in a collection, often as a collection of another data type.
  val fullMenu: List<String> = cookies.map { it: Cookie ->
    "${it.name} - $${it.price}"
  }
  println("Full menu:")
  fullMenu.forEach { it: String ->
    println(it)
  }

  repeat(20) {
    print("_")
  }
  println()

  // filter() can generate a subset of a collection.
  val softBakedMenu: List<Cookie> = cookies.filter { it: Cookie ->
    it.softBaked
  }
  println("Soft cookies:")
  softBakedMenu.forEach { it: Cookie ->
    println("${it.name} - $${it.price}")
  }

  repeat(20) {
    print("_")
  }
  println()

  // groupBy() splits a collection based on a function's return value.
  val groupedMenu: Map<Boolean, List<Cookie>> = cookies.groupBy { it: Cookie ->
    it.softBaked
  }
  //  val softBakedMenu = groupedMenu[true] ?: listOf()
  val crunchyMenu: List<Cookie> = groupedMenu[false] ?: listOf()
  println("Crunchy cookies:")
  crunchyMenu.forEach { it: Cookie ->
    println("${it.name} - $${it.price}")
  }

  repeat(20) {
    print("_")
  }
  println()

  // fold() turns a collection into a single value.
  val totalPrice: Double = cookies.fold(initial = 0.0) { total: Double, cookie: Cookie ->
    total + cookie.price
  }
  println("Total price: $${totalPrice}")

  repeat(20) {
    print("_")
  }
  println()

  // sortedBy() is used to sort a collection by a specified property.
  val alphabeticalMenu: List<Cookie> = cookies.sortedBy { it: Cookie ->
    it.price
  }
  println("Alphabetical menu:")
  alphabeticalMenu.forEach { it: Cookie ->
    println(it.price)
  }
}