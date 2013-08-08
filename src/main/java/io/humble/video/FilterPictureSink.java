/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * A Sink of {@link MediaPicture} objects for a {@link FilterGraph}. 
 *  
 */
public class FilterPictureSink extends FilterSink {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    Buffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected FilterPictureSink(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGFilterPictureSinkUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected FilterPictureSink(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGFilterPictureSinkUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(FilterPictureSink obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new FilterPictureSink object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public FilterPictureSink copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new FilterPictureSink(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof FilterPictureSink)
      equal = (((FilterPictureSink)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

/**
 * @param	picture The picture to fill if possible.  
 * @return	>=0 if a successful picture is fetched, or -1 for EOF.  
 */
  public int getPicture(MediaPicture picture) {
    return VideoJNI.FilterPictureSink_getPicture(swigCPtr, this, MediaPicture.getCPtr(picture), picture);
  }

}
