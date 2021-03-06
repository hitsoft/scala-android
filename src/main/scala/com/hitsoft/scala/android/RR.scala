package com.hitsoft.scala.android

import java.util.{ResourceBundle, Locale}

import android.content.Context
import android.text.{Spanned, Html}

/**
 * User: smeagol
 * Date: 24.05.15
 * Time: 14:24
 */
object RR {
  def html(res: Seq[Int])(implicit ctx: Context) = Html.fromHtml(res.map(ctx.getResources.getString).mkString)
  def html(res: Int)(implicit ctx: Context): Spanned = html(Seq(res))
  def string(res: Int)(implicit ctx: Context): String = ctx.getResources.getString(res)
  def rb(locale: Locale) = ResourceBundle.getBundle("Message", locale)
}
