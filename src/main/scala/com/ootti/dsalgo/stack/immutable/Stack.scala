package com.ootti.dsalgo.stack.immutable

case class Stack[A](value: A, below: Option[Stack[A]]) {
  def pop: Stack[A] = below.getOrElse(throw new IllegalStateException("there is no more"))

  def push(a: A) = Stack(a, Some(this))
}

object Stack {
  // create a stack with the first element
  def apply[A](a: A): Stack[A] = Stack(a, None)
}
