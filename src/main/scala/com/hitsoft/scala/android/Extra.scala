package com.hitsoft.scala.android

/**
 * User: smeagol
 * Date: 24.05.15
 * Time: 22:44
 */
trait Extra {
  protected def _key(key: String) = s"${this.getClass.getName}._.$key"
}
