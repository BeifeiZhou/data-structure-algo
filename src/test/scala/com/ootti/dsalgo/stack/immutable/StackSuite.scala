package com.ootti.dsalgo.stack.immutable

import org.scalatest.FunSuite

class StackSuite extends FunSuite {
  test("Stack") {
    val stack = Stack(1)
    val newStackWith2Elements = stack.push(2)
    val originalStack = newStackWith2Elements.pop // originalStack==stack
    assertResult(stack)(originalStack)
  }
}
