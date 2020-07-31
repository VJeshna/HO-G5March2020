String sourceFile = readFileFromWorkspace("_lib/templates/jobs/HRTestTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)
String folderName = "feat-i-cw-atlas1-Tests"
String namespace ="feat-i-cw-atlas1"
folder(folderName)

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR101_FW_CONFIRMBIOGRAPHICDETAILSTASK_ALL_APPLYING_FWCLAIM_TEST'), 'uk.gov.ipt.feewaiver.test.HR101_ConfirmBiographicDetailsTask_AllApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR102_FW_CONFIRMBIOGRAPHICDETAILSTASK_ONLY_DEPENDANT_APPLYING_FWCLAIM_TEST'), 'uk.gov.ipt.feewaiver.test.HR102_ConfirmBiographicDetailsTask_OnlyDependantApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR103_FW_CONSIDERFWTASK_ALL_APPLYING_FWCLAIM_TEST'), 'uk.gov.ipt.feewaiver.test.HR103_ConsiderFWClaimTask_AllApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR104_FW_CONSIDERFWTASK_ONLY_DEPENDANT_APPLYING_FWCLAIM_TEST'), 'uk.gov.ipt.feewaiver.test.HR104_ConsiderFWClaimTask_OnlyDependantApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR105_FW_MAKEDECISIONTASK_ALL_APPLYING_FWCLAIM_TEST'), 'uk.gov.ipt.feewaiver.test.HR105_MakeDecisionTask_AllApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR106_FW_MAKEDECISIONTASK_ONLY_DEPENDANT_APPLYING_FWCLAIM_TEST'), 'uk.gov.ipt.feewaiver.test.HR106_MakeDecisionTask_OnlyDependantApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR107_FW_MAKEDECISIONTASK_ALL_APPLYING_DEP_REJECTED_TEST'), 'uk.gov.ipt.feewaiver.test.HR107_MakeDecisionTask_AllApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR108_FW_MAKEDECISIONTASK_ONLY_DEPENDANT_APPLYING_DEP_EXEMPTED_TEST'), 'uk.gov.ipt.feewaiver.test.HR108_MakeDecisionTask_OnlyDependantApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR109_FW_MANAGEDOCUMENTSTASK_ALL_APPLYING_TEST'), 'uk.gov.ipt.feewaiver.test.HR109_ManageDocumentsTask_AllApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR110_FW_MANAGEDOCUMENTSTASK_ONLY_DEPENDANT_APPLYING_TEST'), 'uk.gov.ipt.feewaiver.test.HR110_ManageDocumentsTask_OnlyDependantApplyingFWClaim', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR111_FW_PRINTANDSENDTASK_3INVOLVEMENTS_ALLAPPLY_BOTHADDRESSES_TEST'), 'uk.gov.ipt.feewaiver.test.HR111_PrintSendDocumentsTask_3Involvements_AllApply', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR112_FW_PRINTANDSENDTASK_APPLICANTONLY_ALLAPPLY_BOTHADDRESSES_TEST'), 'uk.gov.ipt.feewaiver.test.HR112_PrintSendDocumentsTask_ApplicantOnly_FWApply', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR113_FW_PRINTANDSENDTASK_APPLICANTONLY_NONEAPPLY_BOTHADDRESSES_TEST'), 'uk.gov.ipt.feewaiver.test.HR113_PrintSendDocumentsTask_ApplicantOnly_NoneApply', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR115_FW_REVIEWCLAIM_3INVOLVEMENTS_ALLAPPLYING_REVIEWDECISION_TEST'), 'uk.gov.ipt.feewaiver.test.HR115_ReviewClaim_3Involvements_AllApplying_ReviewDecision', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR116_FW_REVIEWCLAIM_3INVOLVEMENTS_ALLAPPLYING_APPROVEDECISION_TEST'), 'uk.gov.ipt.feewaiver.test.HR116_ReviewClaim_3Involvements_AllApplying_ApproveDecision', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR117_FW_REVIEWCLAIM_3INVOLVEMENTS_1SUPPORTING_APPROVEDECISION_TEST'), 'uk.gov.ipt.feewaiver.test.HR117_ReviewClaim_3Involvements_1Supporting_ApproveDecision', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR118_FW_REVIEWCLAIM_1INVOLVEMENT_1CLAIMANT_APPROVEDECISION_TEST'), 'uk.gov.ipt.feewaiver.test.HR118_ReviewClaim_1Involvement_1Claimant_ApproveDecision', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR120_FW_APPROVEDECISIONTASK_APPLICANTONLY_1CLAIMANT_REVIEWDECISION_TEST'), 'uk.gov.ipt.feewaiver.test.HR120_ApproveDecisionTask_ApplicantOnly_ReviewApplication_FWApply', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR121_FW_APPROVEDECISIONTASK_3INVOLVEMENTS_1DEPNOTAPPLY_APPROVEDECISION_TEST'), 'uk.gov.ipt.feewaiver.test.HR121_ApproveDecisionTask_3Involvements_1DepNotApplying_ApproveDecision', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR122_FW_APPROVEDECISIONTASK_3INVOLVEMENTS_1DEPNOTAPPLY_REVIEWDECISION_TEST'), 'uk.gov.ipt.feewaiver.test.HR122_ApproveDecisionTask_3Involvements_1DepNotApplying_ReviewApplication', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR123_FW_APPROVEDECISIONTASK_3INVOLVEMENTS_1DEPNOTAPPLY_NOAPPROVAL_TEST'), 'uk.gov.ipt.feewaiver.test.HR123_ApproveDecisionTask_3Involvements_1DepNotApplying_NoApproval', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR124_Zara_PrintSendDocumentsTask_3Involvements_AllApply'), 'uk.gov.ipt.feewaiver.test.HR124_Zara_PrintSendDocumentsTask_3Involvements_AllApply', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR125_FW_ManageDocuments'), 'uk.gov.ipt.feewaiver.test.HR125_FW_ManageDocuments', namespace, namespace + '.properties')


jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR201_FLR_HRO_NO_HITS_APPLICANT_ONLY_E2E_TEST'), 'uk.gov.ipt.flr.test.HR201_FLR_HRO_NO_HITS_APPLICANT_ONLY_E2E_TEST', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR202_FLR_LR_NO_HITS_APPLICANT_ONLY_E2E_TEST'), 'uk.gov.ipt.flr.test.HR202_FLR_LR_NO_HITS_APPLICANT_ONLY_E2E_TEST', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR203_FLR_DL_NO_HITS_APPLICANT_ONLY_E2E_TEST'), 'uk.gov.ipt.flr.test.HR203_FLR_DL_NO_HITS_APPLICANT_ONLY_E2E_TEST', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR206_FLR_FP_NO_HITS_APPLICANT_ONLY_E2E_TEST'), 'uk.gov.ipt.flr.test.HR206_FLR_FP_NO_HITS_APPLICANT_ONLY_E2E_TEST', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR207_FLR_M_NO_HITS_APPLICANT_ONLY_E2E_TEST'), 'uk.gov.ipt.flr.test.HR207_FLR_M_NO_HITS_APPLICANT_ONLY_E2E_TEST', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR208_FLR_DL_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST'), 'uk.gov.ipt.flr.test.HR208_FLR_DL_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR209_FLR_HRO_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST'), 'uk.gov.ipt.flr.test.HR209_FLR_HRO_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR210_FLR_LR_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST'), 'uk.gov.ipt.flr.test.HR210_FLR_LR_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR211_FLR_FP_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST'), 'uk.gov.ipt.flr.test.HR211_FLR_FP_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR212_FLR_M_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST'), 'uk.gov.ipt.flr.test.HR212_FLR_M_NO_HITS_APPLICANT_ONLY_E2E_REFUSELR_TEST', namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR213_FLR_LR_REPRINT_BRP_NO_HITS_APPLICANT_ONLY_E2E_TEST'), 'uk.gov.ipt.flr.test.HR213_FLR_LR_REPRINT_BRP_NO_HITS_APPLICANT_ONLY_E2E_TEST',  namespace, namespace + '.properties')

jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR215_FLR_IE_Flow_CPC'), 'uk.gov.ipt.flr.test.HR215_FLR_IE_Flow_CPC',  namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR216_FLR_Manage_Associate_Person'), 'uk.gov.ipt.flr.test.HR216_FLR_Manage_Associate_Person',  namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR219_FLR_UKVI_RemoveDependent'), 'uk.gov.ipt.flr.test.HR219_FLR_UKVI_RemoveDependent',  namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR220_Zara_FL_DL_AppOnly_NoHits_E2E'), 'uk.gov.ipt.flr.test.HR220_Zara_FL_DL_AppOnly_NoHits_E2E',  namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/HR221_FLR_Manage_Documents'), 'uk.gov.ipt.flr.test.HR221_FLR_Manage_Documents',  namespace, namespace + '.properties')



jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS01_WaiveInPersonRequirement_Refusal'), 'uk.gov.ipt.fsub.test.FS01_WaiveInPersonRequirement_Refusal', namespace, namespace + '.properties')

//jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS06_INGEST_FSUB_WAIVERINPERSONREQUIREMENT_GRANT'), 'uk.gov.ipt.fsub.test.FS06_Ingest_Fsub_WaiveInPersonRequirement_Grant', namespace, namespace + '.properties')
//jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS17_FurtherSub_E2E_PostDecisionRequest'), 'uk.gov.ipt.fsub.test.FS17_FurtherSub_E2E_PostDecisionRequest', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS22_Grant_Granted_Asylum_and_ILE_ILR'), 'uk.gov.ipt.fsub.test.FS22_Grant_Granted_Asylum_and_ILE_ILR', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS25_Grant_Refuse_Asylum_Grant_Private_LTR'), 'uk.gov.ipt.fsub.test.FS25_Grant_Refuse_Asylum_Grant_Private_LTR', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS26_Grant_Refuse_Asylum_Grant_Private_LTE'), 'uk.gov.ipt.fsub.test.FS26_Grant_Refuse_Asylum_Grant_Private_LTE', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS30_Grant_HP_LTR_LTE'), 'uk.gov.ipt.fsub.test.FS30_Grant_HP_LTR_LTE', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS32_Grant_DL'), 'uk.gov.ipt.fsub.test.FS32_Grant_DL', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS34_Grant_LOTR_Limited_Leave_No_Conc'), 'uk.gov.ipt.fsub.test.FS34_Grant_LOTR_Limited_Leave_No_Conc', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS35_Grant_LOTR_ILR_No_Conc'), 'uk.gov.ipt.fsub.test.FS35_Grant_LOTR_ILR_No_Conc', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS18_BookAppointment_Reject'), 'uk.gov.ipt.fsub.test.FS18_BookAppointment_Reject', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS37_EnforcementProcess_Void'), 'uk.gov.ipt.fsub.test.FS37_EnforcementProcess_Void', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS54_WaiveInPersonRequirement_Withdraw'), 'uk.gov.ipt.fsub.test.FS54_WaiveInPersonRequirement_Withdraw', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS10_Reconsider_Grant'), 'uk.gov.ipt.fsub.test.FS10_Reconsider_Grant', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS17_PostDecisionRequest_Grant'), 'uk.gov.ipt.fsub.test.FS17_PostDecisionRequest_Grant', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS47_BookAppointment_BIComplete_Approve_Refusal'), 'uk.gov.ipt.fsub.test.FS47_BookAppointment_BIComplete_Approve_Refusal', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS40_BookAppointment_BIComplete_Grant_Approve'), 'uk.gov.ipt.fsub.test.FS40_BookAppointment_BIComplete_Grant_Approve', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS10_Reconsider_Grant'), 'uk.gov.ipt.fsub.test.FS10_Reconsider_Grant', namespace, namespace + '.properties')
//jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS17_PostDecisionRequest_Grant'), 'uk.gov.ipt.fsub.test.FS17_PostDecisionRequest_Grant', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS64_EnforcementProcess_ManageDependent_Grant_Approve'), 'uk.gov.ipt.fsub.test.FS64_EnforcementProcess_ManageDependent_Grant_Approve', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS65_ManageDependent_Remove_Dependant'), 'uk.gov.ipt.fsub.test.FS65_ManageDependent_Remove_Dependant', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS66_WaiveInPersonRequirement_Reject'), 'uk.gov.ipt.fsub.test.FS66_WaiveInPersonRequirement_Reject', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS67_BookAppointment_BICancelAppointment'), 'uk.gov.ipt.fsub.test.FS67_BookAppointment_BICancelAppointment', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS68_IEWorkgroupCPCFlow'), 'uk.gov.ipt.fsub.test.FS68_IEWorkgroupCPCFlow', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS69_ManageAssociatePerson'), 'uk.gov.ipt.fsub.test.FS69_ManageAssociatePerson', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS70_RecordAppointmentOutcome_UploadScreen'), 'uk.gov.ipt.fsub.test.FS70_RecordAppointmentOutcome_UploadScreen', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS71_ManageCaseViewTemplate'), 'uk.gov.ipt.fsub.test.FS71_ManageCaseViewTemplate', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS73_Zara_Grant_HP_LTR_LTE'), 'uk.gov.ipt.fsub.test.FS73_Zara_Grant_HP_LTR_LTE', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/FS74_ManageDocuments'), 'uk.gov.ipt.fsub.test.FS74_ManageDocuments', namespace, namespace + '.properties')


jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC01_Completed_Request_For_Transfer'), 'uk.gov.ipt.uasc.test.UASC01_Completed_Request_For_Transfer', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC02_Cancelled_Request_For_Transfer'), 'uk.gov.ipt.uasc.test.UASC02_Cancelled_Request_For_Transfer', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC03_Suspended_Then_Completed_Request_For_Transfer'), 'uk.gov.ipt.uasc.test.UASC03_Suspended_Then_Completed_Request_For_Transfer', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC04_Suspended_Then_Unallocated_UASC_Request'), 'uk.gov.ipt.uasc.test.UASC04_Suspended_Then_Unallocated_UASC_Request', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC05_FollowUp_Action'), 'uk.gov.ipt.uasc.test.UASC05_FollowUp_Action', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC06_Referred_And_Awaiting_Response'), 'uk.gov.ipt.uasc.test.UASC06_Referred_And_Awaiting_Response', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC07_Record_Looked_After_Status_Update'), 'uk.gov.ipt.uasc.test.UASC07_Record_Looked_After_Status_Update', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC08_UASC_Payment_Via_ManageCase'), 'uk.gov.ipt.uasc.test.UASC08_UASC_Payment_Via_ManageCase', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC09_Manage_Associate_Person'), 'uk.gov.ipt.uasc.test.UASC09_Manage_Associate_Person', namespace, namespace + '.properties')
jobs.createCWTestJobDefault(pipelineJob(folderName + '/UASC10_ZaraUsersForUASC'), 'uk.gov.ipt.uasc.test.UASC10_ZaraUsersForUASC', namespace, namespace + '.properties')

