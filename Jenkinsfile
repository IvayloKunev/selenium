pipeline {
    agent any
    stages {

    stage ('Testing Stage') {
        steps {
            withMaven(maven : 'Maven') {
                sh 'mvn verify'
            }

        }
    }


    stage ('Stop Docker container') {
            steps {
                withMaven(maven : 'Maven') {
                    sh 'docker stop pedantic_heyrovsk'
                }

            }
        }

    }
}