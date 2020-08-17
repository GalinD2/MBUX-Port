
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for SAM_H_A6 (ID 0x00CC)
**/

object SAM_H_A6 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of SAM_H_A6
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.SAM_H_A6)

	/** Gets code access authorization **/
	fun get_zbc_sam_h() : Int = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A6, 0, 64)
	
	/** Sets code access authorization **/
	fun set_zbc_sam_h(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.SAM_H_A6.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|code access authorization: ${get_zbc_sam_h()}
	""".trimMargin("|")
}
