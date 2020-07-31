String sourceFile = readFileFromWorkspace("_lib/templates/jobs/HRFWPipelineFailedTestRunnerTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)


String envName = "feat-i-cw-atlas1"
String envNameUpper = envName.toUpperCase()
String folderName = "feat-i-cw-atlas1-bdd-test"
folder(folderName)

//jobs.createFSUBPipelineFailedTestRunner(pipelineJob("${folderName}/ATALS1_HRFW_RUN_FAILED_TESTS"), 'uk.gov.ipt.ci.featuretest.runner.Cucumber4FWRunner',  envName, "${envName}.properties", "ccw")

