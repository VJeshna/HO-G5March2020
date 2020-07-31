String sourceFile = readFileFromWorkspace("_lib/templates/jobs/ABIBDDCucumberTestTemplate.groovy")
Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)

String namespace = "feat-i-cw-atlas1"
String bddTestJobName = "abi_bdd_test_${namespace}_by_tag".toUpperCase()

String folderName = "feat-i-cw-atlas1-bdd-test"
folder(folderName)

jobs.createCWTestJobDefault(pipelineJob("${folderName}/${bddTestJobName}"), 'uk.gov.ipt.abi.Cucumber4Runner', "${namespace}", "${namespace}")
