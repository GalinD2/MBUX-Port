
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_APPL4 (ID 0x0633)
**/

object MS_APPL4 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MS_APPL4
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.MS_APPL4)

	/** Gets application **/
	fun get_appl4() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_APPL4, 0, 64)
	
	/** Sets application **/
	fun set_appl4(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.MS_APPL4.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|application: ${get_appl4()}
	""".trimMargin("|")
}
