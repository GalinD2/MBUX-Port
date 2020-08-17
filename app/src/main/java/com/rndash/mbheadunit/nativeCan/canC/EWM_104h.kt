
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for EWM_104h (ID 0x0104)
**/

object EWM_104h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of EWM_104h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.EWM_104h)

	/** Gets FBS message to EZS (8 bytes) **/
	fun get_ewm_fbs() : Int = CanBusNative.getECUParameterC(CanCAddrs.EWM_104h, 0, 64)
	
	/** Sets FBS message to EZS (8 bytes) **/
	fun set_ewm_fbs(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.EWM_104h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|FBS message to EZS (8 bytes): ${get_ewm_fbs()}
	""".trimMargin("|")
}
