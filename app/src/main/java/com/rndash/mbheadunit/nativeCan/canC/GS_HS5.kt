
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_HS5 (ID 0x0505)
**/

object GS_HS5 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of GS_HS5
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.GS_HS5)

	/** UNKNOWN DESCRIPTION **/
	fun get_hs5() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_HS5, 0, 64)
	
	/** UNKNOWN DESCRIPTION **/
	fun set_hs5(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.GS_HS5.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|None: ${get_hs5()}
	""".trimMargin("|")
}
