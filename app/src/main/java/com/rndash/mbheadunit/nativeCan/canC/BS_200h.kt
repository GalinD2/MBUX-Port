
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for BS_200h (ID 0x0200)
**/

object BS_200h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of BS_200h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.BS_200h)

	/** Gets Brake pad wear indicator lamp **/
	fun get_bbv_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 7, 1) != 0
	
	/** Sets Brake pad wear indicator lamp **/
	fun set_bbv_kl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets ABS defective control lamp **/
	fun get_abs_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 5, 1) != 0
	
	/** Sets ABS defective control lamp **/
	fun set_abs_kl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets ESP defective control lamp **/
	fun get_esp_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 4, 1) != 0
	
	/** Sets ESP defective control lamp **/
	fun set_esp_kl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets ESP info lamp steady light **/
	fun get_esp_info_dl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 3, 1) != 0
	
	/** Sets ESP info lamp steady light **/
	fun set_esp_info_dl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets ESP info lamp flashing light **/
	fun get_esp_info_bl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 2, 1) != 0
	
	/** Sets ESP info lamp flashing light **/
	fun set_esp_info_bl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets BAS defective control lamp **/
	fun get_bas_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 1, 1) != 0
	
	/** Sets BAS defective control lamp **/
	fun set_bas_kl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets brake defective control lamp (EBV_KL at 463/461 / NCV2) **/
	fun get_bre_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 0, 1) != 0
	
	/** Sets brake defective control lamp (EBV_KL at 463/461 / NCV2) **/
	fun set_bre_kl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets brake light switch **/
	fun get_bls() : BLS = when(CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 14, 2)) {
		 0 -> BLS.BREMSE_NBET
		 1 -> BLS.BREMSE_BET
		 2 -> BLS.NOT_DEFINED
		 3 -> BLS.SNV
		 else -> throw Exception("Invalid raw value for BLS")
	}
	
	/** Sets brake light switch **/
	fun set_bls(f: CanFrame, p: BLS) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 14, 2, p.raw)
	}
	
	/** Gets message counter **/
	fun get_bz200h() : Int = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 10, 4)
	
	/** Sets message counter **/
	fun set_bz200h(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 10, 4, p)
	}
	
	/** Gets BLS Parity (even parity) **/
	fun get_bls_pa() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 9, 1) != 0
	
	/** Sets BLS Parity (even parity) **/
	fun set_bls_pa(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets brake light suppression (EBV_KL at 163 / T0 / T1N) **/
	fun get_bls_unt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 8, 1) != 0
	
	/** Sets brake light suppression (EBV_KL at 163 / T0 / T1N) **/
	fun set_bls_unt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets direction of rotation of front left wheel **/
	fun get_drtgvl() : DRTGVL = when(CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 16, 2)) {
		 0 -> DRTGVL.PASSIVE
		 1 -> DRTGVL.FORWARD
		 2 -> DRTGVL.REVERSE
		 3 -> DRTGVL.SNV
		 else -> throw Exception("Invalid raw value for DRTGVL")
	}
	
	/** Sets direction of rotation of front left wheel **/
	fun set_drtgvl(f: CanFrame, p: DRTGVL) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 2, p.raw)
	}
	
	/** Gets wheel speed front left **/
	fun get_dvl() : Int = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 18, 14)
	
	/** Sets wheel speed front left **/
	fun set_dvl(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 18, 14, p)
	}
	
	/** Gets direction of rotation of the front right wheel **/
	fun get_drtgvr() : DRTGVR = when(CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 32, 2)) {
		 0 -> DRTGVR.PASSIVE
		 1 -> DRTGVR.FORWARD
		 2 -> DRTGVR.REVERSE
		 3 -> DRTGVR.SNV
		 else -> throw Exception("Invalid raw value for DRTGVR")
	}
	
	/** Sets direction of rotation of the front right wheel **/
	fun set_drtgvr(f: CanFrame, p: DRTGVR) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 2, p.raw)
	}
	
	/** Gets wheel speed front right **/
	fun get_dvr() : Int = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 34, 14)
	
	/** Sets wheel speed front right **/
	fun set_dvr(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 34, 14, p)
	}
	
	/** Gets direction of rotation wheel left for cruise control **/
	fun get_drtgtm() : DRTGTM = when(CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 48, 2)) {
		 0 -> DRTGTM.PASSIVE
		 1 -> DRTGTM.FORWARD
		 2 -> DRTGTM.REVERSE
		 3 -> DRTGTM.SNV
		 else -> throw Exception("Invalid raw value for DRTGTM")
	}
	
	/** Sets direction of rotation wheel left for cruise control **/
	fun set_drtgtm(f: CanFrame, p: DRTGTM) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 48, 2, p.raw)
	}
	
	/** Gets Left wheel speed for cruise control **/
	fun get_tm_dl() : Int = CanBusNative.getECUParameterC(CanCAddrs.BS_200h, 50, 14)
	
	/** Sets Left wheel speed for cruise control **/
	fun set_tm_dl(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 50, 14, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.BS_200h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Brake pad wear indicator lamp: ${get_bbv_kl()}
		|ABS defective control lamp: ${get_abs_kl()}
		|ESP defective control lamp: ${get_esp_kl()}
		|ESP info lamp steady light: ${get_esp_info_dl()}
		|ESP info lamp flashing light: ${get_esp_info_bl()}
		|BAS defective control lamp: ${get_bas_kl()}
		|brake defective control lamp (EBV_KL at 463/461 / NCV2): ${get_bre_kl()}
		|brake light switch: ${get_bls()}
		|message counter: ${get_bz200h()}
		|BLS Parity (even parity): ${get_bls_pa()}
		|brake light suppression (EBV_KL at 163 / T0 / T1N): ${get_bls_unt()}
		|direction of rotation of front left wheel: ${get_drtgvl()}
		|wheel speed front left: ${get_dvl()}
		|direction of rotation of the front right wheel: ${get_drtgvr()}
		|wheel speed front right: ${get_dvr()}
		|direction of rotation wheel left for cruise control: ${get_drtgtm()}
		|Left wheel speed for cruise control: ${get_tm_dl()}
	""".trimMargin("|")
}
