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

        stage('Running UI tests') {
            steps {
                withMaven(maven: 'Maven') {
                    sh 'mvn verify'
                    //sh 'container=$(docker ps --format "{{.Names}}")'
                    //sh 'echo $container'
                    //sh '/usr/local/bin/docker stop $container'

                }

            }

        }

        stage('Shutdown Docker container') {
            steps {
                withMaven(maven: 'Maven') {
                    sh '/usr/local/bin/docker stop $(docker ps -a -q)'


                }

            }

        }

    }


}