package com.hitsoft.scala.android

/**
 * User: smeagol
 * Date: 24.05.15
 * Time: 14:22
 */
trait Log {

  private lazy val ln = getClass.getName

  object log {
    def d(msg: String) = _root_.android.util.Log.d(ln, msg)

    def d(msg: String, t: Throwable) = _root_.android.util.Log.d(ln, msg, t)
  }

}
