package com.ootti.dsalgo.mergesort

import org.scalatest.FunSuite

class MergeSortSuite extends FunSuite {
  test("mergeSort: empty Double List") {
    val list = List[Double]()
    val expectedResult = Nil
    val actualResult = MergeSort.mergeSort(list)
    assertResult(expectedResult)(actualResult)
  }

  test("mergeSort: String List"){
    val stringList = List("a", "b", "c", "a")
    val actualResult = MergeSort.mergeSort(stringList)
    val expectedResult = List("a", "a", "b", "c")
    assertResult(expectedResult)(actualResult)
  }

  test("mergeSort: Int List"){
    val stringList = List(2, 1, 3)
    val actualResult = MergeSort.mergeSort(stringList)
    val expectedResult = List(1, 2, 3)
    assertResult(expectedResult)(actualResult)
  }
}
