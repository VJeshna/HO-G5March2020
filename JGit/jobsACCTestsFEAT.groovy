String sourceFile = readFileFromWorkspace("_lib/templates/jobs/ACCTestTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)
String folderName = "feat-i-cw-atlas1-Tests"
String namespace ="feat-i-cw-atlas1"
folder(folderName)

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC500_CW_GRANT_RecurseToPublicFundOther_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC500_GrantAsylumRecurseToPublicFundOther', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC502_CW_GRANT_GrantAsylumNoRecourceToPublicFund_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC502_GrantAsylumNoRecourceToPublicFund', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC503_CW_REFUSE_ASYLUM_CLAIM_TEST'),'uk.gov.ipt.asylumclaim.test.ACC503_RefuseAsylumClaim',  namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC504_CW_GRANT_ART8_FAMILYLIFE_NORECOURSE_TEST'),'uk.gov.ipt.asylumclaim.test.ACC504_GrantRefuseAsylumNoRecurseToPublicFund',  namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC505_CW_RecordReceipt_UploadDoc_MoreTime_TEST'),'uk.gov.ipt.asylumclaim.test.ACC505_RecordRecieptUploadDocMoreTimeGiven',  namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC506_CW_RecordReceipt_NoUploadDoc_MoreTime_TEST'),'uk.gov.ipt.asylumclaim.test.ACC506_RecordRecieptNoUploadDocMoreTimeGiven',  namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC507_CW_RecoReciNoInfoProceedToConsiderWithoutPIQ_TEST'),'uk.gov.ipt.asylumclaim.test.ACC507_RecoReciNoInfoProceedToConsiderWithoutPIQ', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC508_CW_RecReciInfoReceivedProceedToConsiderWithPIQ_TEST'),'uk.gov.ipt.asylumclaim.test.ACC508_RecReciInfoReceivedProceedToConsiderWithPIQ', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC509_CW_RecReciNoInfoReceivedBookIntWithoutPIQ_TEST'),'uk.gov.ipt.asylumclaim.test.ACC509_RecReciNoInfoReceivedBookIntWithoutPIQ', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC511_CW_ClaimantFTALeadsHOWithdrawal_TEST'),'uk.gov.ipt.asylumclaim.test.ACC511_ClaimantFTALeadsHOWithdrawal', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC512_CW_InterviewSuspendLeadtoConsideration_TEST'),'uk.gov.ipt.asylumclaim.test.ACC512_IntvSuspendLeadtoConsideration', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC513_CW_RebookPreInterview_TEST'),'uk.gov.ipt.asylumclaim.test.ACC513_RebookPreInterview', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC514_CW_BookInterviewProceedToConsideration_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC514_BookInterviewProceedToConsideration', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC515_CW_GrantAsylumForNIBRPHappyPath_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC515_GrantAsylumForNI_BRPHappyPath', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC517_CW_FTALeadToConsiderAppToRebook_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC517_FTALeadToConsiderAppToRebook', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC518_TRN_UJ1.1ACSO_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC518_CS_IssuePIQ', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC519_TRN_UJ1.3ACDM_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC519_CS_ConsiderApp', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC520_TRN_UJ1.2ACAO_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC520_CS_RecoReceiptInfo', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC521_ACC_CW_SCREENING_AUTOALLOCATE_LondonWorkPermittedNoAgeDispute_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC521_Beta2_HappyPath_ManualLondonallocation', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC523_TRN_UJ2.1ACSO_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC523_ScreeningTrainingTest_GenerateRegisterTask', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC524_ACC_CW_SCREENING_AUTOALLOCATE_LONDON_WPSOL_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC524_ScreeningAutoallocationForLondonUnit', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC525_ACC_CW_SCREENING_AUTOALLOCATE_CARDIFF_WP_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC525_ScreeningAutoallocationForCardiffUnit', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC526_ACC_CW_SCREENING_AUTOALLOCATE_NEWCASTLE_WPS_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC526_ScreeningAutoallocationForNewCastleUnit', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC527_ACC_CW_SCREENING_AUTOALLOCATE_OUTERREGION_WPO_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC527_ScreeningAutoallocationForOuterRegion', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC528_ACC_CW_SCREENING_AUTOALLOCATE_NOADD_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC528_ScreeningAutoallocationwithNoAddEntry', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC529_ACC_CW_SCREENING_MANUALALLOCATE_NEWCASLE_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC529_Beta2_HappyPath_ManualNewCastleallocation', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC530_ACC_CW_SCREENING_MANUALALLOCATE_CARDIFF_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC530_Beta2_HappyPath_ManualCardiffallocation', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC531_RejectInvalidClaim_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC531_RejectInvalidClaim.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC532_ValidClaimEU_Inadmissible_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC532_ValidClaimEU_Inadmissible.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC533_ReferClaimToDACWithSelectionYesOnCFA_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC533_ReferClaimToDACWithSelectionYesOnCFA.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC534_ReferClaimToDACWithSelectionNoOnCFA_Allocate_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC534_ReferClaimToDACWithSelectionNoOnCFA_Allocate.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC535_ReferClaimToDACWithSelectionNoOnCFA_Defer_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC535_ReferClaimToDACWithSelectionNoOnCFA_Defer.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC536_ReferClaimToDACWithSelectionNoOnCFA_Inadmissible_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC536_ReferClaimToDACWithSelectionNoOnCFA_Inadmissible.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC537_ReferClaimToDACWithSelectionNoOnCFA_BookInterview_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC537_ReferClaimToDACWithSelectionNoOnCFA_BookInterview.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC538_ReferClaimToTCUWithSelectionYesOnCFA_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC538_ReferClaimToTCUWithSelectionYesOnCFA.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC539_ReferClaimToTCUWithSelectionNoOnCFA_Allocate_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC539_ReferClaimToTCUWithSelectionNoOnCFA_Allocate.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC540_ReferClaimToTCUWithSelectionNoOnCFA_Defer_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC540_ReferClaimToTCUWithSelectionNoOnCFA_Defer.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC541_ReferClaimToTCUWithSelectionNoOnCFA_Inadmissible_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC541_ReferClaimToTCUWithSelectionNoOnCFA_Inadmissible.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC542_ReferClaimToTCUWithSelectionNoOnCFA_BookInterview_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC542_ReferClaimToTCUWithSelectionNoOnCFA_BookInterview.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC543_ReferClaimToIAWithSelectionYesOnCFA_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC543_ReferClaimToIAWithSelectionYesOnCFA.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC544_ReferClaimToIAWithSelectionNoOnCFA_Allocate_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC544_ReferClaimToIAWithSelectionNoOnCFA_Allocate.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC545_ReferClaimToIAWithSelectionNoOnCFA_Defer_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC545_ReferClaimToIAWithSelectionNoOnCFA_Defer.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC546_ReferClaimToIAWithSelectionNoOnCFA_Inadmissible_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC546_ReferClaimToIAWithSelectionNoOnCFA_Inadmissible.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC547_ReferClaimToIAWithSelectionNoOnCFA_BookInterview_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC547_ReferClaimToIAWithSelectionNoOnCFA_BookInterview.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC548_RegisterBookInterviewFromConsiderApp_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC548_RegisterBookInterviewFromConsiderApp.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC549_GenerateRecoInfoOverdueTaskForBookInterview_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC549_GenerateRecoInfoOverdueTaskForBookInterview.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC550_BookInterviewFromRecIntOutCome_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC550_BookInterviewFromRecIntOutCome.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC551_BlackListedAddressForARC_BarryHouse_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC551_BlackListedAddressForARC_BarryHouse.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC552_BlackListedNFAAddressForARC_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC552_BlackListedNFAAddressForARC.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC553_GenerateRecoInfoOverdueTaskForProceedToConsiderataion_TEST'), 'uk.gov.ipt.asylumclaim.test.ACC553_GenerateRecoInfoOverdueTaskForProceedToConsiderataion.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC554_GenerateRecoInfoOverdueTaskForMoreTimeGiven'), 'uk.gov.ipt.asylumclaim.test.ACC554_GenerateRecoInfoOverdueTaskForMoreTimeGiven.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC555_PreregisterationBookIntWithSingleDep'), 'uk.gov.ipt.asylumclaim.test.beta3.ACC555_PreregisterationBookIntWithSingleDep.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC556_WithdraAppAtPreregister'), 'uk.gov.ipt.asylumclaim.test.beta3.ACC556_WithdraAppAtPreregister.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC557_WithdraAtPreRecordBiographicResult'), 'uk.gov.ipt.asylumclaim.test.beta3.ACC557_WithdraAtPreRecordBiographicResult.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC558_WithdraAtPreregiGeneratePort'), 'uk.gov.ipt.asylumclaim.test.beta3.ACC558_WithdraAtPreregiGeneratePort.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC559_WithdraAtPreregiRecoBiometric'), 'uk.gov.ipt.asylumclaim.test.beta3.ACC559_WithdraAtPreregiRecoBiometric.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC560_EventCheckForChildDepDiffAgeGroup'), 'uk.gov.ipt.asylumclaim.test.beta3.ACC560_EventCheckForChildDepDiffAgeGroup.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC561_Beta3HappyPathWithSingleDep'), 'uk.gov.ipt.asylumclaim.test.beta3.ACC561_Beta3HappyPathWithSingleDep.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC562_RegisterClaimForMinorApplicant'), 'uk.gov.ipt.asylumclaim.test.beta3.ACC562_RegisterClaimForMinorApplicant.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC563_RecordBiometricResultCheck'), 'uk.gov.ipt.asylumclaim.test.beta3.ACC563_RecordBiometricResultCheck.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC564_GenerateNRMCaseHappyPath'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC564_GenerateNRMCaseHappyPath.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC565_RISWithPncHit_WicuNoHit'), 'uk.gov.ipt.asylumclaim.test.RIS.ACC565_RISWithPncHit_WicuNoHit.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC566_RISWithPncHit_WicuHit'), 'uk.gov.ipt.asylumclaim.test.RIS.ACC566_RISWithPncHit_WicuHit.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC567_RISWithPncNoHit_WicuHit'), 'uk.gov.ipt.asylumclaim.test.RIS.ACC567_RISWithPncNoHit_WicuHit.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC568_RISWithPncHit_WicuHit_PM'), 'uk.gov.ipt.asylumclaim.test.RIS.ACC568_RISWithPncHit_WicuHit_PM.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC569_RISWithPncHit_WicuNoHit_PM'), 'uk.gov.ipt.asylumclaim.test.RIS.ACC569_RISWithPncHit_WicuNoHit_PM.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC570_RISWithPncNoHit_WicuHit_PM'), 'uk.gov.ipt.asylumclaim.test.RIS.ACC570_RISWithPncNoHit_WicuHit_PM.java', namespace, namespace + '.properties')

//-----------------------------------
jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC571_GenerateNRMForDecision_Leaveisnecessarytopursuecompensation'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC571_GenerateNRMForDecision_Leaveisnecessarytopursuecompensation.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC572_GenerateNRMForDecision_Other'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC572_GenerateNRMForDecision_Other.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC573_GenerateNRMForDecision_Victimswhoarehelpingpolicewiththeirenquiries'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC573_GenerateNRMForDecision_Victimswhoarehelpingpolicewiththeirenquiries.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC574_ReasonableGroundOutcometobereconsidered'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC574_ReasonableGroundOutcometobereconsidered.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC575_ReasonableGround_Negativereasonablegrounds'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC575_ReasonableGround_Negativereasonablegrounds.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC576_NRMRISWithPncHit_WicuHitBMPM'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC576_NRMRISWithPncHit_WicuHitBMPM.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC577_NRMRISWithPncHit_WicuHitPYBY'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC577_NRMRISWithPncHit_WicuHitPYBY.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC578_GenerateNRMForConclusiveGround_Outcometobereconsidered'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC578_GenerateNRMForConclusiveGround_Outcometobereconsidered.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC579_GenerateNRMForConclusiveGround_Negativeconclusivegrounds'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC579_GenerateNRMForConclusiveGround_Negativeconclusivegrounds.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC580_GenerateNRMForDecision_Refuse'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC580_GenerateNRMForDecision_Refuse.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC581_AddDependant'), 'uk.gov.ipt.asylumclaim.test.manageParty.ACC581_AddDependant.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC582_RemoveDependant'), 'uk.gov.ipt.asylumclaim.test.manageParty.ACC582_RemoveDependant.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC583_AddDependantWithdrawAtManageParty'), 'uk.gov.ipt.asylumclaim.test.manageParty.ACC583_AddDependantWithdrawAtManageParty.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC584_RemoveDependantWithdrawAtManageParty'), 'uk.gov.ipt.asylumclaim.test.manageParty.ACC584_RemoveDependantWithdrawAtManageParty.java', namespace, namespace + '.properties')

//New group tests cases-Make decision
jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC585_GrantedLeaveInlineWithLeaveExpiryOther'), 'uk.gov.ipt.asylumclaim.test.ACC585_GrantedLeaveInlineWithLeaveExpiryOther.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC586_GrantedLeaveInlineWithLeaveExpiryInd'), 'uk.gov.ipt.asylumclaim.test.ACC586_GrantedLeaveInlineWithLeaveExpiryInd.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC587_GrantUASEleave_LeavetoEnter'), 'uk.gov.ipt.asylumclaim.test.ACC587_GrantUASEleave_LeavetoEnter.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC588_GrantUASEleave_LeavetoRemain'), 'uk.gov.ipt.asylumclaim.test.ACC588_GrantUASEleave_LeavetoRemain.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC589_NewDecisionType_GrantRL_1C'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC589_NewDecisionType_GrantRL_1C.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC590_ReprintBRP'), 'uk.gov.ipt.asylumclaim.test.reprintBRP.ACC590_ReprintBRP.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC591_ReconsiderDecision'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACC591_ReconsiderDecision.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC592_AddAssociatedPerson'), 'uk.gov.ipt.asylumclaim.test.addAssociatedPerson.ACC592_AddAssociatedPerson.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC593_Reconsider_HOWithdrawsCase'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACC593_Reconsider_HOWithdrawsCase.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC594_Reconsider_BookInterview'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACC594_Reconsider_BookInterview.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC595_NewDecisionType_GrantRL_1CN'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC595_NewDecisionType_GrantRL_1CN.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC596_NewDecisionType_GrantRLAsylumRefused_Article_33_2BN'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC596_NewDecisionType_GrantRLAsylumRefused_Article_33_2BN.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC597_NewDecisionType_GrantRLAsylumRefused_Article33_2B'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC597_NewDecisionType_GrantRLAsylumRefused_Article33_2B.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC598_NewDecisionType_GrantRLAsylumRefusedHPExclusion_2D'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC598_NewDecisionType_GrantRLAsylumRefusedHPExclusion_2D.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC599_NewDecisionType_GrantRLAsylumRefused_HPExclusion_2DN'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC599_NewDecisionType_GrantRLAsylumRefused_HPExclusion_2DN.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC600_NewDecisionType_GrantRLAsylumRefusedArt_1F_Exclusion_2CN'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC600_NewDecisionType_GrantRLAsylumRefusedArt_1F_Exclusion_2CN.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC601_NewDecisionType_GrantRLAsylumRefusedArt1FExclusion_2C'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC601_NewDecisionType_GrantRLAsylumRefusedArt1FExclusion_2C.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC602_NewDecisionType_RestrictDLRefuseAsylumArt1FExclusion_2F'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC602_NewDecisionType_RestrictDLRefuseAsylumArt1FExclusion_2F.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC603_NewDecisionType_RestrictDLRefuseAsylumArt1FExclusion_2FN'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC603_NewDecisionType_RestrictDLRefuseAsylumArt1FExclusion_2FN.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC604_NewDecisionType_RestrictDLRefuseAsylumArticle_33_2EN'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC604_NewDecisionType_RestrictDLRefuseAsylumArticle_33_2EN.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC605_NewDecisionType_RestrictDLRefuseAsylumArticle33_2E'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC605_NewDecisionType_RestrictDLRefuseAsylumArticle33_2E.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC606_NewDecisionType_RestrictDLRefuseAsylumHP_excluded_2GN'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC606_NewDecisionType_RestrictDLRefuseAsylumHP_excluded_2GN.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC607_NewDecisionType_RestrictDLRefuseAsylumHPexcluded_2G'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACC607_NewDecisionType_RestrictDLRefuseAsylumHPexcluded_2G.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC608_ReissueARC'), 'uk.gov.ipt.asylumclaim.test.ReissueARC.ACC608_ReissueARC.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC609_ReissueARCAlternateJourney'), 'uk.gov.ipt.asylumclaim.test.ReissueARC.ACC609_ReissueARCAlternateJourney.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC700_ReissueARCWithGroupApplicant'), 'uk.gov.ipt.asylumclaim.test.ReissueARC.ACC700_ReissueARCWithGroupApplicant.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC701_ReissueARCAlternateJourneyGroupApplicant'), 'uk.gov.ipt.asylumclaim.test.ReissueARC.ACC701_ReissueARCAlternateJourneyGroupApplicant.java', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC702_IEBF_HappyPathWithSelectionOfYesOnAllPages'), 'uk.gov.ipt.asylumclaim.test.IE_BF.ACC702_IEBF_HappyPathWithSelectionOfYesOnAllPages.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC703_IEBF_SelectionOfYesOnAllPagesforIEBFwithCFAYes'), 'uk.gov.ipt.asylumclaim.test.IE_BF.ACC703_IEBF_SelectionOfYesOnAllPagesforIEBFwithCFAYes.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC704_IEBF_SelectionOfNoOnRegiRecBiometricforIEBF'), 'uk.gov.ipt.asylumclaim.test.IE_BF.ACC704_IEBF_SelectionOfNoOnRegiRecBiometricforIEBF.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC705_IEBF_SelectionOfNoOnRegiConsiderforIEBF'), 'uk.gov.ipt.asylumclaim.test.IE_BF.ACC705_IEBF_SelectionOfNoOnRegiConsiderforIEBF.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC706_IEBF_SelectionOfNoOnCFAIEBF'), 'uk.gov.ipt.asylumclaim.test.IE_BF.ACC706_IEBF_SelectionOfNoOnCFAIEBF.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC707_TcuOut_EU_HappyPath'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC707_TcuOut_EU_HappyPath.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC708_TcuOut_EU_AlternateJourneyForSingleResponse'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC708_TcuOut_EU_AlternateJourneyForSingleResponse.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC709_TcuOut_EU_AlternateJourneyForChallengeDecision'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC709_TcuOut_EU_AlternateJourneyForChallengeDecision.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC710_TcuOut_EU_CountryResponseOverdueTask'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC710_TcuOut_EU_CountryResponseOverdueTask.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC711_TcuOut_EU_AlternateJourneyResponseAcceptTakeBack'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC711_TcuOut_EU_AlternateJourneyResponseAcceptTakeBack.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC712_TcuOut_EU_AlternateJourneyResponseNotAcceptTakeBack'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC712_TcuOut_EU_AlternateJourneyResponseNotAcceptTakeBack.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC713_TcuOut_NonEU_HappyPath'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC713_TcuOut_NonEU_HappyPath.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC714_GenerateNRMCaseWithReconsiderApplication'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC714_GenerateNRMCaseWithReconsiderApplication.java',  namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC715_Reconsider_AddDependant'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACC715_Reconsider_AddDependant.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC716_NRMCaseWithReprintBRP'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC716_NRMCaseWithReprintBRP.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC717_RemoveDependantAtConsiderApp'), 'uk.gov.ipt.asylumclaim.test.manageParty.ACC717_RemoveDependantAtConsiderApp.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC718_NRMWithAddDependant'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC718_NRMWithAddDependant.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC719_Reconsider_RemoveDependant'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACC719_Reconsider_RemoveDependant.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC720_TcuOut_EU_BorderPoliceAcceptTakeBack'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC720_TcuOut_EU_BorderPoliceAcceptTakeBack.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC721_RegisterFurtherAction_Defer_NotifyApplicant'), 'uk.gov.ipt.asylumclaim.test.cr.ACC721_RegisterFurtherAction_Defer_NotifyApplicant.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC722_TransferAsylumClaimCaseToDifferentWorkgroupduringDecisionstage'), 'uk.gov.ipt.asylumclaim.test.cr.ACC722_TransferAsylumClaimCaseToDifferentWorkgroupduringDecisionstage.java',  namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC723_RegisterFurtherAction_VoidApplication'), 'uk.gov.ipt.asylumclaim.test.cr.ACC723_RegisterFurtherAction_VoidApplication.java',namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC724_RegisterFurtherAction_WithdrawApplication'), 'uk.gov.ipt.asylumclaim.test.cr.ACC724_RegisterFurtherAction_WithdrawApplication.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC725_RegisterFurtherAction_RejectApplication'), 'uk.gov.ipt.asylumclaim.test.cr.ACC725_RegisterFurtherAction_RejectApplication.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC727_GenerateNRMCaseHappyPathSpecialCase'), 'uk.gov.ipt.asylumclaim.test.specialCases.ACC727_GenerateNRMCaseHappyPathSpecialCase.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC728_GrantAsylumForNI_BRPHappyPathSpecialCase'), 'uk.gov.ipt.asylumclaim.test.specialCases.ACC728_GrantAsylumForNI_BRPHappyPathSpecialCase.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC729_NRMWithRemoveDependant'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC729_NRMWithRemoveDependant.java',  namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC730_NRMAddDependantOnFisrtConsider'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC730_NRMAddDependantOnFisrtConsider.java',  namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC731_NRMRejectAtFurtherAction'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC731_NRMRejectAtFurtherAction.java',  namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC732_NRMVoidAtFurtherAction'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC732_NRMVoidAtFurtherAction.java',  namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC733_NRMWithdrawAtFurtherAction'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC733_NRMWithdrawAtFurtherAction.java',  namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC734_TcuOut_EU_AddDependant'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC734_TcuOut_EU_AddDependant.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC735_NRMReconsiderWithAddDependant'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC735_NRMReconsiderWithAddDependant.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC737_TcuOut_EU_AddAssociatedPerson'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC737_TcuOut_EU_AddAssociatedPerson.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC738_TcuOut_EU_FurtherAction_Void'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC738_TcuOut_EU_FurtherAction_Void.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC739_TcuOut_EU_FurtherAction_Reject'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC739_TcuOut_EU_FurtherAction_Reject.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC740_TcuOut_EU_FurtherAction_Withdraw'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC740_TcuOut_EU_FurtherAction_Withdraw.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC741_TcuOut_EU_ReconsiderDecision'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC741_TcuOut_EU_ReconsiderDecision.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC742_ConsiderAppFurtherAction_Void'), 'uk.gov.ipt.asylumclaim.test.cr.ACC742_ConsiderAppFurtherAction_Void.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC743_ConsiderAppFurtherAction_Reject'), 'uk.gov.ipt.asylumclaim.test.cr.ACC743_ConsiderAppFurtherAction_Reject.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC744_ConsiderAppFurtherAction_Withdraw'), 'uk.gov.ipt.asylumclaim.test.cr.ACC744_ConsiderAppFurtherAction_Withdraw.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC745_ConsiderAppFurtherAction_Defer'), 'uk.gov.ipt.asylumclaim.test.cr.ACC745_ConsiderAppFurtherAction_Defer.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC746_ReConsiderAppFurtherAction_Defer'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACC746_ReConsiderAppFurtherAction_Defer.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC747_ReConsiderAppFurtherAction_Reject'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACC747_ReConsiderAppFurtherAction_Reject.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC748_ReConsiderAppFurtherAction_Void'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACC748_ReConsiderAppFurtherAction_Void.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC749_ReConsiderAppFurtherAction_Withdraw'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACC749_ReConsiderAppFurtherAction_Withdraw.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC750_GenerateNRMCaseWithReconsider_FurtherAction_Defer'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC750_GenerateNRMCaseWithReconsider_FurtherAction_Defer.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC751_GenerateNRMCaseWithReconsider_FurtherAction_Reject'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC751_GenerateNRMCaseWithReconsider_FurtherAction_Reject.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC752_GenerateNRMCaseWithReconsider_FurtherAction_Void'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC752_GenerateNRMCaseWithReconsider_FurtherAction_Void.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC753_GenerateNRMCaseWithReconsider_FurtherAction_Withdraw'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC753_GenerateNRMCaseWithReconsider_FurtherAction_Withdraw.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC754_TcuOut_EU_FurtherAction_Defer'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC754_TcuOut_EU_FurtherAction_Defer.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC755_NRMAddAssociatedPerson'), 'uk.gov.ipt.asylumclaim.test.NRM.ACC755_NRMAddAssociatedPerson.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC769_Tcu_RegisterConsiderFurtherAction_No'), 'uk.gov.ipt.asylumclaim.test.tcu.ACC769_Tcu_RegisterConsiderFurtherAction_No.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner1'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner1.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner1_1'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner1_1.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner2'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner2.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner2_1'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner2_1.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner3'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner3.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner3_1'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner3_1.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner4'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner4.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner4_1'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner4_1.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner5'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner5.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner5_1'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner5_1.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner6_Beta3'), 'uk.gov.ipt.asylumclaim.test.beta3.ACCGroupRunner6_Beta3.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner7_RIS'), 'uk.gov.ipt.asylumclaim.test.RIS.ACCGroupRunner7_RIS.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner8_NRM'), 'uk.gov.ipt.asylumclaim.test.NRM.ACCGroupRunner8_NRM.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner9'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner9.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner10'), 'uk.gov.ipt.asylumclaim.test.ACCGroupRunner10.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner11_NewDecisionTypes'), 'uk.gov.ipt.asylumclaim.test.NewDecisionType.ACCGroupRunner11_NewDecisionTypes.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner12_IE_BF'), 'uk.gov.ipt.asylumclaim.test.IE_BF.ACCGroupRunner12_IE_BF.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner13_CR'), 'uk.gov.ipt.asylumclaim.test.cr.ACCGroupRunner13_CR.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner14_NRM'), 'uk.gov.ipt.asylumclaim.test.NRM.ACCGroupRunner14_NRM.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner15_NRM_CR'), 'uk.gov.ipt.asylumclaim.test.NRM.ACCGroupRunner15_NRM_CR.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner16_NRM_CR'), 'uk.gov.ipt.asylumclaim.test.NRM.ACCGroupRunner16_NRM_CR.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner16_ManageParty'), 'uk.gov.ipt.asylumclaim.test.manageParty.ACCGroupRunner16_ManageParty.java', namespace, namespace+ '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACCGroupRunner17_reconsider'), 'uk.gov.ipt.asylumclaim.test.reconsider.ACCGroupRunner17_reconsider.java', namespace, namespace+ '.properties')
