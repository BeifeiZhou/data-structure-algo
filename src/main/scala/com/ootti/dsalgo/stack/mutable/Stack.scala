package com.ootti.dsalgo.stack.mutable

case class Stack[T](var value: T, var next: Option[Stack[T]]) {
  def pop: Stack[T] = next.getOrElse(throw new IllegalStateException("No more element"))

  def push(newValue: T): Unit = {
    value = newValue
    next = Some(this)
  }
}

object Stack {
  // create a stack with the first element
  def apply[T](value: T): Stack[T] = Stack(value, None)
}
