
//
// Job Parameters
//
String prjName = "ipta";
String repoName = "ipt-systemteam-sits-tests";

def propertyFile="feat-i-cw-atlas1.properties"
def testBrowser=["chrome_66_239", "chrome_64_235", "phantomjs", "firefox", "chrome", "chrome_64_236"]
def testRunner="uk.gov.ipt.asup.ia.test.functional.IASmokePerfTest"
def namespace="feat-i-cw-atlas1"

String folderName = "feat-i-cw-atlas1-Tests"
String jobName = folderName + '/IA_SMOKE_PERF_ATLAS1';

// ###################################################################
// ####### EDITING BELOW HERE WILL BREAK THE JOB #####################
// ###################################################################

pipelineJob(jobName) {
    parameters{
        stringParam('BRANCH','develop','Branch or tag of tests to run');
        choiceParam('PROPERTYFILE',[propertyFile],'propertyFile to run test');
        choiceParam('TESTBROWSER',testBrowser,'Browser to run test');
        choiceParam('TESTRUNNER',[testRunner],'testRunner to run test');
        choiceParam('NAMESPACE',[namespace],'Namespace to run test');
    }
    logRotator{
        daysToKeep(30)
        numToKeep(30)
    }
        definition{
        cpsScm{
            scm{
                git {
                    remote{
                        url "ssh://git@bitbucket.ipttools.info/${prjName}/${repoName}.git"
                        credentials('b3f71829-edcd-46c6-b83f-59b98eb9695d');
                    }
                                        extensions {
                        wipeWorkspace()
                        cloneOption {
                            shallow(true)
                            noTags(false)
                            reference("")
                            timeout(10)
                        }
                    }
                    branch("\$BRANCH")
                }
            }
            scriptPath("JenkinsFiles/testDemo")
        }
    }
}