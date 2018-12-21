pipeline {
    agent any
    stages {
        stage('Deploy Docker container') {
            steps {
                withMaven(maven: 'Maven') {
                    sh '/usr/local/bin/docker run --name nginx1 -d -p 4444:4444 -p 5900:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome-debug:3.141.59-bismuth'
                }

            }

        }

        stage('Running UI tests') {
            steps {
                withMaven(maven: 'Maven') {
                    sh 'mvn verify'
                }

            }

        }

        stage('Shutdown Docker container') {
            steps {
                withMaven(maven: 'Maven') {
                    sh '/usr/local/bin/docker stop nginx1'
                    sh '/usr/local/bin/docker rm nginx1'


                }

            }

        }

    }


}