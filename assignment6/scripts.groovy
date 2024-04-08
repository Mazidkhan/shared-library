@Library('sharedlibrary') _
pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                clone 'https://github.com/Mazidkhan/shared-library.git'
            }
        }
        stage('User Approval') {
            steps {
                approval()
            }
        }
        stage('Playbook Execution') {
            steps {
                playbook()
            }
        }
        stage('Send Notification') {
            steps {
                script {
                    def configFilePath = '/var/lib/jenkins/workspace/config.properties'
                    slacksend(configFilePath)
                }
            }
        }
    }
}