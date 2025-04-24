// generic class
data class Question<T>(
  val questionText: String,
  val answer: T,
  val difficulty: Difficulty,
)

enum class Difficulty {
  EASY, MEDIUM, HARD
}

/*
// singleton object
object StudentProgress {
  var total: Int = 10
  var answered: Int = 3
}
*/

interface ProgressPrintable {
  val progressText: String
  fun printProgressBar()
}

class Quiz : ProgressPrintable {
  val question1 = Question<String>(
    questionText = "Quoth the raven ___", answer = "nevermore", difficulty = Difficulty.MEDIUM
  )
  val question2 = Question<Boolean>(
    questionText = "The sky is green. True or false", answer = false, difficulty = Difficulty.EASY
  )
  val question3 = Question<Int>(
    questionText = "How many days are there between full moons?", answer = 28, difficulty = Difficulty.HARD
  )

  // singleton object
  companion object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
  }

  override val progressText: String
    get() = "$answered of $total answered"

  override fun printProgressBar() {
    repeat(answered) { print("▓") }
    repeat(total - answered) { print("▒") }
    println()
    println(progressText)
  }

  // scope function
  fun printQuiz() {
    question1.let { it: Question<String> ->
      println(it.questionText)
      println(it.answer)
      println(it.difficulty)
    }
    println()
    question2.let { it: Question<Boolean> ->
      println(it.questionText)
      println(it.answer)
      println(it.difficulty)
    }
    println()
    question3.let { it: Question<Int> ->
      println(it.questionText)
      println(it.answer)
      println(it.difficulty)
    }
    println()
  }
}

/*
// extension property
val Quiz.StudentProgress.progressText: String
  get() = "$answered of $total answered"
*/

/*
// extension function
fun Quiz.StudentProgress.printProgressBar() {
  repeat(Quiz.answered) { print("▓") }
  repeat(Quiz.total - Quiz.answered) { print("▒") }
  println()
  println(Quiz.progressText)
}
*/

fun main() {
  val quiz = Quiz()
  quiz.apply {
    printQuiz()
    printProgressBar()
  }
}