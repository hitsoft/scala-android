package com.hitsoft.scala.android

import android.content.Context

import scala.reflect.ClassTag

/**
 * User: smeagol
 * Date: 24.05.15
 * Time: 15:10
 */
class RichContext[V <: android.content.Context](val basis: V) extends TraitContext[V]

trait TraitContext[V <: android.content.Context] {

  def basis: V

  implicit val ctx = basis

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getApplicationContext() getApplicationContext()]]`
   */
  @inline def applicationContext = basis.getApplicationContext

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getApplicationInfo() getApplicationInfo()]]`
   */
  @inline def applicationInfo = basis.getApplicationInfo

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getAssets() getAssets()]]`
   */
  @inline def assets = basis.getAssets

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getCacheDir() getCacheDir()]]`
   */
  @inline def cacheDir = basis.getCacheDir

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getClassLoader() getClassLoader()]]`
   */
  @inline def classLoader = basis.getClassLoader

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getContentResolver() getContentResolver()]]`
   */
  @inline def contentResolver = basis.getContentResolver

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getExternalCacheDir() getExternalCacheDir()]]`
   */
  @inline def externalCacheDir = basis.getExternalCacheDir

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getFilesDir() getFilesDir()]]`
   */
  @inline def filesDir = basis.getFilesDir

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getMainLooper() getMainLooper()]]`
   */
  @inline def mainLooper = basis.getMainLooper

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getObbDir() getObbDir()]]`
   */
  @inline def obbDir = basis.getObbDir

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getPackageCodePath() getPackageCodePath()]]`
   */
  @inline def packageCodePath = basis.getPackageCodePath

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getPackageManager() getPackageManager()]]`
   */
  @inline def packageManager = basis.getPackageManager

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getPackageName() getPackageName()]]`
   */
  @inline def packageName = basis.getPackageName

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getPackageResourcePath() getPackageResourcePath()]]`
   */
  @inline def packageResourcePath = basis.getPackageResourcePath

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getResources() getResources()]]`
   */
  @inline def resources = basis.getResources

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getTheme() getTheme()]]`
   */
  @inline def theme = basis.getTheme

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setTheme(int) setTheme(int)]]`
   */
  @inline def theme(p: Int) = theme_=(p)

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setTheme(int) setTheme(int)]]`
   */
  @inline def theme_=(p: Int) = { basis.setTheme(p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getWallpaper() getWallpaper()]]`
   */
  @deprecated("", "") @inline def wallpaper = basis.getWallpaper

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setWallpaper(android.graphics.Bitmap) setWallpaper(android.graphics.Bitmap)]]`
   */
  @deprecated("", "") @inline def wallpaper(p: android.graphics.Bitmap) = wallpaper_=(p)

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setWallpaper(android.graphics.Bitmap) setWallpaper(android.graphics.Bitmap)]]`
   */
  @deprecated("", "") @inline def wallpaper_=(p: android.graphics.Bitmap) = { basis.setWallpaper(p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setWallpaper(java.io.InputStream) setWallpaper(java.io.InputStream)]]`
   */
  @deprecated("", "") @inline def wallpaper(p: java.io.InputStream) = wallpaper_=(p)

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setWallpaper(java.io.InputStream) setWallpaper(java.io.InputStream)]]`
   */
  @deprecated("", "") @inline def wallpaper_=(p: java.io.InputStream) = { basis.setWallpaper(p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getWallpaperDesiredMinimumHeight() getWallpaperDesiredMinimumHeight()]]`
   */
  @deprecated("", "") @inline def wallpaperDesiredMinimumHeight = basis.getWallpaperDesiredMinimumHeight

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getWallpaperDesiredMinimumWidth() getWallpaperDesiredMinimumWidth()]]`
   */
  @deprecated("", "") @inline def wallpaperDesiredMinimumWidth = basis.getWallpaperDesiredMinimumWidth

  @inline def bindService[T: ClassTag](p1: android.content.ServiceConnection, p2: Int)(implicit context: Context): Boolean = basis.bindService(SIntent[T], p1, p2)

  @inline def removeStickyBroadcast[T: ClassTag](implicit context: Context): Unit = basis.removeStickyBroadcast(SIntent[T])

  @inline def sendBroadcast[T: ClassTag](implicit context: Context): Unit = basis.sendBroadcast(SIntent[T])

  @inline def sendBroadcast[T: ClassTag](p: java.lang.String)(implicit context: Context): Unit = basis.sendBroadcast(SIntent[T], p)

  @inline def sendOrderedBroadcast[T: ClassTag](p: java.lang.String)(implicit context: Context): Unit = basis.sendOrderedBroadcast(SIntent[T], p)

  @inline def sendOrderedBroadcast[T: ClassTag](p1: java.lang.String, p2: android.content.BroadcastReceiver, p3: android.os.Handler, p4: Int, p5: java.lang.String, p6: android.os.Bundle)(implicit context: Context): Unit = basis.sendOrderedBroadcast(SIntent[T], p1, p2, p3, p4, p5, p6)

  @inline def sendStickyBroadcast[T: ClassTag](implicit context: Context): Unit = basis.sendStickyBroadcast(SIntent[T])

  @inline def sendStickyOrderedBroadcast[T: ClassTag](p1: android.content.BroadcastReceiver, p2: android.os.Handler, p3: Int, p4: java.lang.String, p5: android.os.Bundle)(implicit context: Context): Unit = basis.sendStickyOrderedBroadcast(SIntent[T], p1, p2, p3, p4, p5)

  @inline def startActivity[T: ClassTag](implicit context: Context): Unit = basis.startActivity(SIntent[T])

  @inline def startActivity[T: ClassTag](p: android.os.Bundle)(implicit context: Context): Unit = basis.startActivity(SIntent[T], p)

  @inline def startService[T: ClassTag](implicit context: Context): android.content.ComponentName = basis.startService(SIntent[T])

  @inline def stopService[T: ClassTag](implicit context: Context): Boolean = basis.stopService(SIntent[T])
}


trait ContextImplicits {
  @inline implicit def context2RichContext[T <: Context](context: T): RichContext[T] = new RichContext[T](context)
}
