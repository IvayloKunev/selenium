pipeline {
    agent ant
    stages {
    stage ('Compile stage') {
        steps {
            withMaven(maven : 'Maven') {
                sh 'mvn verify'
        }

    }

    }

    stage ('Testing Stage') {
        steps {
            withMaven(maven : 'Maven') {
                sh 'mvn --version'
            }

        }
    }


    stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'Maven') {
                    sh 'mvn deploy'
                }

            }
        }

    }
}