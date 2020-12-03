package ch02.colors.Color

enum class Color(val r: Int, val g: Int, val b: Int){
    RED(255,0,0),ORANGE(255,165,0),
    YELLOW(255,255,0),GREEN(0,255,0),BLUE(0,0,255),
    INDIGO(75,0,130), VIOLET(238,130,238)
}

//enum class Color(
//    val r: Int. val g: Int, val b: Int
//){
//    RED(255,0,0), ORANGE(255,165,0), YELLOW(255,255,0), GREEN(0,255,0);
//    // 여기에는 반드시 세미콜론(;)을 붙여줘야 한다.
//
//    fun rgb() = (r*256+g)*256+b
//    // enum클래스 안에서 메소드 정의
//}

fun mixOptimized(c1:Color, c2:Color) = when {
    (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED)
    -> Color.ORANGE
    (c1 == Color.BLUE && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.BLUE)
    -> Color.GREEN
    else -> throw Exception("Dirty Color")
}