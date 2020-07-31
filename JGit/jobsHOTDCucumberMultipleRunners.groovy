String sourceFile = readFileFromWorkspace("_lib/templates/jobs/HOTDCucumberMultipleRunnersTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)

String envName = "feat-i-cw-atlas1"
String envNameUpper = envName.toUpperCase()
String folderName = "feat-i-cw-atlas1-bdd-test"
folder(folderName)

jobs.createCWTestJobDefault(pipelineJob("${folderName}/HOTD_REGRESSION_${envNameUpper}"), 'uk.gov.ipt.ci.featuretest.runner.hotds.regression', envName, "${envName}.properties")

jobs.createCWTestJobDefault(pipelineJob("${folderName}/FAMILY_REUNION_REGRESSION_${envNameUpper}"), 'uk.gov.ipt.ci.featuretest.runner.familyreunion.regression', envName, "${envName}.properties")
