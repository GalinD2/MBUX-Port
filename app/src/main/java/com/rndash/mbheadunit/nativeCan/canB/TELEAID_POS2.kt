
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TELEAID_POS2 (ID 0x03E6)
**/

object TELEAID_POS2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of TELEAID_POS2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.TELEAID_POS2)

	/** Gets GPS velocity  **/
	fun get_gps_vel() : Int = CanBusNative.getECUParameterB(CanBAddrs.TELEAID_POS2, 0, 16)
	
	/** Sets GPS velocity  **/
	fun set_gps_vel(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 16, p)
	}
	
	/** Gets GPS heading  **/
	fun get_gps_head() : Int = CanBusNative.getECUParameterB(CanBAddrs.TELEAID_POS2, 16, 16)
	
	/** Sets GPS heading  **/
	fun set_gps_head(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 16, p)
	}
	
	/** Gets GPS ellipsoid height  **/
	fun get_gps_ellip() : Int = CanBusNative.getECUParameterB(CanBAddrs.TELEAID_POS2, 32, 16)
	
	/** Sets GPS ellipsoid height  **/
	fun set_gps_ellip(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 16, p)
	}
	
	/** Gets GPS altitude  **/
	fun get_gps_alt() : Int = CanBusNative.getECUParameterB(CanBAddrs.TELEAID_POS2, 48, 16)
	
	/** Sets GPS altitude  **/
	fun set_gps_alt(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 48, 16, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.TELEAID_POS2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|GPS velocity : ${get_gps_vel()} cm / s
		|GPS heading : ${get_gps_head()} °
		|GPS ellipsoid height : ${get_gps_ellip()} m
		|GPS altitude : ${get_gps_alt()} m
	""".trimMargin("|")
}
