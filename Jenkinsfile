pipeline {
    
    agent any
    
    tools {
        maven "maven"
    }
    
    stages {
        
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
    }
    
    post {
        failure {
            discordSend webhookURL: "https://discord.com/api/webhooks/912266527473041429/huBNSPUrbzDPbJPbWsSkBz_FXl-gzc4Q9-cAJ8m79EpOkSwH400OSyeJljE-vPcgTvpY", description: "Jenkins Pipeline Build", footer: "Build Failed", link: env.BUILD_URL, result: currentBuild.currentResult, title: JOB_NAME
        }
        success {
            discordSend webhookURL: "https://discord.com/api/webhooks/912266527473041429/huBNSPUrbzDPbJPbWsSkBz_FXl-gzc4Q9-cAJ8m79EpOkSwH400OSyeJljE-vPcgTvpY", description: "Jenkins Pipeline Build", footer: "Build Success", link: env.BUILD_URL, result: currentBuild.currentResult, title: JOB_NAME
        }
    }
}
