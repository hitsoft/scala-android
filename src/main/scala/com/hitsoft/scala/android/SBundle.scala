package com.hitsoft.scala.android

import android.os.Bundle

/**
 * User: smeagol
 * Date: 24.05.15
 * Time: 15:56
 */
class SBundle {
  private val bundle = new Bundle()

  def put(key: String, value: Any): SBundle = {
    value match {
      case v: Boolean => bundle.putBoolean(key, v)
      case v: Byte => bundle.putByte(key, v)
      case v: Char => bundle.putChar(key, v)
      case v: Short => bundle.putShort(key, v)
      case v: Int => bundle.putInt(key, v)
      case v: Long => bundle.putLong(key, v)
      case v: Float => bundle.putFloat(key, v)
      case v: Double => bundle.putDouble(key, v)
      case v: String => bundle.putString(key, v)
      case _ =>
        assert(assertion = false, "Unsupported value type")
    }
    this
  }

  def putAll(map: Map[String, Any]): SBundle = {
    map.foreach((item) => put(item._1, item._2))
    this
  }

  def get = bundle
}
object SBundle {
  def start = new SBundle()
  def apply(map: Map[String, Any]) = start.putAll(map)
}

trait BundleImplicits {
  @inline implicit def map2Bundle[T <: Map[String, Any]](map: T): Bundle = SBundle(map).get
}