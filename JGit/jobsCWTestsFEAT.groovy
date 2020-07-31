String folderName = "feat-i-cw-atlas1-Tests"
String envName = "feat-i-cw-atlas1"

String sourceFile = readFileFromWorkspace("_lib/templates/jobs/CWTestTemplate.groovy")
String sourceTemplateFile = readFileFromWorkspace("_lib/templates/SupportAndTrainingJobsTemplate.groovy")

folder(folderName)

Class jobs = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)
Class tempalte = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceTemplateFile)


//templatedFilename=jobs.createCWTestJobDefault(pipelineJob(folderName + '/' + "${TestReference}" + envName), "${TestRunner}", envName, envName + '.properties')

tempalte.getTrainingMap().each { entry -> jobs.createCWTestJobDefault(pipelineJob(folderName + '/' + "${entry.name}" + envName),  "${entry.runner}", envName, envName + '.properties') }

tempalte.getIaMap().each { entry -> jobs.createCWTestJobDefault(pipelineJob(folderName + '/' + "${entry.name}" + envName),  "${entry.runner}", envName, envName + '.properties') }

tempalte.getSupportMap().each { entry -> jobs.createCWTestJobDefault(pipelineJob(folderName + '/' + "${entry.name}" + envName),  "${entry.runner}", envName, envName + '.properties') }

jobs.createCWTestJobDefaultWithTag(pipelineJob(folderName + '/IARunnerByTags_' + envName), 'uk.gov.ipt.asup.ia.test.functional.IARunnerByTags', envName, envName + '.properties')
jobs.createCWTestJobDefaultWithTag(pipelineJob(folderName + '/SupportRunnerByTags_' + envName), 'uk.gov.ipt.asup.tr1.test.functional.SupportRunnerByTags', envName, envName + '.properties')
