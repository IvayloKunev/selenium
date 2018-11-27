pipeline {
    agent any
    stages {

    stage ('Testing Stage') {
        steps {
            withMaven(maven : 'Maven') {
                sh '/Users/Shared/Jenkins/CucumberFramework/deploy.sh'
            }

        }
    }


    stage ('Stop Docker container') {
            steps {
                withMaven(maven : 'Maven') {
                    sh 'mvn --version'
                }

            }
        }

    }
}