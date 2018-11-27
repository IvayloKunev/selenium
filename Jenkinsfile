pipeline {
    agent any
    stages {
    stage ('Deploy Docker container') {
        steps {
            withMaven(maven : 'Maven') {
                sh 'jenkins$ docker run -d -p 4444:4444 -p 5900:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome-debug:3.141.59-bismuth'
        }

    }

    }

    stage ('Testing Stage') {
        steps {
            withMaven(maven : 'Maven') {
                sh 'mvn verify'
            }

        }
    }


    stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'Maven') {
                    sh 'docker stop pedantic_heyrovsk'
                }

            }
        }

    }
}