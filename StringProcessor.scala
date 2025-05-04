object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
    val result = strings
      .filter(string => string.length > 3)
      .map(string => string.toUpperCase)
    result
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}
