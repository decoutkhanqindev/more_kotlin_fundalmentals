fun main() {
  // Arrays store ordered data of the same type, and have a fixed size.
  // Arrays are used to implement many of the other collection types.
  /*
  val rockPlanets = arrayOf("Mercury", "Venus", "Earth", "Mars")
  val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
  val solarSystem = rockPlanets + gasPlanets
  println(solarSystem[0])
  println(solarSystem[1])
  println(solarSystem[2])
  println(solarSystem[3])
  println(solarSystem[4])
  println(solarSystem[5])
  println(solarSystem[6])
  println(solarSystem[7])

  solarSystem[3] = "Little Earth"
  println(solarSystem[3])
  */

  // Lists are a resizable, ordered collection.
  // List
  /*
  val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
  println(solarSystem.size)
  println(solarSystem[2])
  println(solarSystem.get(3))
  println(solarSystem.indexOf("Earth"))
  println(solarSystem.indexOf("Pluto"))

  for(planet in solarSystem) {
    println(planet)
  }
  */

  // MutableList
  /*
  val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
  solarSystem.add("Pluto")
  solarSystem.add(3, "Theia")
  solarSystem[3] = "Future Moon"
  println(solarSystem[3])
  println(solarSystem[9])

  solarSystem.removeAt(9)
  solarSystem.remove("Future Moon")

  println(solarSystem.contains("Pluto"))
  println("Future Moon" in solarSystem)
  */

  // Sets are unordered collections and cannot contain duplicates.
  // Set
  /* ... */
  // MutableSet
  /*
  val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
  println(solarSystem.size)
  solarSystem.add("Pluto")
  println(solarSystem.size)
  println(solarSystem.contains("Pluto"))

  solarSystem.add("Pluto")
  println(solarSystem.size)

  solarSystem.remove("Pluto")
  println(solarSystem.size)
  println(solarSystem.contains("Pluto"))
  */

  // Maps work similarly to sets and store pairs of keys and values of the specified type.
  // Map
  /* .... */
  // MutableMap
  val solarSystem: MutableMap<String, Int> = mutableMapOf(
    "Mercury" to 0,
    "Venus" to 0,
    "Earth" to 1,
    "Mars" to 2,
    "Jupiter" to 79,
    "Saturn" to 82,
    "Uranus" to 27,
    "Neptune" to 14
  )
  println(solarSystem.size)

  solarSystem["Pluto"] = 5
  println(solarSystem.size)
  println(solarSystem["Pluto"])

  println(solarSystem.get("Theia"))

  solarSystem.remove("Pluto")
  println(solarSystem.size)

  solarSystem["Jupiter"] = 78
  println(solarSystem["Jupiter"])
}