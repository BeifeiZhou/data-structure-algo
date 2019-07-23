package com.ootti.dsalgo.stack.mutable

import org.scalatest.FunSuite

import scala.util.Try

class StackSuite extends FunSuite {
  test("mutable stack") {
    val stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    assertResult(stack.pop.value)(3)
  }

  test("empty stack") {
    val stack = Stack()
    val tryStack = Try(stack.pop)
    assert(tryStack.isFailure)
  }
}
