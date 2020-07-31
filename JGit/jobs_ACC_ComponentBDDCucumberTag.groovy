String sourceFile = readFileFromWorkspace("_lib/templates/jobs/ACCComponentBDDCucumberTestTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)
String envName = "feat-i-cw-atlas1"
String envNameUpper = envName.toUpperCase()
String folderName = "feat-i-cw-atlas1-Tests"
folder(folderName)
jobs.createCWTestJobDefault(pipelineJob(folderName + '/ACC_BDD_TESTS_'+envNameUpper+'__BY_TAG'), 'uk.gov.ipt.asylumclaim.test.Regression.ACC_Cucumber4RunnerWithTag', envName, 'feat-i-cw-atlas1.properties')
