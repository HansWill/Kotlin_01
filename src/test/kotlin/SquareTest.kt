import basics.square
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test



class SquareTest {

    @Test
    fun testRegularSquares() {
        assertEquals(25, square(5))
        assertEquals(0, square(0))
        assertEquals(4, square(-2))
    }
}