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
 * The parent class for all Raw media data.  
 */
public class MediaRaw extends Media {
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
  protected MediaRaw(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGMediaRawUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MediaRaw(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGMediaRawUpcast(cPtr),
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
  protected static long getCPtr(MediaRaw obj) {
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
   * Create a new MediaRaw object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MediaRaw copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MediaRaw(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof MediaRaw)
      equal = (((MediaRaw)obj).swigCPtr == this.swigCPtr);
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
 * Get the time stamp of this object in getTimeBase() units.  
 * @return	the time stamp  
 */
  public long getTimeStamp() {
    return VideoJNI.MediaRaw_getTimeStamp(swigCPtr, this);
  }

/**
 * Set the time stamp for this object in getTimeBase() units.  
 * @param	aTimeStamp The time stamp  
 */
  public void setTimeStamp(long aTimeStamp) {
    VideoJNI.MediaRaw_setTimeStamp(swigCPtr, this, aTimeStamp);
  }

/**
 * Get the time base that time stamps of this object are represented 
 * in.  
 * @return	the time base.  
 */
  public Rational getTimeBase() {
    long cPtr = VideoJNI.MediaRaw_getTimeBase(swigCPtr, this);
    return (cPtr == 0) ? null : new Rational(cPtr, false);
  }

/**
 * Is this object a key object? i.e. it can be interpreted without needing 
 * any other media objects  
 * @return	true if it's a key, false if not  
 */
  public boolean isKey() {
    return VideoJNI.MediaRaw_isKey(swigCPtr, this);
  }

/**
 * Get the presentation time stamp  
 */
  public long getPts() {
    return VideoJNI.MediaRaw_getPts(swigCPtr, this);
  }

/**
 * Get any meta-data associated with this media item  
 */
  public KeyValueBag getMetaData() {
    long cPtr = VideoJNI.MediaRaw_getMetaData(swigCPtr, this);
    return (cPtr == 0) ? null : new KeyValueBag(cPtr, false);
  }

/**
 * pts copied from the Packet that was decoded to produce this frame 
 *  
 * - encoding: unused  
 * - decoding: Read by user.  
 */
  public long getPacketPts() {
    return VideoJNI.MediaRaw_getPacketPts(swigCPtr, this);
  }

/**
 * dts copied from the Packet that triggered returning this frame  
 * - encoding: unused  
 * - decoding: Read by user.  
 */
  public long getPacketDts() {
    return VideoJNI.MediaRaw_getPacketDts(swigCPtr, this);
  }

/**
 * size of the corresponding packet containing the compressed  
 * frame.  
 * It is set to a negative value if unknown.  
 * - encoding: unused  
 * - decoding: set by libavcodec, read by user.  
 */
  public int getPacketSize() {
    return VideoJNI.MediaRaw_getPacketSize(swigCPtr, this);
  }

/**
 * duration of the corresponding packet, expressed in  
 * ContainerStream.getTimeBase() units, 0 if unknown.  
 * - encoding: unused  
 * - decoding: Read by user.  
 */
  public long getPacketDuration() {
    return VideoJNI.MediaRaw_getPacketDuration(swigCPtr, this);
  }

/**
 * frame timestamp estimated using various heuristics, in stream time 
 * base  
 * - encoding: unused  
 * - decoding: set by libavcodec, read by user.  
 */
  public long getBestEffortTimeStamp() {
    return VideoJNI.MediaRaw_getBestEffortTimeStamp(swigCPtr, this);
  }

/**
 * @param	value is the object complete or not.  
 * @see		#isComplete()  
 */
  public void setComplete(boolean value) {
    VideoJNI.MediaRaw_setComplete(swigCPtr, this, value);
  }

}
