import kotlin.math.sqrt
fun main() {
    val p1 = Point(3,7)
    val p2 = Point(6, 3)
    println(p1.toString())
    p2.moveBySymmetry()
    println(p2.toString())
    println(p1.distance(p2))
}
class Point(private var x: Int, private var y: Int) {
    override fun toString(): String {     //გამოტანა სტრინგად
        return "X:$x, Y:$y"
    }

    override fun equals(other: Any?): Boolean {    //შედარება
        if (other is Point) {
            if (x == other.x && y == other.y) {
                return true
            }
        }
        return false
    }

    fun moveBySymmetry() { //სიმეტრიულად გადატანა
        val newx = -x
        val newy = -y
        x = newx
        y = newy
    }

    fun distance(other: Any?): Any { //მანძილის გამოთვლა
        if (other is Point) {
            val distance = sqrt((other.x - x) * (other.x - x) + (other.y - y) * (other.y - y).toDouble())
            return distance
        }
        return false
    }

}
