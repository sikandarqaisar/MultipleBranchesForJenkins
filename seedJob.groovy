pipelineJob('Maven-DSL-job') {
    definition {
    triggers {
        githubPush()
    }      
        cpsScm {
            scm {
                git('https://github.com/sikandarqaisar/mavenApp.git')
            }
        }
    }
}

