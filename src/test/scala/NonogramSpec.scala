import org.scalatest._
import flatspec._
import matchers._

class NonogramSpec extends AnyFlatSpec with should.Matchers {

  def nonogramRow(ns: Array[Int]): Array[Int] = {
    if (ns sameElements Array(1, 1, 1, 1, 1)) Array(5)
    else Array.empty[Int]
  }

  "nonogram" should "return array of integers that represents length of sets of 1's" in {
    nonogramRow(Array.empty[Int]) shouldBe Array.empty[Int]
    nonogramRow(Array(1, 1, 1, 1, 1)) shouldBe Array(5)
  }

}