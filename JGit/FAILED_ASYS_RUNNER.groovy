
//
// Job Parameters
//
String folderName = "feat-i-cw-atlas1-Tests"
String jobName = folderName + '/FAILED_ASYS_RUNNER';
String prjName = "ipta";
def testBrowser=["chrome_66_239", "chrome_64_235", "phantomjs", "firefox", "chrome", "chrome_64_236"]
String repoName = "jenkins-runners";
String namespace = "feat-i-cw-atlas1"

// ###################################################################
// ####### EDITING BELOW HERE WILL BREAK THE JOB #####################
// ###################################################################
folder(folderName)

//
// Build Job
//
pipelineJob(jobName) {
    parameters{
        stringParam('BRANCH','master','Branch or tag of tests to run');
        choiceParam('TESTBROWSER',testBrowser,'Browser to run test');
        booleanParam('WARMUP', false, 'Run an initial job before the main runner');
        choiceParam('NAMESPACE',[namespace],'Namespace to run test');

    }
    definition{
        cpsScm{
            scm{
                git {
                    remote{
                        url "ssh://git@bitbucket.ipttools.info/${prjName}/${repoName}.git"
                        credentials('b3f71829-edcd-46c6-b83f-59b98eb9695d');
                    }
                    branch("master")
                }
            }
            scriptPath("caseworking/ATLAS1_FAILURE_CUSTOM_RUNNER")
        }
    }

}

