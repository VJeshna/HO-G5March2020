String sourceFile = readFileFromWorkspace("_lib/templates/jobs/HRRunFailedPipelineTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)


String envName = "feat-i-cw-atlas1"
String envNameUpper = envName.toUpperCase()
String folderName = "feat-i-cw-atlas1-Tests"
folder(folderName)

//jobs.createFSUBPipelineFailedTestRunner(pipelineJob("${folderName}/ATALS1_HR_RUN_FAILED_TESTS"), 'uk.gov.ipt.ci.featuretest.runner.CucumberHrRunner', 'feat-i-cw-atlas1', 'feat-i-cw-atlas1.properties', 'feat-i-cw-atlas1')
jobs.createHRFSUBPipelineFailedTestRunner(pipelineJob("${folderName}/ATALS1_HR_FSUB_USAC_RUN_FAILED_TESTS"), 'uk.gov.ipt.ci.featuretest.runner.CucumberHrRunner', envName, "${envName}.properties", "ccw")
