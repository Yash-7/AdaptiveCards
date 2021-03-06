/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class ImageVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImageVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImageVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_ImageVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ImageVector() {
    this(AdaptiveCardObjectModelJNI.new_ImageVector__SWIG_0(), true);
  }

  public ImageVector(long n) {
    this(AdaptiveCardObjectModelJNI.new_ImageVector__SWIG_1(n), true);
  }

  public long size() {
    return AdaptiveCardObjectModelJNI.ImageVector_size(swigCPtr, this);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.ImageVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.ImageVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.ImageVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.ImageVector_clear(swigCPtr, this);
  }

  public void add(Image x) {
    AdaptiveCardObjectModelJNI.ImageVector_add(swigCPtr, this, Image.getCPtr(x), x);
  }

  public Image get(int i) {
    long cPtr = AdaptiveCardObjectModelJNI.ImageVector_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Image(cPtr, true);
  }

  public void set(int i, Image val) {
    AdaptiveCardObjectModelJNI.ImageVector_set(swigCPtr, this, i, Image.getCPtr(val), val);
  }

}
