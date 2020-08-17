
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for ARMADA_A1 (ID 0x0012)
**/

object ARMADA_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of ARMADA_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.ARMADA_A1)

	/** Gets SRS control lamp (workshop) **/
	fun get_srs_werk() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 7, 1) != 0
	
	/** Sets SRS control lamp (workshop) **/
	fun set_srs_werk(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets SRS control lamp (service) **/
	fun get_srs_serv() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 6, 1) != 0
	
	/** Sets SRS control lamp (service) **/
	fun set_srs_serv(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets SRS control lamps flash **/
	fun get_srs_blink() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 5, 1) != 0
	
	/** Sets SRS control lamps flash **/
	fun set_srs_blink(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets SRS control lamp **/
	fun get_srs_kl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 4, 1) != 0
	
	/** Sets SRS control lamp **/
	fun set_srs_kl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets AKSE lights are flashing **/
	fun get_akse_blink() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 1, 1) != 0
	
	/** Sets AKSE lights are flashing **/
	fun set_akse_blink(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on the AKSE lamp **/
	fun get_akse_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 0, 1) != 0
	
	/** Sets switch on the AKSE lamp **/
	fun set_akse_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets Child seat status **/
	fun get_kisi_st() : KISI_ST = when(CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 13, 3)) {
		 0 -> KISI_ST.NO_KISI
		 1 -> KISI_ST.KISI_V_ERK
		 2 -> KISI_ST.KISI_R_ERK
		 4 -> KISI_ST.KISI_FPOS
		 6 -> KISI_ST.KISI_FEHLER
		 7 -> KISI_ST.SNV
		 else -> throw Exception("Invalid raw value for KISI_ST")
	}
	
	/** Sets Child seat status **/
	fun set_kisi_st(f: CanFrame, p: KISI_ST) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 13, 3, p.raw)
	}
	
	/** Gets SBE class passenger **/
	fun get_sbe_bf() : SBE_BF = when(CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 21, 3)) {
		 0 -> SBE_BF.CLASS0
		 1 -> SBE_BF.CLASS_1
		 2 -> SBE_BF.CLASS2
		 3 -> SBE_BF.CLASS_3
		 4 -> SBE_BF.CLASS_4
		 5 -> SBE_BF.CLASS_5
		 6 -> SBE_BF.SBE_FEHLER
		 7 -> SBE_BF.SNV
		 else -> throw Exception("Invalid raw value for SBE_BF")
	}
	
	/** Sets SBE class passenger **/
	fun set_sbe_bf(f: CanFrame, p: SBE_BF) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 21, 3, p.raw)
	}
	
	/** Gets Passenger detection fast **/
	fun get_psg_detec_fast() : PSG_DETEC_FAST = when(CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 19, 2)) {
		 0 -> PSG_DETEC_FAST.SNA
		 1 -> PSG_DETEC_FAST.PSG_PRESENT
		 2 -> PSG_DETEC_FAST.FAULT
		 3 -> PSG_DETEC_FAST.PSG_ABSENT
		 else -> throw Exception("Invalid raw value for PSG_DETEC_FAST")
	}
	
	/** Sets Passenger detection fast **/
	fun set_psg_detec_fast(f: CanFrame, p: PSG_DETEC_FAST) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 19, 2, p.raw)
	}
	
	/** Gets seat belt buckle front passenger **/
	fun get_gs_bf() : GS_BF = when(CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 16, 2)) {
		 0 -> GS_BF.GS_OK
		 1 -> GS_BF.GS_NOK
		 2 -> GS_BF.GS_FEHLER
		 3 -> GS_BF.SNV
		 else -> throw Exception("Invalid raw value for GS_BF")
	}
	
	/** Sets seat belt buckle front passenger **/
	fun set_gs_bf(f: CanFrame, p: GS_BF) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 2, p.raw)
	}
	
	/** Gets SBE class driver **/
	fun get_sbe_f() : SBE_F = when(CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 29, 3)) {
		 0 -> SBE_F.CLASS0
		 1 -> SBE_F.CLASS_1
		 2 -> SBE_F.CLASS2
		 3 -> SBE_F.CLASS_3
		 4 -> SBE_F.CLASS_4
		 5 -> SBE_F.CLASS_5
		 6 -> SBE_F.SBE_FEHLER
		 7 -> SBE_F.SNV
		 else -> throw Exception("Invalid raw value for SBE_F")
	}
	
	/** Sets SBE class driver **/
	fun set_sbe_f(f: CanFrame, p: SBE_F) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 29, 3, p.raw)
	}
	
	/** Gets seat belt buckle driver **/
	fun get_gs_f() : GS_F = when(CanBusNative.getECUParameterB(CanBAddrs.ARMADA_A1, 24, 2)) {
		 0 -> GS_F.GS_OK
		 1 -> GS_F.GS_NOK
		 2 -> GS_F.GS_FEHLER
		 3 -> GS_F.SNV
		 else -> throw Exception("Invalid raw value for GS_F")
	}
	
	/** Sets seat belt buckle driver **/
	fun set_gs_f(f: CanFrame, p: GS_F) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 24, 2, p.raw)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.ARMADA_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|SRS control lamp (workshop): ${get_srs_werk()}
		|SRS control lamp (service): ${get_srs_serv()}
		|SRS control lamps flash: ${get_srs_blink()}
		|SRS control lamp: ${get_srs_kl()}
		|AKSE lights are flashing: ${get_akse_blink()}
		|switch on the AKSE lamp: ${get_akse_ein()}
		|Child seat status: ${get_kisi_st()}
		|SBE class passenger: ${get_sbe_bf()}
		|Passenger detection fast: ${get_psg_detec_fast()}
		|seat belt buckle front passenger: ${get_gs_bf()}
		|SBE class driver: ${get_sbe_f()}
		|seat belt buckle driver: ${get_gs_f()}
	""".trimMargin("|")
}
