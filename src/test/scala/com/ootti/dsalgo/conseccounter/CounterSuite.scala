package com.ootti.dsalgo.conseccounter

import org.scalatest.FunSuite

class CounterSuite extends FunSuite {

  test("encode: empty list") {
    val actualResult = Counter.encode(Nil)
    val expectedResult = Nil
    assertResult(expectedResult)(actualResult)
  }

  test("encode: string list") {
    val stringList = List("a", "a", "b", "c", "c", "a", "a")
    val actualResult = Counter.encode(stringList)
    val expectedResult = List(("a", 2), ("b", 1), ("c", 2), ("a", 2))
    assertResult(expectedResult)(actualResult)
  }

  test("encode: int list") {
    val stringList = List(1, 2, 3, 5, 1, 1, 1, 3, 3, 3)
    val actualResult = Counter.encode(stringList)
    val expectedResult = List((1, 1), (2, 1), (3, 1), (5, 1), (1, 3), (3, 3))
    assertResult(expectedResult)(actualResult)
  }

}
