pipeline {
    agent any
    stages {
        stage('Jenkins Sport') {
            steps {
                echo 'Sport interface'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}