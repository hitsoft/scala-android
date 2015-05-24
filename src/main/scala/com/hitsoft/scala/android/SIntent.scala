package com.hitsoft.scala.android

import android.content.{Intent, Context}

import scala.reflect.ClassTag

/**
 * User: smeagol
 * Date: 24.05.15
 * Time: 15:14
 */
object SIntent {
  @inline def apply[T](implicit context: Context, mt: ClassTag[T]) = new Intent(context, mt.runtimeClass)
  @inline def apply[T](action: String)(implicit context: Context, mt: ClassTag[T]): Intent = SIntent[T].setAction(action)
}
