/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class BaseCardElementVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BaseCardElementVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseCardElementVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_BaseCardElementVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BaseCardElementVector() {
    this(AdaptiveCardObjectModelJNI.new_BaseCardElementVector__SWIG_0(), true);
  }

  public BaseCardElementVector(long n) {
    this(AdaptiveCardObjectModelJNI.new_BaseCardElementVector__SWIG_1(n), true);
  }

  public long size() {
    return AdaptiveCardObjectModelJNI.BaseCardElementVector_size(swigCPtr, this);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.BaseCardElementVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.BaseCardElementVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.BaseCardElementVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.BaseCardElementVector_clear(swigCPtr, this);
  }

  public void add(BaseCardElement x) {
    AdaptiveCardObjectModelJNI.BaseCardElementVector_add(swigCPtr, this, BaseCardElement.getCPtr(x), x);
  }

  public BaseCardElement get(int i) {
    long cPtr = AdaptiveCardObjectModelJNI.BaseCardElementVector_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new BaseCardElement(cPtr, true);
  }

  public void set(int i, BaseCardElement val) {
    AdaptiveCardObjectModelJNI.BaseCardElementVector_set(swigCPtr, this, i, BaseCardElement.getCPtr(val), val);
  }

}
