pipeline {
    agent any
    stages {
        stage('Deploy Docker container') {
            steps {
                withMaven(maven: 'Maven') {
                    sh '/usr/local/bin/docker run -d -p 4444:4444 -p 5900:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome-debug:3.141.59-bismuth'
                }

            }

        }

        stage('Stop Docker container') {
            steps {
                withMaven(maven: 'Maven') {
                    sh 'container=$(docker ps --format "{{.Names}}")'
                    sh '/usr/local/bin/docker stop $container'

                }

            }

        }

    }


}