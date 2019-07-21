package com.ootti.dsalgo.conseccounter

object Counter {
  def pack[T](list: List[T]): List[List[T]] = {
    list match {
      case Nil => Nil
      case head :: tail =>
        val (left, right) = list.span(_ == head)
        left :: pack(right)
    }
  }

  def encode[T](list: List[T]): List[(T, Int)] = {
    pack(list).map(subList => (subList.head, subList.length))
  }
}
