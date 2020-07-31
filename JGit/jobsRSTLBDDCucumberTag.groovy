String sourceFile = readFileFromWorkspace("_lib/templates/jobs/RSTLComponentBDDCucumberTestTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)

String envName = "feat-i-cw-atlas1"
String envNameUpper = envName.toUpperCase()
String folderName = "feat-i-cw-atlas1-bdd-test"
folder(folderName)


jobs.createCWTestJobDefault(pipelineJob("${folderName}/RESETTLEMENT_BDD_TESTS_${envNameUpper}_BY_TAG"), 'uk.gov.ipt.ci.featuretest.runner.Cucumber4Runner', envName, "${envName}.properties")
