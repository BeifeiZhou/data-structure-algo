package com.ootti.dsalgo.mergesort

import math.Ordering

object MergeSort {
  def mergeSort[T](list: List[T])(implicit ord: Ordering[T]): List[T] = {
    val mid = list.length / 2
    if (mid == 0) {
      list
    } else {
      def merge(left: List[T], right: List[T]): List[T] = {
        (left, right) match {
          case (_, Nil) => left
          case (Nil, _) => right
          case (leftHead :: leftTail, rightHead :: rightTail) =>
            if (ord.lt(leftHead, rightHead)) leftHead :: merge(leftTail, right)
            else rightHead :: merge(left, rightTail)
        }
      }

      val (left, right) = list.splitAt(mid)
      merge(mergeSort(left), mergeSort(right))
    }
  }
}
