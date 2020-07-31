String sourceFile = readFileFromWorkspace("_lib/templates/jobs/HRFLRPipelineFailedTestRunnerTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)


String envName = "feat-i-cw-atlas1"
String envNameUpper = envName.toUpperCase()
String folderName = "feat-i-cw-atlas1-bdd-test"
folder(folderName)

//jobs.createHRFSUBPipelineFailedTestRunner(pipelineJob("${folderName}/ATALS1_HRFLR_RUN_FAILED_TESTS"), 'uk.gov.ipt.ci.featuretest.runner.Cucumber4FLRRunner',  envName, "${envName}.properties", "ccw")

