buildMonitorView('feat-i-cw-atlas1-Tests/Atlas1 Dashboard Regression - Support') {
description('Dashboard of Support tests in feat-i-cw-atlas1')
	recurse(true)
	jobs {
		name('CW287_ASYS_TR2_S4_COC_RECONSIDER_DECISION_DEFERRED_feat-i-cw-atlas1')
		name('CW291_ASYS_TR2_S95_COC_RECONSIDER_DECISION_DEFERRED_feat-i-cw-atlas1')
		name('CW001_IA_ABORT_CHECKVALIDATE_feat-i-cw-atlas1')
		name('CW002_IA_ABORT_DECISION_feat-i-cw-atlas1')
		name('CW003_IA_ABORT_FULFILLMENT_feat-i-cw-atlas1')
		name('CW004_IA_ABORT_MANAGEPARTY_feat-i-cw-atlas1')
		name('CW005_IA_ABORT_REGISTRATION_feat-i-cw-atlas1')
		name('CW006_IA_ABORT_VALIDATEGATEKEEPER_feat-i-cw-atlas1')
		name('CW007_IA_BULK_UPDATE_feat-i-cw-atlas1')
		name('CW008_IA_CALENDAR_VIEW_P1_feat-i-cw-atlas1')
		name('CW009_IA_CALENDAR_VIEW_P2_feat-i-cw-atlas1')
		name('CW010_IA_CHECKS_feat-i-cw-atlas1')
		name('CW011_IA_COMPLIANCE_ABORT_feat-i-cw-atlas1')
		name('CW012_IA_COMPLIANCE_feat-i-cw-atlas1')
		name('CW013_IA_LEGACY_feat-i-cw-atlas1')
		name('CW014_IA_LOGIN_CASESENSITIVITY_feat-i-cw-atlas1')
		name('CW015_IA_NOCHECKS_feat-i-cw-atlas1')
		name('CW016_IA_REASSIGN_CHECKVALIDATE_feat-i-cw-atlas1')
		name('CW017_IA_REASSIGN_DECISION_feat-i-cw-atlas1')
		name('CW018_IA_REASSIGN_DEFAULTGROUP_feat-i-cw-atlas1')
		name('CW019_IA_REASSIGN_FULFILLMENT_feat-i-cw-atlas1')
		name('CW020_IA_REASSIGN_MANAGEPARTY_feat-i-cw-atlas1')
		name('CW021_IA_REASSIGN_REGISTRATION_feat-i-cw-atlas1')
		name('CW022_IA_SMOKE_feat-i-cw-atlas1')
		name('CW023_IA_SMOKE_NODEPS_feat-i-cw-atlas1')
		name('CW024_IA_UPDATE_AFTER_ABORT_feat-i-cw-atlas1')
		name('CW025_IA_UPDATE_AFTER_DECLINE_feat-i-cw-atlas1')
		name('CW026_IA_UPDATE_feat-i-cw-atlas1')
		name('CW027_IA_UPDATE_IPT_feat-i-cw-atlas1')
		name('CW028_IA_UPDATE_PARTY_SPLIT_feat-i-cw-atlas1')
		//name('CW032_PCV_feat-i-cw-atlas1')
		name('CW033_IA_SMOKE_FLAGS_feat-i-cw-atlas1')
		name('CW100_ASYS_TR1_UJ01_RFI_S4_APPLICANT_feat-i-cw-atlas1')
		name('CW101_ASYS_TR1_UJ01_RFI_S4_APPLICANT_MINCHAR_feat-i-cw-atlas1')
		name('CW102_ASYS_TR1_UJ01_RFI_S95_APPLICANT_SPECIALCHAR_feat-i-cw-atlas1')
		name('CW103_ASYS_TR1_UJ01_RFI_SMOKE_DECLINE_feat-i-cw-atlas1')
		name('CW104_ASYS_TR1_UJ03_DEPS_feat-i-cw-atlas1')
		name('CW105_ASYS_TR1_UJ03_SMOKE_DECLINE_feat-i-cw-atlas1')
		name('CW106_ASYS_TR2_UJ04_SMOKE_ACCOMMODATION_ONLY_feat-i-cw-atlas1')
		name('CW107_ASYS_TR2_UJ05_SMOKE_PAYMENT_ONLY_feat-i-cw-atlas1')
		name('CW108_ASYS_TR2_UJ06_ACC_CANCEL_IN_RECORD_OR_REJECT_feat-i-cw-atlas1')
		name('CW109_ASYS_TR2_UJ06_ACC_NO_MATCH_IN_RECORD_OR_REJECT_feat-i-cw-atlas1')
		name('CW110_ASYS_TR2_UJ06_ACC_REJECT_IN_RECORD_OR_REJECT_feat-i-cw-atlas1')
		name('CW111_ASYS_TR2_UJ06_APPLICANT_WITH_CID_feat-i-cw-atlas1')
		name('CW112_ASYS_TR2_UJ06_S95_WITH_FILE_CHECKS_feat-i-cw-atlas1')
		name('CW113_ASYS_TR2_UJ06_S4_DEPENDANTS_feat-i-cw-atlas1')
		name('CW114_ASYS_TR2_UJ06_S95_DEPENDANTS_feat-i-cw-atlas1')
		name('CW115_ASYS_TR2_UJ06_S95_DEPENDANTS_NOCID_feat-i-cw-atlas1')
		name('CW116_ASYS_TR2_UJ06_SMOKE_ACCOMMODATION_AND_PAYMENT_feat-i-cw-atlas1')
		name('CW117_ASYS_TR2_UJ07_S95_DECLINE_APPEAL_feat-i-cw-atlas1')
		name('CW118_ASYS_TR2_UJ09_S4_COC_PREGNANCY_PAYMENTS_feat-i-cw-atlas1')
		name('CW119_ASYS_TR2_UJ11_S4_ACC_PAY_DISCONTINUATION_feat-i-cw-atlas1')
		name('CW120_ASYS_TR2_UJ11_S95_ACC_DISCONTINUATION_feat-i-cw-atlas1')
		name('CW121_ASYS_TR2_UJ11_S95_PAYMENT_DISCONTINUATION_feat-i-cw-atlas1')
		name('CW122_ASYS_TR1_UJ01_RFI_S4_APPLICANT_INTERNAL_feat-i-cw-atlas1')
		name('CW123_ASYS_TR2_UJ09_s4_COC_PERSONAL_DETAILS_feat-i-cw-atlas1')
		name('CW124_ASYS_TR2_UJ06_ACC_IMPRISONED_CANCEL_IN_RECORD_OR_REJECT_feat-i-cw-atlas1')
		name('CW125_ASYS_TR2_UJ06_ACC_INCORRECT_LOCATION_REJECT_IN_RECORD_OR_REJECT_feat-i-cw-atlas1')
		name('CW126_ASYS_TR2_UJ10_S4_COC_ADD_DEP_ADULT_feat-i-cw-atlas1')
		name('CW127_ASYS_TR2_UJ11_S95_ACC_PAYMENTS_FILE_DISCONTINUATION_feat-i-cw-atlas1')
		name('CW128_ASYS_TR2_UJ06_S4_ABORT_CONFIRM_MAIN_APPLICANT_feat-i-cw-atlas1')
		name('CW129_ASYS_TR2_UJ06_S4_ABORT_GENERATE_DOCUMENT_feat-i-cw-atlas1')
		name('CW130_ASYS_TR2_UJ06_S4_ABORT_CHECK_AND_VALIDATE_feat-i-cw-atlas1')
		name('CW131_ASYS_TR2_UJ06_S4_ABORT_DECISION_feat-i-cw-atlas1')
		name('CW132_ASYS_TR2_UJ06_S4_ABORT_MANAGE_PARTY_feat-i-cw-atlas1')
		name('CW133_ASYS_TR2_UJ06_S4_ABORT_PRINT_AND_DISPATCH_feat-i-cw-atlas1')
		name('CW134_ASYS_TR2_UJ05_GRANT_WITH_BACKPAY_PAYMENT_feat-i-cw-atlas1')
		name('CW135_ASYS_TR2_UJ05_GRANT_WITH_CLAWBACK_PAYMENT_feat-i-cw-atlas1')
		name('CW136_ASYS_TR2_UJ05_GRANT_WITH_MATERNITY_PAYMENT_feat-i-cw-atlas1')
		name('CW137_ASYS_TR2_UJ05_GRANT_WITH_MULTIPLE_PAYMENT_feat-i-cw-atlas1')
		name('CW138_ASYS_TR2_UJ05_GRANT_WITH_TRAVEL_PAYMENT_feat-i-cw-atlas1')
		name('CW139_ASYS_TR2_UJ08_S95_COC_MH_HO_TO_HO_feat-i-cw-atlas1')
		name('CW140_ASYS_TR2_UJ09_S95_COC_MH_MATERNITY_PAYMENT_feat-i-cw-atlas1')
		name('CW141_ASYS_TR2_UJ15_S95_COC_MH_ADD_DEP_MINOR_feat-i-cw-atlas1')
		name('CW142_ASYS_TR2_UJ13_S95_COC_MH_REMOVE_DEPENDANT_feat-i-cw-atlas1')
		name('CW143_ASYS_TR2_UJ17_S95_COC_RECONSIDER_DECISION_feat-i-cw-atlas1')
		name('CW144_ASYS_TR2_S95_MH_INBOUND_CONTACT_feat-i-cw-atlas1')
		name('CW145_ASYS_TR2_S95_INBOUND_CONTACT_feat-i-cw-atlas1')
		name('CW146_ASYS_TR2_UJ08_S4_CW_COC_MH_HO_TO_HO_feat-i-cw-atlas1')
		name('CW147_ASYS_TR2_S95_OUTBOUND_CONTACT_feat-i-cw-atlas1')
		name('CW148_ASYS_TR2_S4_REINSTATEMENT_NEW_feat-i-cw-atlas1')
		name('CW149_ASYS_TR2_UJ06_FAILURE_TO_TRAVEL_feat-i-cw-atlas1')
		//name('CW150_ASYS_TR2_UJ21_COC_PERSON_CONTACT_feat-i-cw-atlas1') Person Contact CASE-12708
		name('CW151_ASYS_TR2_UJ12_COC_S95_HO_TO_PRIVATE_feat-i-cw-atlas1')
		name('CW152_ASYS_TR2_UJ12_COC_S95_CW_PRIVATE_TO_PRIVATE_feat-i-cw-atlas1')
		name('CW153_ASYS_TR2_UJ04_S95_CW_ACC_ONLY_LETTER_TO_OTHERPARTIES_feat-i-cw-atlas1')
		name('CW154_ASYS_TR2_UJ08_S95_COC_MH_HO_TO_HO_SPECIAL_CHARS_feat-i-cw-atlas1')
		name('CW155_ASYS_TR2_UJ08_S95_COC_MH_HO_TO_HO_MIN_CHARS_feat-i-cw-atlas1')
		name('CW156_ASYS_TR2_UJ08_S95_COC_MH_HO_TO_HO_MAX_CHARS_feat-i-cw-atlas1')
		name('CW157_ASYS_TR2_UJ23_S95_COC_ADDDEPMINOR_CHK_ASYLUM_REF_feat-i-cw-atlas1')
		name('CW158_ASYS_TR2_UJ05_S4_INTERNAL_DEFERRAL_REFUSAL_feat-i-cw-atlas1')
		name('CW159_ASYS_TR2_UJ05_S4_COC_CW_RECONSIDER_INTERNAL_DEFERRAL_feat-i-cw-atlas1')
		name('CW160_ASYS_TR2_UJ16_S95_MANAGE_CASE_DETAILS_feat-i-cw-atlas1')
		name('CW161_ASYS_TR2_UJ17_S4_RECONSIDER_DECISION_ACC_PAY_feat-i-cw-atlas1')
		name('CW162_ASYS_TR2_UJ17_S95_RECONSIDER_DECISION_PAY_feat-i-cw-atlas1')
		name('CW163_ASYS_TR2_UJ17_S95_RECONSIDER_DECISION_ACC_feat-i-cw-atlas1')
		name('CW164_ASYS_TR2_UJ17_S95_RECONSIDER_DECISION_RFI_ACC_PAY_feat-i-cw-atlas1')
		name('CW165_ASYS_TR2_UJ15_S4_COC_CW_ADD_DEP_ADULT_MAX_CHARS_feat-i-cw-atlas1')
		name('CW166_ASYS_TR2_UJ15_S95_COC_MH_ADD_DEP_ADULT_SPECIAL_CHARS_feat-i-cw-atlas1')
		name('CW167_ASYS_TR2_UJ15_S95_COC_MH_ADD_DEP_MINOR_MIN_CHARS_feat-i-cw-atlas1')
		name('CW168_ASYS_TR2_TEMPLATE_MANAGMENT_SMOKE_feat-i-cw-atlas1')
		name('CW169_ASYS_TR2_UJ23_S95_CHK_ASYLUM_REF_GENERATED_NASSREF_feat-i-cw-atlas1')
		name('CW170_ASYS_TR2_UJ23_S95_CHK_ASYLUM_REF_WITHCID_GENERATED_NASSREF_feat-i-cw-atlas1')
		name('CW171_ASYS_TR2_UJ23_S95_CHK_ASYLUM_REF_EXISTING_feat-i-cw-atlas1')
		name('CW172_ASYS_TR2_IA_COC_ADD_ADULT_HO_HO_feat-i-cw-atlas1')
		//name('CW173_ASYS_TR2_UJ21_S95_COC_PERSON_CONTACT_ADD_DEP_MATERNITY_feat-i-cw-atlas1')
		//name('CW174_ASYS_TR2_UJ21_S95_COC_PERSON_CONTACT_REMOVE_DEPENDANT_feat-i-cw-atlas1')
		//name('CW175_ASYS_TR2_UJ21_S4_COC_PERSON_CONTACT_REQUEST_FOR_APPEAL_feat-i-cw-atlas1') Person Contact CASE-12708
		name('CW176_ASYS_TR2_UJ11_S95_DISCONTINUATION_SUSPEND_feat-i-cw-atlas1')
     	name('CW177_ASYS_TR2_UJ11_S4_DISCONTINUATION_FINAL_feat-i-cw-atlas1')
		name('CW178_ASYS_TR2_UJ04_ACC_AMEND_ACCEPT_IN_RECORD_MOVE_IN_feat-i-cw-atlas1')
		name('CW179_ASYS_TR2_UJ04_ACC_AMEND_REJECT_IN_RECORD_MOVE_IN_feat-i-cw-atlas1')
		name('CW180_ASYS_TR2_UJ04_FUNCTIONAL_ACC_IMPRISONED_CANCEL_IN_RECORD_MOVE_IN_feat-i-cw-atlas1')
		name('CW181_ASYS_TR2_UJ04_FUNCTIONAL_ACC_NEW_IPT_CANCEL_IN_RECORD_MOVE_IN_feat-i-cw-atlas1')
		name('CW182_ASYS_TR2_UJ07_S95_FUNCTIONAL_APPEAL_BUNDLE_MAX_CHAR_feat-i-cw-atlas1')
		name('CW183_ASYS_TR2_UJ07_S4_DISCONTINUATION_APPEAL_BUNDLE_MAX_CHAR_feat-i-cw-atlas1')
		name('CW184_ASYS_TR2_UJ04_ACC_MOVED_ELSEWHERE_IN_RECORD_MOVE_IN_feat-i-cw-atlas1')
		name('CW185_ASYS_TR2_UJ13_S95_COC_MINCHARS_REMOVE_ADULT_DEPENDANT_feat-i-cw-atlas1')
		name('CW186_ASYS_TR2_UJ04_ACC_FAIL_TO_TRAVEL_IN_RECORD_MOVE_IN_feat-i-cw-atlas1')
		name('CW187_ASYS_TR2_UJ06_S4_GRANTACCO_PAYMENT_DENYFROM_FIRSTTRAVELDATE_feat-i-cw-atlas1')
		name('CW188_ASYS_TR2_UJ12_S95_CW_COC_MH_HO_TO_PRIVATE_feat-i-cw-atlas1')
		name('CW189_ASYS_TR2_UJ12_S95_CW_COC_MH_PRIVATE_TO_PRIVATE_feat-i-cw-atlas1')
		name('CW190_ASYS_TR2_UJ06_REASSIGNS_feat-i-cw-atlas1')
		name('CW191_ASYS_TR2_UJ06_REASSIGN_ACC_PAY_feat-i-cw-atlas1')
		name('CW192_ASYS_TR2_UJ06_COC_REASSIGN_HO_TO_HO_feat-i-cw-atlas1')
		name('CW193_ASYS_TR2_UJ06_CW193_SEARCH_FOR_NASS_REF_feat-i-cw-atlas1')
		name('CW194_ASYS_TR2_UJ10_FUNCTIONAL_S95_REINSTATEMENT_ACCOM_AND_PAY_feat-i-cw-atlas1')
		name('CW195_ASYS_TR2_UJ12_COC_S95_HO_TO_PRIVATE_REVIEW_ADDRESS_DETAILS_feat-i-cw-atlas1')
		name('CW196_ASYS_TR2_UJ06_S95_VERIFY_UCFILE_RECEIVED_AFTER_PAYMENT_CHARGES_feat-i-cw-atlas1')
		name('CW197_ASYS_TR2_UJ06_SMOKE_ACCOMMODATION_AND_PAYMENT_WITH_READONLY_USER_CHECKS_feat-i-cw-atlas1')
		name('CW198_ASYS_TR2_UJ06_S95_ACC_PAY_DISCONTINUATION_REFUSAL_feat-i-cw-atlas1')
		name('CW200_ASYS_TR2_UJ09_S95_COC_MH_REQUEST_RELOCATION_PROVIDER_feat-i-cw-atlas1')
		name('CW201_ASYS_TR2_UJ09_S4_COC_MH_REQUEST_RELOCATION_PROVIDER_feat-i-cw-atlas1')
		name('CW202_ASYS_TR2_UJ09_S95_COC_CW_PREGNANCY_PAYMENT_feat-i-cw-atlas1')
		name('CW203_ASYS_TR2_UJ09_S95_COC_CW_DESTITUTE_PAYMENT_feat-i-cw-atlas1')
		name('CW204_ASYS_TR2_UJ09_S4_COC_CW_DESTITUTE_PAYMENT_feat-i-cw-atlas1')
        name('CW205_ASYS_TR2_UJ06_S95_GRANT_CP_FRIDAY_RUN_CHECKS_feat-i-cw-atlas1')
		name('CW206_ASYS_TR2_UJ09_S95_INVALID_NASS_REF_TEST_feat-i-cw-atlas1')
        name('CW207_ASYS_TR2_UJ09_S95_DIFF_PORT_REF_ASF1_TEST_feat-i-cw-atlas1')
		name('CW208_ASYS_TR2_UJ09_S95_COC_CW_EXCEPTIONAL_PAY_feat-i-cw-atlas1')
		name('CW209_ASYS_TR2_UJ04_ACCOMM_ONLY_CBP_VALIDATION_TEST_feat-i-cw-atlas1')
		name('CW210_ASYS_TR2_UJ09_S95_COC_MH_PRIVATE_TO_HO_feat-i-cw-atlas1')
		name('CW211_ASYS_TR2_UJ09_S95_COC_CW_BACK_PAY_WITH_DATE_VALIDATION_feat-i-cw-atlas1')
		name('CW212_ASYS_TR2_UJ09_S95_COC_CW_CUSTODY_PAY_feat-i-cw-atlas1')
		name('CW213_ASYS_TR2_UJ09_S4_COC_CW_SUPPLEMENTRY_PAY_feat-i-cw-atlas1')
		name('CW214_ASYS_TR2_UJ09_S4_COC_CW_CUSTODY_PAY_feat-i-cw-atlas1')
		name('CW215_ASYS_TR2_UJ09_S95_COC_CW_HOSPITAL_PAY_feat-i-cw-atlas1')
		name('CW216_ASYS_TR2_UJ09_S4_COC_CW_HOSPITAL_PAY_feat-i-cw-atlas1')
		name('CW217_ASYS_TR2_UJ09_S95_COC_CW_APPLICANT_WORKING_PAY_feat-i-cw-atlas1')
		name('CW218_ASYS_TR2_UJ09_S4_COC_CW_APPLICANT_WORKING_PAY_feat-i-cw-atlas1')
		name('CW219_ASYS_TR2_S4_NOT_ENTERTAIN_feat-i-cw-atlas1')
		name('CW220_ASYS_TR2_CID_MISMATCH_feat-i-cw-atlas1')
		name('CW221_ASYS_TR2_UJ11_S95_DISCONTINUATION_FINAL_PAYMENT_feat-i-cw-atlas1')
		name('CW222_ASYS_TR2_CID_MISMATCH_CONTINUE_feat-i-cw-atlas1')
		name('CW223_ASYS_TR2_S95_REINSTATEMENT_PAY_ONLY_feat-i-cw-atlas1')
		name('CW224_ASYS_TR2_S95_REINSTATEMENT_ACCO_ONLY_feat-i-cw-atlas1')
		name('CW225_ASYS_TR2_UJ6_S95_PAYMENT_REDUCTION_WITH_DEPS_feat-i-cw-atlas1')
		name('CW226_ASYS_TR2_UJ9_S95_MH_COC_PAYMENT_REDUCTION_feat-i-cw-atlas1')
		name('CW227_ASYS_TR2_UJ6_S4_PAYMENT_REDUCTION_feat-i-cw-atlas1')
        name('CW228_ASYS_TR2_DISCONTINUATION_ACC_TWICE_TEST_feat-i-cw-atlas1')
        name('CW229_ASYS_TR2_DISCONTINUATION_NO_ACC_TEST_feat-i-cw-atlas1')
    	name('CW230_ASYS_TR2_UJ6_S95_REDUCE_PAYMENT_WITH_CLAWBACK_feat-i-cw-atlas1')
		name('CW231_ASYS_TR2_UJ6_S4_REDUCE_PAYMENT_WITH_CLAWBACK_feat-i-cw-atlas1')
		name('CW232_ASYS_TR2_UJ9_95_COC_MH_MIXED_HOUSEHOLD_feat-i-cw-atlas1')
		name('CW233_ASYS_TR2_UJ9_S4_COC_MH_MIXED_HOUSEHOLD_feat-i-cw-atlas1')
        name('CW234_ASYS_TR2_UJ9_S95_COC_OVER_PAYMENT_feat-i-cw-atlas1')
        name('CW237_ASYS_TR2_COC_PAYMENT_VALIDATION_feat-i-cw-atlas1')
		name('CW235_ASYS_TR2_UJ9_S4_COC_OVER_PAYMENT_feat-i-cw-atlas1')
        name('CW253_ASYS_TR2_SMOKE_MULTI_ASSIGNEE_SEARCH_feat-i-cw-atlas1')
		name('CW254_ASYS_TR2_PARALLEL_MH_ABORTED_feat-i-cw-atlas1')
		name('CW255_ASYS_TR2_PARALLEL_COC_APPEAL_DISCON_feat-i-cw-atlas1')
		name('CW256_ASYS_TR2_PARALLEL_INBOUND_OUTBOUND_feat-i-cw-atlas1')
		name('CW257_ASYS_TR2_PARALLEL_CID_IDENTITY_feat-i-cw-atlas1')
        name('CW258_ASYS_TR2_S95_REINSTATEMENT_REFUSED_feat-i-cw-atlas1')
		name('CW259_ASYS_TR2_PARALLEL_AMT_COC_DISCON_feat-i-cw-atlas1')
		name('CW261_ASYS_TR2_SINGLE_ASSIGNEE_AND_GROUP_SEARCH_feat-i-cw-atlas1')
		name('CW262_ASYS_TR1_FUNCTIONAL_SMOKE_COC_RECONSIDER_DECISION_END_SD_WITH_FTT_feat-i-cw-atlas1')
		name('CW263_ASYS_TR1_FUNCTIONAL_S4_FAILURE_TO_TRAVEL_feat-i-cw-atlas1')
		name('CW264_ASYS_TR1_FUNCTIONAL_CONSOLIDATED_DOCUMENT_VIEW_feat-i-cw-atlas1')
		name('CW265_ASYS_TR2_SEARCH_INVALID_NASSREF_CMA_feat-i-cw-atlas1')
		name('CW267_ASYS_TR2_SEARCH_FURTHER_SUB_CMA_feat-i-cw-atlas1')
		name('CW269_ASYS_TR2_TASK_SEARCH_BY_PORT_REF_NASS_REF_HO_REF_feat-i-cw-atlas1')
		
      	//Added missing test
		name('CW260_ASYS_TR2_GRANT_SMOKE_COC_CW_MATERNITY_PAYMENT_feat-i-cw-atlas1')
		name('CW301_ASYS_TR2_UJ11_S95_PAYMENT_DISCONTINUATION_AUTOSIT_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW302_ASYS_TR2_UJ6_S4_REDUCE_PAYMENT_WITH_CLAWBACK_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW303_ASYS_TR1_UJ03_DEPS_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW304_ASYS_TR2_UJ11_S4_DISCONTINUATION_FINAL_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW305_ASYS_TR2_DISCONTINUATION_ACC_TWICE_TEST_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW306_ASYS_TR2_S95_REINSTATEMENT_ACCO_ONLY_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW307_ASYS_TR2_UJ09_S95_COC_MH_PRIVATE_TO_HO_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW308_ASYS_TR2_S95_REINSTATEMENT_PAY_ONLY_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW309_ASYS_TR2_UJ11_S95_DISCONTINUATION_FINAL_PAYMENT_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW310_ASYS_TR2_S95_REINSTATEMENT_REFUSED_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW311_ASYS_TR2_UJ05_GRANT_WITH_MULTIPLE_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW312_ASYS_TR2_UJ05_GRANT_WITH_BACKPAY_PAYMENT_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW313_ASYS_TR2_UJ6_S4_PAYMENT_REDUCTION_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW314_ASYS_TR2_UJ11_S95_ACC_DISCONTINUATION_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW315_ASYS_TR2_UJ12_S95_CW_COC_MH_PRIVATE_TO_PRIVATE_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW316_ASYS_TR2_UJ12_COC_S95_CW_PRIVATE_TO_PRIVATE_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW317_ASYS_TR2_UJ05_GRANT_WITH_CLAWBACK_PAYMENT_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW318_ASYS_TR2_UJ05_GRANT_WITH_MATERNITY_PAYMENT_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW319_ASYS_TR2_UJ05_GRANT_WITH_TRAVEL_PAYMENT_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW320_ASYS_TR2_UJ04_SMOKE_ACCOMMODATION_ONLY_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW321_ASYS_TR2_UJ12_COC_S95_CW_PRIVATE_TO_PRIVATE_ASF_FORMCHECK_feat-i-cw-atlas1')
		name('CW322_ASYS_TR2_FUNCTIONAL_SMOKE_DISCONTINUATI_ON_FUTUR_DATE_TEST_feat-i-cw-atlas1')
		//templatedFilename=name('${TestNumber}_${TestReference}_feat-i-cw-atlas1')
		name('ATLAS1_ASYS_RUNNER')
	}
}
