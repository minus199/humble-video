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
 * A link between two {@link Filter}s in a {@link FilterGraph}.  
 */
public class FilterLink extends RefCounted {
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
  protected FilterLink(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGFilterLinkUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected FilterLink(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGFilterLinkUpcast(cPtr),
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
  protected static long getCPtr(FilterLink obj) {
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
   * Create a new FilterLink object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public FilterLink copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new FilterLink(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof FilterLink)
      equal = (((FilterLink)obj).swigCPtr == this.swigCPtr);
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
 *  
 */
  public FilterGraph getFilterGraph() {
    long cPtr = VideoJNI.FilterLink_getFilterGraph(swigCPtr, this);
    return (cPtr == 0) ? null : new FilterGraph(cPtr, false);
  }

/**
 * @return	the input filter for this link.  
 */
  public Filter getInputFilter() {
    long cPtr = VideoJNI.FilterLink_getInputFilter(swigCPtr, this);
    return (cPtr == 0) ? null : new Filter(cPtr, false);
  }

/**
 * @return	the input pad name for this link.  
 */
  public String getInputPadName() {
    return VideoJNI.FilterLink_getInputPadName(swigCPtr, this);
  }

/**
 * @return	the input pad type for this link. Should be the same as {@link 
 *		 #getMediaType()}.  
 */
  public MediaDescriptor.Type getInputPadType() {
    return MediaDescriptor.Type.swigToEnum(VideoJNI.FilterLink_getInputPadType(swigCPtr, this));
  }

/**
 * @return	the output filter for this link.  
 */
  public Filter getOutputFilter() {
    long cPtr = VideoJNI.FilterLink_getOutputFilter(swigCPtr, this);
    return (cPtr == 0) ? null : new Filter(cPtr, false);
  }

/**
 * @return	the output pad name for this link.  
 */
  public String getOutputPadName() {
    return VideoJNI.FilterLink_getOutputPadName(swigCPtr, this);
  }

/**
 * @return	the output pad type for this link. Should be the same as 
 *		 {@link #getMediaType()}.  
 */
  public MediaDescriptor.Type getOutputPadType() {
    return MediaDescriptor.Type.swigToEnum(VideoJNI.FilterLink_getOutputPadType(swigCPtr, this));
  }

/**
 * @return	the {@link MediaDescriptor.Type} for this link.  
 */
  public MediaDescriptor.Type getMediaType() {
    return MediaDescriptor.Type.swigToEnum(VideoJNI.FilterLink_getMediaType(swigCPtr, this));
  }

/**
 * @return	width of video agreed between the input filter and output 
 *		 filter if {@link MediaDescriptor.Type} = {@link 
 *		 MediaDescriptor.Type.MEDIA_VIDEO}.  
 */
  public int getWidth() {
    return VideoJNI.FilterLink_getWidth(swigCPtr, this);
  }

/**
 * @return	height of video agreed between the input filter and output 
 *		 filter if {@link MediaDescriptor.Type} = {@link 
 *		 MediaDescriptor.Type.MEDIA_VIDEO}.  
 */
  public int getHeight() {
    return VideoJNI.FilterLink_getHeight(swigCPtr, this);
  }

/**
 * @return	pixel format of video agreed between the input filter and 
 *		 output filter if {@link MediaDescriptor.Type} = 
 *		 {@link MediaDescriptor.Type.MEDIA_VIDEO}.  
 */
  public PixelFormat.Type getPixelFormat() {
    return PixelFormat.Type.swigToEnum(VideoJNI.FilterLink_getPixelFormat(swigCPtr, this));
  }

/**
 * @return	pixel aspect ratio of video agreed between the input filter 
 *		 and output filter if {@link MediaDescriptor.Type} 
 *		 = {@link MediaDescriptor.Type.MEDIA_VIDEO}.  
 */
  public Rational getPixelAspectRatio() {
    long cPtr = VideoJNI.FilterLink_getPixelAspectRatio(swigCPtr, this);
    return (cPtr == 0) ? null : new Rational(cPtr, false);
  }

/**
 * @return	channel layout agreed between the input filter and output 
 *		 filter if {@link MediaDescriptor.Type} = {@link 
 *		 MediaDescriptor.Type.MEDIA_AUDIO}.  
 */
  public AudioChannel.Layout getChannelLayout() {
    return AudioChannel.Layout.swigToEnum(VideoJNI.FilterLink_getChannelLayout(swigCPtr, this));
  }

/**
 * @return	sample rate agreed between the input filter and output filter 
 *		 if {@link MediaDescriptor.Type} = {@link MediaDescriptor.Type.MEDIA_AUDIO}. 
 *		  
 */
  public int getSampleRate() {
    return VideoJNI.FilterLink_getSampleRate(swigCPtr, this);
  }

/**
 * @return	sample format agreed between the input filter and output 
 *		 filter if {@link MediaDescriptor.Type} = {@link 
 *		 MediaDescriptor.Type.MEDIA_AUDIO}.  
 */
  public AudioFormat.Type getSampleFormat() {
    return AudioFormat.Type.swigToEnum(VideoJNI.FilterLink_getSampleFormat(swigCPtr, this));
  }

/**
 * Define the time base used by the PTS of the frames/samples  
 * which will pass through this link.  
 * During the configuration stage, each filter is supposed to  
 * change only the output timebase, while the timebase of the  
 * input link is assumed to be an unchangeable property.  
 * @return	the timebase  
 */
  public Rational getTimeBase() {
    long cPtr = VideoJNI.FilterLink_getTimeBase(swigCPtr, this);
    return (cPtr == 0) ? null : new Rational(cPtr, false);
  }

/**
 * Insert a filter into this link between the current input and output. 
 *  
 * @param	filter filter to insert  
 * @param	srcPadIndex the index of the pad on filter to connect the 
 *		 output of the start of the prior link to.  
 * @param	dstPadIndex the index of the pad on filter to connect the 
 *		 input of the end of the prior link to.  
 */
  public void insertFilter(Filter filter, int srcPadIndex, int dstPadIndex) {
    VideoJNI.FilterLink_insertFilter(swigCPtr, this, Filter.getCPtr(filter), filter, srcPadIndex, dstPadIndex);
  }

}
