
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MSS_A4 (ID 0x0248)
**/

object MSS_A4 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MSS_A4
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.MSS_A4)

	/** Gets SHD / power window run **/
	fun get_mod_alarm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSS_A4, 6, 1) != 0
	
	/** Sets SHD / power window run **/
	fun set_mod_alarm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets Direction of alarm activation **/
	fun get_ri_alarm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSS_A4, 5, 1) != 0
	
	/** Sets Direction of alarm activation **/
	fun set_ri_alarm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets SHD close **/
	fun get_shd_alarm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSS_A4, 4, 1) != 0
	
	/** Sets SHD close **/
	fun set_shd_alarm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets Close the front left window **/
	fun get_fvl_alarm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSS_A4, 3, 1) != 0
	
	/** Sets Close the front left window **/
	fun set_fvl_alarm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets Close the front right window **/
	fun get_fvr_alarm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSS_A4, 2, 1) != 0
	
	/** Sets Close the front right window **/
	fun set_fvr_alarm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Close the rear left window **/
	fun get_fhl_alarm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSS_A4, 1, 1) != 0
	
	/** Sets Close the rear left window **/
	fun set_fhl_alarm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets Close the rear right window **/
	fun get_fhr_alarm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSS_A4, 0, 1) != 0
	
	/** Sets Close the rear right window **/
	fun set_fhr_alarm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.MSS_A4.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|SHD / power window run: ${get_mod_alarm()}
		|Direction of alarm activation: ${get_ri_alarm()}
		|SHD close: ${get_shd_alarm()}
		|Close the front left window: ${get_fvl_alarm()}
		|Close the front right window: ${get_fvr_alarm()}
		|Close the rear left window: ${get_fhl_alarm()}
		|Close the rear right window: ${get_fhr_alarm()}
	""".trimMargin("|")
}
