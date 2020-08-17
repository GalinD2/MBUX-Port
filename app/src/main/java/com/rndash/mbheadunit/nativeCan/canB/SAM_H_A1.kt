
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for SAM_H_A1 (ID 0x0004)
**/

object SAM_H_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of SAM_H_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.SAM_H_A1)

	/** Gets front left door is open **/
	fun get_tvl_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 7, 1) != 0
	
	/** Sets front left door is open **/
	fun set_tvl_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets front right door is open **/
	fun get_tvr_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 6, 1) != 0
	
	/** Sets front right door is open **/
	fun set_tvr_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets rear left door is open **/
	fun get_thl_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 5, 1) != 0
	
	/** Sets rear left door is open **/
	fun set_thl_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets rear right door is open **/
	fun get_thr_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 4, 1) != 0
	
	/** Sets rear right door is open **/
	fun set_thr_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets trunk lid is open **/
	fun get_hd_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 3, 1) != 0
	
	/** Sets trunk lid is open **/
	fun set_hd_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets trunk lid contact pressed **/
	fun get_hdk_bet() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 2, 1) != 0
	
	/** Sets trunk lid contact pressed **/
	fun set_hdk_bet(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Terminal 54 hardware active **/
	fun get_kl54_rm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 1, 1) != 0
	
	/** Sets Terminal 54 hardware active **/
	fun set_kl54_rm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets Panic alarm is active **/
	fun get_pnk_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 0, 1) != 0
	
	/** Sets Panic alarm is active **/
	fun set_pnk_akt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets trunk lid pawl activated **/
	fun get_hd_sk_sam_h() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 15, 1) != 0
	
	/** Sets trunk lid pawl activated **/
	fun set_hd_sk_sam_h(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 15, 1, if(p) 1 else 0)
	}
	
	/** Gets rear lock in 90 ° position **/
	fun get_hschl_zu() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 14, 1) != 0
	
	/** Sets rear lock in 90 ° position **/
	fun set_hschl_zu(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 14, 1, if(p) 1 else 0)
	}
	
	/** Gets The rear lock is secured **/
	fun get_hschl_st_sich() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 13, 1) != 0
	
	/** Sets The rear lock is secured **/
	fun set_hschl_st_sich(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	}
	
	/** Gets heated rear window is switched on **/
	fun get_hhs_st_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 12, 1) != 0
	
	/** Sets heated rear window is switched on **/
	fun set_hhs_st_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets Heizb. Rear window is switched off due to under voltage. **/
	fun get_hhs_st_uspg() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 11, 1) != 0
	
	/** Sets Heizb. Rear window is switched off due to under voltage. **/
	fun set_hhs_st_uspg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets Height adjuster driver unlocked **/
	fun get_hvst_f_ent() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 10, 1) != 0
	
	/** Sets Height adjuster driver unlocked **/
	fun set_hvst_f_ent(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets passenger height adjuster unlocked **/
	fun get_hvst_bf_ent() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 9, 1) != 0
	
	/** Sets passenger height adjuster unlocked **/
	fun set_hvst_bf_ent(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets engine hood is open **/
	fun get_mot_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 8, 1) != 0
	
	/** Sets engine hood is open **/
	fun set_mot_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets EDW alarm triggered **/
	fun get_edw_alarm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 20, 1) != 0
	
	/** Sets EDW alarm triggered **/
	fun set_edw_alarm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 20, 1, if(p) 1 else 0)
	}
	
	/** Gets Activate EDW trailer monitoring **/
	fun get_edw_aag_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 19, 1) != 0
	
	/** Sets Activate EDW trailer monitoring **/
	fun set_edw_aag_akt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	}
	
	/** Gets Activate EDW interior protection **/
	fun get_edw_irs_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 18, 1) != 0
	
	/** Sets Activate EDW interior protection **/
	fun set_edw_irs_akt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets EDW sharpened **/
	fun get_edw_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 17, 1) != 0
	
	/** Sets EDW sharpened **/
	fun set_edw_akt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on EDW interior light **/
	fun get_edw_il_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 16, 1) != 0
	
	/** Sets Switch on EDW interior light **/
	fun set_edw_il_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	}
	
	/** Gets Terminal 54 error **/
	fun get_kl_54_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 31, 1) != 0
	
	/** Sets Terminal 54 error **/
	fun set_kl_54_def(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 31, 1, if(p) 1 else 0)
	}
	
	/** Gets 3rd brake light defective **/
	fun get_bl3_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 30, 1) != 0
	
	/** Sets 3rd brake light defective **/
	fun set_bl3_def(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 30, 1, if(p) 1 else 0)
	}
	
	/** Gets rear fog light defective **/
	fun get_nsl_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 29, 1) != 0
	
	/** Sets rear fog light defective **/
	fun set_nsl_def(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 29, 1, if(p) 1 else 0)
	}
	
	/** Gets Rear left turn signal defective **/
	fun get_bli_def_hl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 28, 1) != 0
	
	/** Sets Rear left turn signal defective **/
	fun set_bli_def_hl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 28, 1, if(p) 1 else 0)
	}
	
	/** Gets Left tail light defective **/
	fun get_sl_def_l() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 27, 1) != 0
	
	/** Sets Left tail light defective **/
	fun set_sl_def_l(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 27, 1, if(p) 1 else 0)
	}
	
	/** Gets Left brake light defective **/
	fun get_bl_def_l() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 26, 1) != 0
	
	/** Sets Left brake light defective **/
	fun set_bl_def_l(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 26, 1, if(p) 1 else 0)
	}
	
	/** Gets Left reversing light defective **/
	fun get_rfl_def_l() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 25, 1) != 0
	
	/** Sets Left reversing light defective **/
	fun set_rfl_def_l(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	}
	
	/** Gets Left license plate light defective **/
	fun get_kzl_def_l() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 24, 1) != 0
	
	/** Sets Left license plate light defective **/
	fun set_kzl_def_l(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/** Gets Sidemarker at the rear left defective **/
	fun get_sm_def_hl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 39, 1) != 0
	
	/** Sets Sidemarker at the rear left defective **/
	fun set_sm_def_hl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 39, 1, if(p) 1 else 0)
	}
	
	/** Gets Rear right side marker defective **/
	fun get_sm_def_hr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 38, 1) != 0
	
	/** Sets Rear right side marker defective **/
	fun set_sm_def_hr(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 38, 1, if(p) 1 else 0)
	}
	
	/** Gets Rear right turn signal defective **/
	fun get_bli_def_hr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 36, 1) != 0
	
	/** Sets Rear right turn signal defective **/
	fun set_bli_def_hr(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 36, 1, if(p) 1 else 0)
	}
	
	/** Gets Right tail light defective **/
	fun get_sl_def_r() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 35, 1) != 0
	
	/** Sets Right tail light defective **/
	fun set_sl_def_r(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 35, 1, if(p) 1 else 0)
	}
	
	/** Gets Right brake light defective **/
	fun get_bl_def_r() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 34, 1) != 0
	
	/** Sets Right brake light defective **/
	fun set_bl_def_r(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 34, 1, if(p) 1 else 0)
	}
	
	/** Gets Right reversing light defective **/
	fun get_rfl_def_r() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 33, 1) != 0
	
	/** Sets Right reversing light defective **/
	fun set_rfl_def_r(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 33, 1, if(p) 1 else 0)
	}
	
	/** Gets Right license plate light defective **/
	fun get_kzl_def_r() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 32, 1) != 0
	
	/** Sets Right license plate light defective **/
	fun set_kzl_def_r(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 1, if(p) 1 else 0)
	}
	
	/** Gets Spare light turn signal rear left active **/
	fun get_bli_ers_hl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 47, 1) != 0
	
	/** Sets Spare light turn signal rear left active **/
	fun set_bli_ers_hl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 47, 1, if(p) 1 else 0)
	}
	
	/** Gets Replacement light tail light rear left active **/
	fun get_sl_ers_hl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 46, 1) != 0
	
	/** Sets Replacement light tail light rear left active **/
	fun set_sl_ers_hl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 46, 1, if(p) 1 else 0)
	}
	
	/** Gets Spare light, turn signal, rear right active **/
	fun get_bli_ers_hr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 43, 1) != 0
	
	/** Sets Spare light, turn signal, rear right active **/
	fun set_bli_ers_hr(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 43, 1, if(p) 1 else 0)
	}
	
	/** Gets Replacement light tail light rear right active **/
	fun get_sl_ers_hr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 42, 1) != 0
	
	/** Sets Replacement light tail light rear right active **/
	fun set_sl_ers_hr(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 42, 1, if(p) 1 else 0)
	}
	
	/** Gets Replacement light rear fog lamp (s) active **/
	fun get_nsl_ers() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 40, 1) != 0
	
	/** Sets Replacement light rear fog lamp (s) active **/
	fun set_nsl_ers(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 40, 1, if(p) 1 else 0)
	}
	
	/** Gets Rear door button. close & secure pressed **/
	fun get_hd_sich_sam_h() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 53, 1) != 0
	
	/** Sets Rear door button. close & secure pressed **/
	fun set_hd_sich_sam_h(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 53, 1, if(p) 1 else 0)
	}
	
	/** Gets Rear door button. close pressed **/
	fun get_hd_schliess_sam_h() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 52, 1) != 0
	
	/** Sets Rear door button. close pressed **/
	fun set_hd_schliess_sam_h(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 52, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on the HFS search light **/
	fun get_hfs_sb_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 51, 1) != 0
	
	/** Sets Switch on the HFS search light **/
	fun set_hfs_sb_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 51, 1, if(p) 1 else 0)
	}
	
	/** Gets SRS control lamp (for G463) **/
	fun get_srs_kl_hw() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 50, 1) != 0
	
	/** Sets SRS control lamp (for G463) **/
	fun set_srs_kl_hw(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 50, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on Gurt-KL (for G463) **/
	fun get_gurt_kl_hw() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 49, 1) != 0
	
	/** Sets switch on Gurt-KL (for G463) **/
	fun set_gurt_kl_hw(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 49, 1, if(p) 1 else 0)
	}
	
	/** Gets rear wiper in intermittent operation **/
	fun get_hw_int_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_H_A1, 48, 1) != 0
	
	/** Sets rear wiper in intermittent operation **/
	fun set_hw_int_akt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 48, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.SAM_H_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|front left door is open: ${get_tvl_auf()}
		|front right door is open: ${get_tvr_auf()}
		|rear left door is open: ${get_thl_auf()}
		|rear right door is open: ${get_thr_auf()}
		|trunk lid is open: ${get_hd_auf()}
		|trunk lid contact pressed: ${get_hdk_bet()}
		|Terminal 54 hardware active: ${get_kl54_rm()}
		|Panic alarm is active: ${get_pnk_akt()}
		|trunk lid pawl activated: ${get_hd_sk_sam_h()}
		|rear lock in 90 ° position: ${get_hschl_zu()}
		|The rear lock is secured: ${get_hschl_st_sich()}
		|heated rear window is switched on: ${get_hhs_st_ein()}
		|Heizb. Rear window is switched off due to under voltage.: ${get_hhs_st_uspg()}
		|Height adjuster driver unlocked: ${get_hvst_f_ent()}
		|passenger height adjuster unlocked: ${get_hvst_bf_ent()}
		|engine hood is open: ${get_mot_auf()}
		|EDW alarm triggered: ${get_edw_alarm()}
		|Activate EDW trailer monitoring: ${get_edw_aag_akt()}
		|Activate EDW interior protection: ${get_edw_irs_akt()}
		|EDW sharpened: ${get_edw_akt()}
		|Switch on EDW interior light: ${get_edw_il_ein()}
		|Terminal 54 error: ${get_kl_54_def()}
		|3rd brake light defective: ${get_bl3_def()}
		|rear fog light defective: ${get_nsl_def()}
		|Rear left turn signal defective: ${get_bli_def_hl()}
		|Left tail light defective: ${get_sl_def_l()}
		|Left brake light defective: ${get_bl_def_l()}
		|Left reversing light defective: ${get_rfl_def_l()}
		|Left license plate light defective: ${get_kzl_def_l()}
		|Sidemarker at the rear left defective: ${get_sm_def_hl()}
		|Rear right side marker defective: ${get_sm_def_hr()}
		|Rear right turn signal defective: ${get_bli_def_hr()}
		|Right tail light defective: ${get_sl_def_r()}
		|Right brake light defective: ${get_bl_def_r()}
		|Right reversing light defective: ${get_rfl_def_r()}
		|Right license plate light defective: ${get_kzl_def_r()}
		|Spare light turn signal rear left active: ${get_bli_ers_hl()}
		|Replacement light tail light rear left active: ${get_sl_ers_hl()}
		|Spare light, turn signal, rear right active: ${get_bli_ers_hr()}
		|Replacement light tail light rear right active: ${get_sl_ers_hr()}
		|Replacement light rear fog lamp (s) active: ${get_nsl_ers()}
		|Rear door button. close & secure pressed: ${get_hd_sich_sam_h()}
		|Rear door button. close pressed: ${get_hd_schliess_sam_h()}
		|Switch on the HFS search light: ${get_hfs_sb_ein()}
		|SRS control lamp (for G463): ${get_srs_kl_hw()}
		|switch on Gurt-KL (for G463): ${get_gurt_kl_hw()}
		|rear wiper in intermittent operation: ${get_hw_int_akt()}
	""".trimMargin("|")
}
