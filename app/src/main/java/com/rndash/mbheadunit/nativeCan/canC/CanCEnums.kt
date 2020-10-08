
// Disable some inspections due to enum names/values not matching kotlin style
@file:Suppress("unused", "EnumEntryName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC

/**
 *   Generated by db_converter.py
 *   ECU Enum values for data on CAN C
**/

enum class BLS(val raw: Int) {
	 /** brake not applied **/
	 BREMSE_NBET(0),
	 /** brake applied **/
	 BREMSE_BET(1),
	 /** not defined **/
	 NOT_DEFINED(2), /* PROCESSING ERROR. Original Data: RAW: 2 - not defined */
	 /** signal not available **/
	 SNV(3),
}

enum class DRTGVL(val raw: Int) {
	 /** No direction of rotation detection **/
	 PASSIVE(0),
	 /** direction of rotation forward **/
	 FORWARD(1),
	 /** direction of rotation backwards **/
	 REVERSE(2),
	 /** signal not available **/
	 SNV(3),
}

enum class DRTGVR(val raw: Int) {
	 /** No direction of rotation detection **/
	 PASSIVE(0),
	 /** direction of rotation forward **/
	 FORWARD(1),
	 /** direction of rotation backwards **/
	 REVERSE(2),
	 /** signal not available **/
	 SNV(3),
}

enum class DRTGTM(val raw: Int) {
	 /** No direction of rotation detection **/
	 PASSIVE(0),
	 /** direction of rotation forward **/
	 FORWARD(1),
	 /** direction of rotation backwards **/
	 REVERSE(2),
	 /** signal not available **/
	 SNV(3),
}

enum class GMIN_ESP(val raw: Int) {
	 /** Passive value **/
	 PASSIVE(0),
	 /** target gear, lower limit = 1 **/
	 G1(1),
	 /** target gear, lower limit = 2 **/
	 G2(2),
	 /** target gear, lower limit = 3 **/
	 G3(3),
	 /** target gear, lower limit = 4 **/
	 G4(4),
	 /** target gear, lower limit = 5 **/
	 G5(5),
	 /** target gear, lower limit = 6 **/
	 G6(6),
	 /** target gear, lower limit = 7 **/
	 G7(7),
}

enum class GMAX_ESP(val raw: Int) {
	 /** Passive value **/
	 PASSIVE(0),
	 /** target gear, upper limit = 1 **/
	 G1(1),
	 /** target gear, upper limit = 2 **/
	 G2(2),
	 /** target gear, upper limit = 3 **/
	 G3(3),
	 /** target gear, upper limit = 4 **/
	 G4(4),
	 /** target gear, upper limit = 5 **/
	 G5(5),
	 /** target gear, upper limit = 6 **/
	 G6(6),
	 /** target gear, upper limit = 7 **/
	 G7(7),
}

enum class SLV_ESP(val raw: Int) {
	 /** switching characteristic "0" **/
	 SKL0(0),
	 /** switching characteristic "1" **/
	 SKL1(1),
	 /** switching characteristic "2" **/
	 SKL2(2),
	 /** switching characteristic "3" **/
	 SKL3(3),
	 /** switching characteristic "4" **/
	 SKL4(4),
	 /** switching characteristic "5" **/
	 SKL5(5),
	 /** switching characteristic "6" **/
	 SKL6(6),
	 /** switching characteristic "7" **/
	 SKL7(7),
	 /** switching characteristic "8" **/
	 SKL8(8),
	 /** switching characteristic "9" **/
	 SKL9(9),
	 /** switching characteristic "10" **/
	 SKL10(10),
}

enum class SZS(val raw: Int) {
	 /** system error or diagnosis **/
	 ERR_DIAG(0),
	 /** normal operation **/
	 NORM(1),
	 /** not defined **/
	 NOT_DEFINED(2), /* PROCESSING ERROR. Original Data: RAW: 2 - not defined */
	 /** Emissions test **/
	 EXHAUST(3),
}

enum class ANFN(val raw: Int) {
	 /** not defined **/
	 NOT_DEFINED(0), /* PROCESSING ERROR. Original Data: RAW: 0 - not defined */
	 /** "Neutral" request **/
	 ANF_N(1),
	 /** No requirement **/
	 IDLE(2),
	 /** signal not available **/
	 SNV(3),
}

enum class DRTGHR(val raw: Int) {
	 /** No direction of rotation detection **/
	 PASSIVE(0),
	 /** direction of rotation forward **/
	 FORWARD(1),
	 /** direction of rotation backwards **/
	 REVERSE(2),
	 /** signal not available **/
	 SNV(3),
}

enum class DRTGHL(val raw: Int) {
	 /** No direction of rotation detection **/
	 PASSIVE(0),
	 /** direction of rotation forward **/
	 FORWARD(1),
	 /** direction of rotation backwards **/
	 REVERSE(2),
	 /** signal not available **/
	 SNV(3),
}

enum class PRW_ST(val raw: Int) {
	 /** PRW active, no warning **/
	 ON(0),
	 /** PRW active, there is a warning **/
	 WARN(1),
	 /** PRW inactive or not available **/
	 OFF(2),
	 /** PRW is initialized **/
	 INIT(3),
	 /** not defined **/
	 NOT_DEFINED(4), /* PROCESSING ERROR. Original Data: RAW: 4 - not defined */
	 /** not defined **/
	 NOT_DEFINED_5(5), /* PROCESSING ERROR. Original Data: RAW: 5 - not defined */
	 /** PRW not available **/
	 PRW_NV(6),
	 /** signal not available **/
	 SNV(7),
}

enum class PRW_WARN(val raw: Int) {
	 /** no warning **/
	 OK(0),
	 /** tire pressure warning without position information **/
	 WARN_OHNE(1),
	 /** PRW not available **/
	 PRW_NV(2),
	 /** restart PRW **/
	 PRW_START(3),
	 /** tire pressure warning front left **/
	 WARN_VL(4),
	 /** tire pressure warning front right **/
	 WARN_VR(5),
	 /** rear left tire pressure warning **/
	 WARN_HL(6),
	 /** Rear right tire pressure warning **/
	 WARN_HR(7),
	 /** not defined **/
	 NOT_DEFINED(8), /* PROCESSING ERROR. Original Data: RAW: 8 - not defined */
	 /** undefined **/
	 UNDEFINED(14), /* PROCESSING ERROR. Original Data: RAW: 14 - undefined */
	 /** signal not available **/
	 SNV(15),
}

enum class SFB(val raw: Int) {
	 /** driver does not brake **/
	 BRAKE_NO(0),
	 /** driver brakes **/
	 BREMSE_YES(1),
	 /** not defined **/
	 NOT_DEFINED(2), /* PROCESSING ERROR. Original Data: RAW: 2 - not defined */
	 /** signal not available **/
	 SNV(3),
}

enum class T_Z(val raw: Int) {
	 /** not defined **/
	 NOT_DEFINED(0), /* PROCESSING ERROR. Original Data: RAW: 0 - not defined */
	 /** transmission cycle time 20 ms **/
	 T20_0(1),
	 /** transmission cycle time 23.1 ms **/
	 T23_1(2),
	 /** signal not available **/
	 SNV(3),
}

enum class ESP_DSPL(val raw: Int) {
	 /** No error **/
	 OK(0),
	 /** ESP defective **/
	 ESP_DEF(1),
	 /** ESP not available **/
	 ESP_OFF(2),
	 /** ESP not available, differential voltage. active (only 463 **/
	 ESP_OFF_DS(3),
	 /** BAS defective **/
	 BAS_DEF(4),
	 /** ABS defective (only 463 **/
	 ABS_DEF(5),
	 /** ABS not available (463 **/
	 ABS_OFF(6),
	 /** BKV defective (only 463 **/
	 BKV_DEF_GBV(7),
	 /** ABS, BAS u. ESP not available (only 463 **/
	 ALL_OFF_DS(8),
	 /** Stop & Roll defective **/
	 SBCS_DEF(9),
	 /** Stop & Roll on **/
	 SBCS_ON(10),
	 /** SBC Hold cannot be activated **/
	 SBCH_N_AKT(11),
	 /** BAS u. ESP defective **/
	 ESP_BAS_DEF(13),
	 /** SBC Hold off **/
	 SBCH_OFF(14),
	 /** SBC Hold **/
	 SBCH(15),
	 /** ABS, BAS u. ESP defective **/
	 ALL_DEF(16),
	 /** ABS, BAS, ESP u. BKV defective **/
	 ALL_DEF_GBV(17),
	 /** ABS, BAS u. ESP Diag. Check **/
	 ALL_DIAG(19),
	 /** ABS, BAS, ESP u. BKV Diag. Test **/
	 ALL_DIAG_GBV(20),
	 /** ABS, BAS u. ESP not available **/
	 ALL_OFF(22),
	 /** ABS, BAS, ESP u. BKV not available **/
	 ALL_OFF_GBV(23),
	 /** SBC stop **/
	 SBCS(24),
	 /** SBC stop off **/
	 SBCS_OFF(25),
	 /** Brake immediately! **/
	 BRAKE(26),
	 /** SBC stop cannot be activated **/
	 SBCS_N_AKT(27),
	 /** SBC Hold defective **/
	 SBCH_DEF(28),
	 /** SBC stop defective **/
	 SBCS_DEF_29(29),
	 /** Selector lever to P **/
	 GWH_P(30),
	 /** signal not available **/
	 SNV(31),
}

enum class SLV_MS(val raw: Int) {
	 /** switching characteristic "0" **/
	 SKL0(0),
	 /** switching characteristic "1" **/
	 SKL1(1),
	 /** switching characteristic "2" **/
	 SKL2(2),
	 /** switching characteristic "3" **/
	 SKL3(3),
	 /** switching characteristic "4" **/
	 SKL4(4),
	 /** switching characteristic "5" **/
	 SKL5(5),
	 /** switching characteristic "6" **/
	 SKL6(6),
	 /** switching characteristic "7" **/
	 SKL7(7),
	 /** switching characteristic "8" **/
	 SKL8(8),
	 /** switching characteristic "9" **/
	 SKL9(9),
	 /** switching characteristic "10" **/
	 SKL10(10),
}

enum class GMIN_MS(val raw: Int) {
	 /** Passive value **/
	 PASSIVE(0),
	 /** target gear, lower limit = 1 **/
	 G1(1),
	 /** target gear, lower limit = 2 **/
	 G2(2),
	 /** target gear, lower limit = 3 **/
	 G3(3),
	 /** target gear, lower limit = 4 **/
	 G4(4),
	 /** target gear, lower limit = 5 **/
	 G5(5),
	 /** target gear, lower limit = 6 **/
	 G6(6),
	 /** target gear, lower limit = 7 **/
	 G7(7),
}

enum class GMAX_MS(val raw: Int) {
	 /** Passive value **/
	 PASSIVE(0),
	 /** target gear, upper limit = 1 **/
	 G1(1),
	 /** target gear, upper limit = 2 **/
	 G2(2),
	 /** target gear, upper limit = 3 **/
	 G3(3),
	 /** target gear, upper limit = 4 **/
	 G4(4),
	 /** target gear, upper limit = 5 **/
	 G5(5),
	 /** target gear, upper limit = 6 **/
	 G6(6),
	 /** target gear, upper limit = 7 **/
	 G7(7),
}

enum class HZL_ST(val raw: Int) {
	 /** Heater shut-off valve is closed **/
	 HEATER_SHUT_OFF_VALVE_IS_CLOSED(0), /* PROCESSING ERROR. Original Data: RAW: 0 - Heater shut-off valve is closed */
	 /** Heater shut-off valve is on **/
	 OPEN(1),
	 /** Heating shut-off valve is clocked **/
	 TAKT(2),
	 /** signal not available **/
	 SNV(3),
}

enum class FSC_IST(val raw: Int) {
	 /** Blank ("") **/
	 BLANK(32),
	 /** speed step "1" **/
	 ONE(49),
	 /** speed step "2" **/
	 TWO(50),
	 /** speed step "3" **/
	 THREE(51),
	 /** speed step "4" **/
	 FOUR(52),
	 /** speed step "5" **/
	 FUENF(53),
	 /** speed step "6" **/
	 SIX(54),
	 /** speed step "7" **/
	 SEVEN(55),
	 /** speed level "A" **/
	 A(65),
	 /** speed step "D" **/
	 D(68),
	 /** "F" **/
	 F_ERROR_MARK(70),
	 /** speed step "N" **/
	 N(78),
	 /** speed step "P" **/
	 P(80),
	 /** speed step "R" **/
	 R(82),
	 /** Passive value **/
	 SNV(255),
}

enum class FSC_SOLL(val raw: Int) {
	 /** "upshift" **/
	 UP(1),
	 /** "Downshift" **/
	 DOWN(2),
	 /** Blank ("") **/
	 PAS(32),
	 /** speed step "1" **/
	 ONE(49),
	 /** speed step "2" **/
	 TWO(50),
	 /** speed step "3" **/
	 THREE(51),
	 /** speed step "4" **/
	 FOUR(52),
	 /** speed step "5" **/
	 FUENF(53),
	 /** speed step "6" **/
	 SIX(54),
	 /** speed step "7" **/
	 SEVEN(55),
	 /** speed level "A" **/
	 A(65),
	 /** speed step "D" **/
	 D(68),
	 /** "F" **/
	 F_ERROR_MARK(70),
	 /** speed step "N" **/
	 N(78),
	 /** speed step "P" **/
	 P(80),
	 /** speed step "R" **/
	 R(82),
	 /** Passive value **/
	 SNV(255),
}

enum class FCOD_BR(val raw: Int) {
	 /** BR 221 or BR 140 **/
	 BR221(0),
	 /** BR 129 **/
	 BR129(1),
	 /** BR 210 or BR 212 **/
	 BR210(2),
	 /** BR 202 or BR 204 **/
	 BR202(3),
	 /** BR 220 **/
	 BR220(4),
	 /** BR 170 **/
	 BR170(5),
	 /** BR 203 **/
	 BR203(6),
	 /** BR 168 **/
	 BR168(7),
	 /** BR 163 **/
	 BR163(8),
	 /** BR 208 **/
	 BR208(9),
	 /** BR 463 **/
	 BR463(10),
	 /** BR 215 **/
	 BR215(11),
	 /** BR 230 **/
	 BR230(12),
	 /** BR 211 **/
	 BR211(13),
	 /** BR 209 **/
	 BR209(14),
	 /** BR 461 **/
	 BR461(15),
	 /** BR 240 **/
	 BR240(16),
	 /** BR 251 **/
	 BR251(17),
	 /** BR 171 **/
	 BR171(18),
	 /** BR 164 **/
	 BR164(19),
	 /** BR 169 or BR 245 **/
	 BR169(20),
	 /** BR 199 **/
	 BR199(21),
	 /** BR 216 **/
	 BR216(22),
	 /** BR 219 **/
	 BR219(23),
	 /** BR 454 (z-car) **/
	 BR454(24),
	 /** NCV2 **/
	 NCV2(25),
	 /** V-Class **/
	 VITO(26),
	 /** Sprinter **/
	 SPRINTER(27),
	 /** NCV3 **/
	 NCV3(28),
	 /** NCV1 **/
	 NCV1(29),
	 /** all other BR **/
	 REST(30),
	 /** code does not exist **/
	 SNV(31),
}

enum class FCOD_KAR(val raw: Int) {
	 /** W **/
	 W(0),
	 /** V **/
	 V(1),
	 /** C **/
	 C(2),
	 /** S **/
	 S(3),
	 /** A **/
	 A(4),
	 /** R **/
	 R(5),
	 /** SS **/
	 SS(6),
	 /** code does not exist **/
	 SNV(7),
}

enum class FCOD_MOT(val raw: Int) {
	 /** M272 E35 **/
	 M272E35(0),
	 /** M271 E18 ML red. (105 kW) **/
	 M271E18ML105(1),
	 /** M271 E18 ML (120 kW) **/
	 M271E18ML120(2),
	 /** M112 E37 **/
	 M112E37(3),
	 /** M272 E25 **/
	 M272E25(4),
	 /** M272 E30 **/
	 M272E30(5),
	 /** M112 E28 **/
	 M112E28(7),
	 /** M112 E32 **/
	 M112E32(8),
	 /** M273 E46 **/
	 M273E46(10),
	 /** M273 E55 **/
	 M273E55(11),
	 /** M112 E26 **/
	 M112E26(12),
	 /** M113 E43 **/
	 M113E43(13),
	 /** M113 E50 **/
	 M113E50(14),
	 /** M271 E18 ML **/
	 M271E18ML140(18),
	 /** M271 DE18 ML red. (105 kW) **/
	 M271DE18ML105(19),
	 /** M271 DE18 ML (125 kW) **/
	 M271DE18ML125(20),
	 /** M111E E23 ML **/
	 M111E_E23ML(22),
	 /** M111E E20 **/
	 M111E_E20(23),
	 /** M111E E20 ML **/
	 M111E_E20ML(24),
	 /** M112 E32 red. (140 kW) **/
	 M112E32_140(25),
	 /** M266 E20 ATL **/
	 M266E20ATL(26),
	 /** M266 E15 **/
	 M266E15(27),
	 /** M266 E17 **/
	 M266E17(28),
	 /** M266 E20 **/
	 M266E20(29),
	 /** M275 E55 or M285 E55 **/
	 M275E55(30),
	 /** M137 E58 **/
	 M137E58(31),
	 /** OM 640 DE20 LA (60 kW) **/
	 OM640DE20LA60(32),
	 /** OM 640 DE20 LA (80 kW) **/
	 OM640DE20LA80(34),
	 /** OM642 DE30 LA (155 **/
	 OM642DE30LA160(35),
	 /** OM 640 DE20 LA (100 kW) **/
	 OM640DE20LA100(36),
	 /** OM613 DE32 LA or OM648 DE32 LA **/
	 OM613DE32LA(37),
	 /** OM628 DE40 LA **/
	 OM628DE40LA(39),
	 /** OM642 DE30 LA (140 kW) **/
	 OM642DE30LA140(40),
	 /** OM612 DE27 LA or OM647 DE27 LA (120 **/
	 OM612DE27LA(43),
	 /** OM611 DE22 LA (105 **/
	 OM611DE22LA100(44),
	 /** OM611 DE22 LA (85 kW) or OM646 DE22 LA (90 kW) **/
	 OM611DE22LA85(45),
	 /** OM611 DE22 LA (75 kW) or OM646 DE22 LA (75 kW) **/
	 OM611DE22LA75(46),
	 /** M134 E11 (3A91) **/
	 M134E11(64),
	 /** M135 E13 (4A90) **/
	 M135E13(65),
	 /** M135 E15 (4A91) **/
	 M135E15(66),
	 /** M135 E15 ATL **/
	 M135E15ATL(67),
	 /** M272 DE25 **/
	 M272DE25(68),
	 /** M272 DE30 **/
	 M272DE30(69),
	 /** M272 DE35 **/
	 M272DE35(70),
	 /** M273 DE46 **/
	 M273DE46(71),
	 /** M273 DE55 **/
	 M273DE55(72),
	 /** M271 E18 ML Attr. (115kW) **/
	 M271E18MLATTR115(79),
	 /** M271 E18 ML Attr. (141kW) **/
	 M271E18MLATTR141(80),
	 /** OM629 DE40 LA **/
	 OM629DE40LA(96),
	 /** OM642 DE30 LA red. (140kW) **/
	 OM642DE30LARED140(99),
}

enum class PFW(val raw: Int) {
	 /** No warning **/
	 OK(0),
	 /** Warning filter closed, level 1 **/
	 PFW1(1),
	 /** Warning filter closed, level 2 **/
	 PFW2(2),
	 /** signal not available **/
	 SNV(3),
}

enum class GIC(val raw: Int) {
	 /** actual gear "N" **/
	 N(0),
	 /** actual gear "1" **/
	 D1(1),
	 /** actual gear "2" **/
	 D2(2),
	 /** actual gear "3" **/
	 D3(3),
	 /** actual gear "4" **/
	 D4(4),
	 /** actual gear "5" **/
	 D5(5),
	 /** actual gear "6" **/
	 D6(6),
	 /** actual gear "7" **/
	 D7(7),
	 /** actual gear "continuously forward **/
	 D_CVT(8),
	 /** actual gear "continuously backwards" **/
	 R_CVT(9),
	 /** actual gear "R3" **/
	 R3(10),
	 /** Actual gear "R" **/
	 R(11),
	 /** actual gear "R2" **/
	 R2(12),
	 /** actual gear "P" **/
	 P(13),
	 /** No Force **/
	 NO_FORCE(14),
	 /** signal not available **/
	 SNV(15),
}

enum class GZC(val raw: Int) {
	 /** target gear "N" **/
	 N(0),
	 /** target gear "1" **/
	 D1(1),
	 /** target gear "2" **/
	 D2(2),
	 /** target gear "3" **/
	 D3(3),
	 /** target gear "4" **/
	 D4(4),
	 /** target gear "5" **/
	 D5(5),
	 /** target gear "6" **/
	 D6(6),
	 /** target gear "7" **/
	 D7(7),
	 /** target gear "stepless forward **/
	 D_CVT(8),
	 /** target gear "continuously backwards" **/
	 R_CVT(9),
	 /** target gear "R3" **/
	 R3(10),
	 /** Target gear "R" **/
	 R(11),
	 /** target gear "R2" **/
	 R2(12),
	 /** Target gear "P" **/
	 P(13),
	 /** circuit termination **/
	 CANCEL(14),
	 /** signal not available **/
	 SNV(15),
}

enum class FPC_AAD(val raw: Int) {
	 /** Sport (default) **/
	 SPORT(0),
	 /** COMFORT **/
	 COMFORT(1),
	 /** not defined **/
	 NOT_DEFINED(2), /* PROCESSING ERROR. Original Data: RAW: 2 - not defined */
	 /** signal not available **/
	 SNV(3),
}

enum class FEHLPRF_ST(val raw: Int) {
	 /** error check not yet run through completely **/
	 WAIT(0),
	 /** error check run through completely, result i. O. **/
	 OK(1),
	 /** Error detected, enter current environment data **/
	 ERROR(2),
	 /** not defined **/
	 NOT_DEFINED(3), /* PROCESSING ERROR. Original Data: RAW: 3 - not defined */
}

enum class FSC(val raw: Int) {
	 /** Blank ("") **/
	 BLANK(32),
	 /** speed step "1" **/
	 ONE(49),
	 /** speed step "2" **/
	 TWO(50),
	 /** speed step "3" **/
	 THREE(51),
	 /** speed step "4" **/
	 FOUR(52),
	 /** speed step "5" **/
	 FUENF(53),
	 /** speed step "6" **/
	 SIX(54),
	 /** speed step "7" **/
	 SEVEN(55),
	 /** speed level "A" **/
	 A(65),
	 /** speed step "D" **/
	 D(68),
	 /** "F" **/
	 F_ERROR_MARK(70),
	 /** speed step "N" **/
	 N(78),
	 /** speed step "P" **/
	 P(80),
	 /** speed step "R" **/
	 R(82),
	 /** Passive value **/
	 SNV(255),
}

enum class FPC(val raw: Int) {
	 /** "C", message "gear, actuate parking brake!" with warning tone **/
	 C_MGFB_WT(2),
	 /** "C", message "Shift gear, shift lever to N!" **/
	 C_MGSNN(3),
	 /** "C", message "gear, apply brake!" **/
	 C_MGBB(4),
	 /** "C", message "Transmission, request gear again!" **/
	 C_MGGEA(6),
	 /** "C", message "Gear, insert N to start!" **/
	 C_MGZSN(7),
	 /** "A", message "Activate gear, parking brake!" with warning tone **/
	 A_MGFB_WT(10),
	 /** "A", message "Shift gear, shift lever to N!" **/
	 A_MGSNN(11),
	 /** "A", message "gear, apply brake!" **/
	 A_MGBB(12),
	 /** "A", message "Request transmission, gear again!" **/
	 A_MGGEA(14),
	 /** "A", message "Gear, insert N to start!" **/
	 A_MGZSN(15),
	 /** "S", message "Activate gear, parking brake!" with warning tone **/
	 S_MGFB_WT(18),
	 /** "S", message "Shift gear, shift lever to N!" **/
	 S_MGSNN(19),
	 /** "S", message "gear, apply brake!" **/
	 S_MGBB(20),
	 /** "S", message "Request gear, gear again!" **/
	 S_MGGEA(22),
	 /** "S", message "Gear, insert N to start!" **/
	 S_MGZSN(23),
	 /** shift recommendation "upshift" **/
	 UP(24),
	 /** Shift recommendation "Downshift" **/
	 DOWN(25),
	 /** "" (blank) **/
	 BLANK(32),
	 /** "" (blank), message "Gear, insert N!" **/
	 BLANK_MGN(64),
	 /** "A" **/
	 A(65),
	 /** "C" **/
	 C(67),
	 /** "F" **/
	 F_ERROR_MARK(70),
	 /** "M" **/
	 M(77),
	 /** "S" **/
	 S(83),
	 /** "W" **/
	 W(87),
	 /** "_" (Underscore) **/
	 UNDERSCORE(95),
	 /** "" (blank), message "Gearbox, visit workshop!" **/
	 BLANK_MGW(96),
	 /** "A", message "Gear, insert N!" **/
	 A_MGN(97),
	 /** "C", message "Gear, insert N!" **/
	 C_MGN(99),
	 /** "M", message "Gear, insert N!" **/
	 M_MGN(109),
	 /** "S", message "Gear, insert N!" **/
	 S_MGN(115),
	 /** "W", message "Gear, insert N!" **/
	 W_MGN(119),
	 /** "_" (Underscore), message "Gear, insert N!" **/
	 __MGN(127),
	 /** "A", message "Gearbox, visit workshop!" **/
	 A_MGW(129),
	 /** "C", message "Gearbox, visit workshop!" **/
	 C_MGW(131),
	 /** Error marking "F", message "Gearbox, visit workshop!" **/
	 F_MGW(134),
	 /** "M", message "Gearbox, visit workshop!" **/
	 M_MGW(141),
	 /** "S", message "Gearbox, visit workshop!" **/
	 S_MGW(147),
	 /** "W", message "Gearbox, visit workshop!" **/
	 W_MGW(151),
	 /** "_" (Underscore), message "Gearbox, go to the workshop!" **/
	 __MGW(159),
	 /** Passive value **/
	 SNV(255),
}

enum class MECH(val raw: Int) {
	 /** NAG, Large Gear **/
	 LARGE(0),
	 /** NAG, Small Gear **/
	 SMALL(1),
	 /** NAG2, Large Gear **/
	 GROSS2(2),
	 /** NAG2, Small Gear **/
	 KLEIN2(3),
}

enum class WHST(val raw: Int) {
	 /** Gear selector lever in position "P" **/
	 P(0),
	 /** Gear selector lever in position "R" **/
	 R(1),
	 /** Gear selector lever in position "N" **/
	 N(2),
	 /** Gear selector lever in position "D" **/
	 D(4),
	 /** signal not available **/
	 SNV(7),
}

enum class WHC(val raw: Int) {
	 /** Selector lever in position "D" **/
	 D(5),
	 /** Selector lever in position "N" **/
	 N(6),
	 /** Selector lever in position "R" **/
	 R(7),
	 /** Selector lever in position "P" **/
	 P(8),
	 /** Selector lever in position "+" **/
	 PLUS(9),
	 /** Selector lever in position "-" **/
	 MINUS(10),
	 /** Selector lever in intermediate position "N-D" **/
	 N_ZW_D(11),
	 /** Selector lever in intermediate position "R-N" **/
	 R_ZW_N(12),
	 /** Selector lever in intermediate position "P-R" **/
	 P_ZW_R(13),
	 /** Selector lever position implausible **/
	 SNV(15),
}

enum class LL_RLC(val raw: Int) {
	 /** not defined **/
	 NOT_DEFINED(0), /* PROCESSING ERROR. Original Data: RAW: 0 - not defined */
	 /** left hand drive **/
	 LL(1),
	 /** right hand drive **/
	 RL(2),
	 /** code does not exist **/
	 SNV(3),
}

enum class ESP_BET(val raw: Int) {
	 /** Not pressed (rocker and push push) **/
	 NBET(0),
	 /** ESP off actuated (rocker), actuated (Push Push) **/
	 AUS_BET(1),
	 /** ESP on actuated (rocker), not defined (push push) **/
	 EIN_NDEF(2),
	 /** signal not available (rocker and push push) **/
	 SNV(3),
}

enum class ART_ABW_BET(val raw: Int) {
	 /** not defined (rocker), not actuated (push push) **/
	 NDEF_NBET(0),
	 /** Distance warning off (rocker), not defined (Push Push) **/
	 AUS_NDEF(1),
	 /** Distance warning on (rocker), activated (Push Push) **/
	 ON_BET(2),
	 /** signal not available (rocker and push push) **/
	 SNV(3),
}

enum class ST3_BET(val raw: Int) {
	 /** Not pressed (rocker and push push) **/
	 NBET(0),
	 /** Pressed down (rocker), not defined (Push Push) **/
	 UNBET_NDEF(1),
	 /** Pressed at the top (rocker), pressed (Push Push) **/
	 OBBET_BET(2),
	 /** Not defined (rocker and push push) **/
	 NOT_DEFINED_ROCKER_AND_PUSH_PUSH(3), /* PROCESSING ERROR. Original Data: RAW: 3 - Not defined (rocker and push push) */
}

enum class ST2_BET(val raw: Int) {
	 /** Not pressed (rocker and push push) **/
	 NBET(0),
	 /** Pressed down (rocker), not defined (Push Push) **/
	 UNBET_NDEF(1),
	 /** Pressed at the top (rocker), pressed (Push Push) **/
	 OBBET_BET(2),
	 /** Not defined (rocker and push push) **/
	 NOT_DEFINED_ROCKER_AND_PUSH_PUSH(3), /* PROCESSING ERROR. Original Data: RAW: 3 - Not defined (rocker and push push) */
}

enum class LDC(val raw: Int) {
	 /** rest of the world **/
	 RDW(0),
	 /** USA **/
	 USA_CAN(1),
	 /** not defined **/
	 NOT_DEFINED(2), /* PROCESSING ERROR. Original Data: RAW: 2 - not defined */
	 /** code does not exist **/
	 SNV(3),
}

enum class FZGVERSN(val raw: Int) {
	 /** Status when the respective series **/
	 START_WAS_LAUNCHED(0),
	 /** BR 220: AJ 99 **/
	 V1(1),
	 /** BR 220: AJ 01 **/
	 V2(2),
	 /** BR 220: ÄJ 02 **/
	 V3(3),
	 /** BR 220: prohibited, C215 **/
	 V4(4),
	 /** BR 220: prohibited, C215 **/
	 V5(5),
	 /** BR 220: ÄJ 03 **/
	 V6(6),
	 /** BR 220 **/
	 V7(7),
}

enum class ANH_ERK2(val raw: Int) {
	 /** Trailer not recognized **/
	 NONE(0),
	 /** trailer recognized **/
	 OK(1),
	 /** not defined **/
	 NOT_DEFINED(2), /* PROCESSING ERROR. Original Data: RAW: 2 - not defined */
	 /** signal not available **/
	 SNV(3),
}

enum class VIN_MSG(val raw: Int) {
	 /** not defined **/
	 N_DEF(0),
	 /** VIN characters 1 **/
	 LO(1),
	 /** VIN characters 8 **/
	 MID(2),
	 /** VIN characters 15 **/
	 HI(3),
}

enum class WRC(val raw: Int) {
	 /** unlimited **/
	 UBG(0),
	 /** 210 km **/
	 BG210(1),
	 /** 190 km **/
	 BG190(2),
	 /** 160 km **/
	 BG160(3),
	 /** 240 km **/
	 BG240(4),
	 /** 230 km **/
	 BG230(5),
	 /** 220 km **/
	 BG220(6),
	 /** 200 km **/
	 BG200(7),
	 /** 180 km **/
	 BG180(128),
	 /** 170 km **/
	 BG170(129),
	 /** 150 km **/
	 BG150(130),
	 /** 140 km **/
	 BG140(131),
	 /** 130 km **/
	 BG130(132),
	 /** 120 km **/
	 BG120(133),
	 /** 110 km **/
	 BG110(134),
	 /** 100 km **/
	 BG100(135),
}

enum class IST_ABST(val raw: Int) {
	 /** Very Small **/
	 VERY_SMALL(0),
	 /** Small **/
	 SMALL(1),
	 /** Medium **/
	 MEDIUM(2),
	 /** Large **/
	 LARGE(3),
	 /** Very Large **/
	 VERY_LARGE(4),
	 /** not defined **/
	 NOT_DEFINED(5), /* PROCESSING ERROR. Original Data: RAW: 5 - not defined */
	 /** not defined **/
	 NOT_DEFINED_6(6), /* PROCESSING ERROR. Original Data: RAW: 6 - not defined */
	 /** not defined **/
	 NOT_DEFINED_7(7), /* PROCESSING ERROR. Original Data: RAW: 7 - not defined */
}

enum class DRTGANZ(val raw: Int) {
	 /** No direction of rotation detection **/
	 PASSIVE(0),
	 /** direction of rotation forward **/
	 FORWARD(1),
	 /** direction of rotation backwards **/
	 REVERSE(2),
	 /** signal not available **/
	 SNV(3),
}

enum class PRW_ANF(val raw: Int) {
	 /** No change **/
	 IDLE(0),
	 /** switch PRW off **/
	 OFF(1),
	 /** Activate PRW again **/
	 ON(2),
	 /** signal not available **/
	 SNV(3),
}

enum class LRWS_ST(val raw: Int) {
	 /** steering wheel angle sensor ok **/
	 OK(0),
	 /** Steering wheel angle sensor not initialized **/
	 INI(1),
	 /** steering wheel angle sensor faulty **/
	 ERR(2),
	 /** steering wheel angle sensor faulty and not initialized **/
	 ERR_INI(3),
}

enum class LRWS_ID(val raw: Int) {
	 /** LRW sensor can be initialized **/
	 INIT_PSBL(0),
	 /** LRW sensor initializes itself **/
	 INIT_SELF(1),
	 /** (LRW sensor must be initialized) **/
	 INIT_MUST(2),
	 /** signal not available **/
	 SNV(3),
}

enum class ASS_DSPL(val raw: Int) {
	 /** No status **/
	 IDLE(0),
	 /** message "ASS not active: motor warm-up" **/
	 M1(1),
	 /** message "ASS active: driving mode" **/
	 M2(2),
	 /** message "ASS active: stop mode" **/
	 M3(3),
	 /** Message "ASS not active: electrical energy demand" **/
	 M4(4),
	 /** Message "ASS not active: air conditioning on" **/
	 M5(5),
	 /** Message "ASS not active: fault" **/
	 M6(6),
	 /** Message "ASS active: electrical energy demand, please start the engine" **/
	 M7(7),
	 /** Message "ASS active: Use the clutch to start" **/
	 M8(8),
	 /** Message "ASS active: Air conditioning? Please start the engine" **/
	 M9(9),
	 /** Message "ASS active: Ignition off when leaving!" **/
	 M10(10),
	 /** message "ASS deactivated" **/
	 M11(11),
	 /** Message "ASS activated" **/
	 M12(12),
	 /** Message "ASS: Display defective" **/
	 M13(13),
	 /** not defined **/
	 M14(14),
	 /** undefined **/
	 M15(15),
}

enum class ASS_WARN(val raw: Int) {
	 /** No status **/
	 IDLE(0),
	 /** message "ASS not active: motor warm-up" **/
	 M1(1),
	 /** message "ASS active: driving mode" **/
	 M2(2),
	 /** message "ASS active: stop mode" **/
	 M3(3),
	 /** Message "ASS not active: electrical energy demand" **/
	 M4(4),
	 /** Message "ASS not active: air conditioning on" **/
	 M5(5),
	 /** Message "ASS not active: fault" **/
	 M6(6),
	 /** Message "ASS active: electrical energy demand, please start the engine" **/
	 M7(7),
	 /** Message "ASS active: Use the clutch to start" **/
	 M8(8),
	 /** Message "ASS active: Air conditioning? Please start the engine" **/
	 M9(9),
	 /** Message "ASS active: Ignition off when leaving!" **/
	 M10(10),
	 /** message "ASS deactivated" **/
	 M11(11),
	 /** Message "ASS activated" **/
	 M12(12),
	 /** Message "ASS: Display defective" **/
	 M13(13),
	 /** not defined **/
	 M14(14),
	 /** undefined **/
	 M15(15),
}

enum class LRT_PM3(val raw: Int) {
	 /** Not actuated **/
	 NBET(0),
	 /** "+" pressed **/
	 PLUS(1),
	 /** "-" pressed **/
	 MINUS(2),
	 /** "+" and "-" pressed **/
	 PLUS_MINUS(3),
	 /** not defined **/
	 NOT_DEFINED(4), /* PROCESSING ERROR. Original Data: RAW: 4 - not defined */
	 /** not defined **/
	 NOT_DEFINED_5(5), /* PROCESSING ERROR. Original Data: RAW: 5 - not defined */
	 /** not defined **/
	 NOT_DEFINED_6(6), /* PROCESSING ERROR. Original Data: RAW: 6 - not defined */
	 /** signal not available **/
	 SNV(7),
}

enum class SID_SBW(val raw: Int) {
	 /** EWM **/
	 EWM(0),
	 /** MRM **/
	 MRM(1),
	 /** not defined **/
	 NOT_DEFINED(2), /* PROCESSING ERROR. Original Data: RAW: 2 - not defined */
	 /** not defined **/
	 NOT_DEFINED_3(3), /* PROCESSING ERROR. Original Data: RAW: 3 - not defined */
}

enum class SBWB_ST_RND(val raw: Int) {
	 /** SBW control element in rest position **/
	 IDLE(0),
	 /** SBW control element in "R" **/
	 R(1),
	 /** SBW control element in "N above" **/
	 N_OBEN(2),
	 /** SBW control element in "N down" **/
	 N_UNTEN(4),
	 /** SBW control element in initialization **/
	 INIT(6),
	 /** SBW control element in "D" **/
	 D(8),
	 /** signal not available **/
	 SNV(15),
}

enum class SBWB_ST_P(val raw: Int) {
	 /** P button in rest position **/
	 IDLE(0),
	 /** P button in "P" position **/
	 P(1),
	 /** P button initialization **/
	 INIT(2),
	 /** signal not available **/
	 SNV(3),
}

enum class SBWB_ID(val raw: Int) {
	 /** GWHST_LR valid on bit 0..7 (old signal) **/
	 GWHST_LR(0),
	 /** Reserved old signal "ERROR MRSM" **/
	 RES_ALT_FEHLER(2),
	 /** SBWB_ST P, RND valid on bit 0..5 (new signals) **/
	 SBWB_ST_P_RND(3),
}

enum class SLV_ART(val raw: Int) {
	 /** switching characteristic "0" **/
	 SKL0(0),
	 /** switching characteristic "1" **/
	 SKL1(1),
	 /** switching characteristic "2" **/
	 SKL2(2),
	 /** switching characteristic "3" **/
	 SKL3(3),
	 /** switching characteristic "4" **/
	 SKL4(4),
	 /** switching characteristic "5" **/
	 SKL5(5),
	 /** switching characteristic "6" **/
	 SKL6(6),
	 /** switching characteristic "7" **/
	 SKL7(7),
	 /** switching characteristic "8" **/
	 SKL8(8),
	 /** switching characteristic "9" **/
	 SKL9(9),
	 /** switching characteristic "10" **/
	 SKL10(10),
}

enum class GMIN_ART(val raw: Int) {
	 /** Passive value **/
	 PASSIVE(0),
	 /** target gear, lower limit = 1 **/
	 G1(1),
	 /** target gear, lower limit = 2 **/
	 G2(2),
	 /** target gear, lower limit = 3 **/
	 G3(3),
	 /** target gear, lower limit = 4 **/
	 G4(4),
	 /** target gear, lower limit = 5 **/
	 G5(5),
	 /** target gear, lower limit = 6 **/
	 G6(6),
	 /** target gear, lower limit = 7 **/
	 G7(7),
}

enum class GMAX_ART(val raw: Int) {
	 /** Passive value **/
	 PASSIVE(0),
	 /** target gear, upper limit = 1 **/
	 G1(1),
	 /** target gear, upper limit = 2 **/
	 G2(2),
	 /** target gear, upper limit = 3 **/
	 G3(3),
	 /** target gear, upper limit = 4 **/
	 G4(4),
	 /** target gear, upper limit = 5 **/
	 G5(5),
	 /** target gear, upper limit = 6 **/
	 G6(6),
	 /** target gear, upper limit = 7 **/
	 G7(7),
}

enum class ART_ERR(val raw: Int) {
	 /** No error present **/
	 OK(0),
	 /** ART disorder; Sensor dirty **/
	 DIRT(1),
	 /** ART defective **/
	 ART_DEF(2),
	 /** ART **/
	 ART_LIM_DEF(3),
	 /** ART; external fault **/
	 EXT(4),
	 /** DBC defective **/
	 DBC_DEF(5),
	 /** ART disorder; Sensor dirty and DBC defective **/
	 SCHMUTZ_DBC_DEF(6),
	 /** ART and DBC defective **/
	 ART_DBC_DEF(7),
	 /** ART **/
	 ART_LIM_DBC_DEF(8),
	 /** ART external fault and DBC defective **/
	 EXT_DBC(9),
	 /** undefined **/
	 UNDEFINED(15), /* PROCESSING ERROR. Original Data: RAW: 15 - undefined */
}

enum class ASSIST_FKT_AKT(val raw: Int) {
	 /** Off **/
	 OFF(0),
	 /** Distance Assistant **/
	 AAS(1),
	 /** Advanced Distronic **/
	 ADTR(2),
	 /** Downhill Brake Control **/
	 DBC(3),
}

enum class ASSIST_ANZ_V2(val raw: Int) {
	 /** basic picture according to active bit **/
	 IDLE(0),
	 /** Message "Switch on DBC **/
	 DBC_LIM(1),
	 /** Message "Switch off DBC" **/
	 DBC_AUS(2),
	 /** Message "switch off DBC" with sound **/
	 DBC_AUS_TON(3),
	 /** Message "DBC incorrect operation **/
	 DBC_NV_AKT(4),
	 /** Message "DBC incorrect operation **/
	 DBC_NV_LIM(5),
	 /** Message "Switch on AAS" **/
	 AAS_EIN(6),
	 /** Message "Switch off AAS" **/
	 AAS_AUS(7),
	 /** Message "switch off AAS" with sound **/
	 AAS_AUS_TON(8),
	 /** Message "AAS cannot be activated **/
	 AAS_NV_LIM(9),
	 /** Message "AAS cannot be activated **/
	 AAS_NV_OBJ(10),
	 /** Message "AAS incorrect operation **/
	 AAS_NV_FBED(11),
	 /** Message "AAS target is starting **/
	 AAS_FOLGEN(12),
	 /** Message "AAS object loss" **/
	 AAS_OBJ_VERLUST(13),
	 /** Message "AAS new object **/
	 AAS_OBJ_WECHSEL(14),
	 /** Message "Switch on PAS **/
	 PAS_EIN(15),
	 /** Message "Switch off PAS **/
	 PAS_AUS(16),
	 /** Message "PAS cannot be activated" **/
	 PAS_NV(17),
}

enum class CAS_ERR_ANZ_V2(val raw: Int) {
	 /** no error **/
	 IDLE(0),
	 /** CAS display "Clean front bumper" **/
	 CAS_SFV_REINIGEN(1),
	 /** CAS display "Clean front and rear bumpers" **/
	 CAS_SFV_SFH_REINIGEN(2),
	 /** CAS display "visit workshop" **/
	 CAS_ERR_W(3),
}

enum class VG_GANG(val raw: Int) {
	 /** shift in progress **/
	 SH_IPG(0),
	 /** off-road gear (low range) **/
	 LO(1),
	 /** street gang (high range) **/
	 HI(2),
	 /** neutral gear (not high or low range) **/
	 N(4),
	 /** signal not available **/
	 SNV(7),
}

enum class ANFN_VG(val raw: Int) {
	 /** not defined **/
	 NOT_DEFINED(0), /* PROCESSING ERROR. Original Data: RAW: 0 - not defined */
	 /** "Neutral" request **/
	 ANF_N(1),
	 /** No requirement **/
	 IDLE(2),
	 /** signal not available **/
	 SNV(3),
}