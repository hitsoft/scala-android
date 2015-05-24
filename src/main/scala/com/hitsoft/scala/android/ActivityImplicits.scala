package com.hitsoft.scala.android

import android.app.Activity
import android.view.View

/**
 * User: smeagol
 * Date: 24.05.15
 * Time: 9:23
 */

trait TraitActivity[A <: Activity] {
  def basis: A

  @inline def find[T <: View](id: Int) = basis.findViewById(id).asInstanceOf[T]
}

class RichActivity[A <: Activity](val basis: A) extends TraitActivity[A]

trait ActivityImplicits {
  @inline implicit def activity2RichActivity[T <: Activity](activity: T): RichActivity[T] = new RichActivity[T](activity)
}