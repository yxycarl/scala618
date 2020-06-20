package com.yxy.day1

import scala.util.control.Breaks._

object Hello {
  def main(args: Array[String]): Unit = {
   var arry=Array(10,20,30)
    add(arry:_*)
  }
  def add(a:Int*)={
    for (elem <- a) {
      println(elem)
    }
  }
}
