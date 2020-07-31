String sourceFile = readFileFromWorkspace("_lib/templates/jobs/ClaimPipelineFailedTestRunnerTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)


String envName = "feat-i-cw-atlas1"
String envNameUpper = envName.toUpperCase()
String folderName = "feat-i-cw-atlas1-Tests"
folder(folderName)

jobs.createFSUBPipelineFailedTestRunner(pipelineJob("${folderName}/ATALS1_CLAIM_RUN_FAILED_TESTS"), 'uk.gov.ipt.asylumclaim.test.Regression.ACC_Cucumber4RunnerWithTag', 'feat-i-cw-atlas1', 'feat-i-cw-atlas1.properties', 'feat-i-cw-atlas1')
