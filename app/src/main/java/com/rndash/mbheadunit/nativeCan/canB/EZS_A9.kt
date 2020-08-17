
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for EZS_A9 (ID 0x00B2)
**/

object EZS_A9 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of EZS_A9
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.EZS_A9)

	/** Gets VIN signal part **/
	fun get_vin_msg() : VIN_MSG = when(CanBusNative.getECUParameterB(CanBAddrs.EZS_A9, 6, 2)) {
		 0 -> VIN_MSG.N_DEF
		 1 -> VIN_MSG.LO
		 2 -> VIN_MSG.MID
		 3 -> VIN_MSG.HI
		 else -> throw Exception("Invalid raw value for VIN_MSG")
	}
	
	/** Sets VIN signal part **/
	fun set_vin_msg(f: CanFrame, p: VIN_MSG) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 6, 2, p.raw)
	}
	
	/** Gets VIN data **/
	fun get_vin_data() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A9, 8, 56)
	
	/** Sets VIN data **/
	fun set_vin_data(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 56, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.EZS_A9.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|VIN signal part: ${get_vin_msg()}
		|VIN data: ${get_vin_data()}
	""".trimMargin("|")
}
