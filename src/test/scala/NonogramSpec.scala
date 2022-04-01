import org.scalatest._
import flatspec._
import matchers._

class NonogramSpec extends AnyFlatSpec with should.Matchers {

  import Nonogram._

  "nonogramRow" should "return Array of integers that represents length of sets of 1's" in {
    nonogramRow(Array(1, 1, 1, 1, 1)) shouldBe Array(5)
    nonogramRow(Array(1, 0, 1, 1, 1)) shouldBe Array(1, 3)
    nonogramRow(Array(1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1)) shouldBe Array(1, 1, 2, 3)
  }

  "nonogramRow" should "return empty Array if no value has been provided" in {
    nonogramRow(Array.empty[Int]) shouldBe Array.empty[Int]
  }

}
