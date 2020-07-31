String sourceFile = readFileFromWorkspace("_lib/templates/jobs/RSTLCucumberMultipleRunnersTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)

String envName = "feat-i-cw-atlas1"
String envNameUpper = envName.toUpperCase()
String folderName = "feat-i-cw-atlas1-Tests"
folder(folderName)


jobs.createCWTestJobDefault(pipelineJob("${folderName}/RESETTLEMENT_REGRESSION_${envNameUpper}"), 'uk.gov.ipt.ci.featuretest.runner.resettlement.regression', envName, "${envName}.properties")