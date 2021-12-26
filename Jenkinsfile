pipeline {
    agent { docker { image 'maven:latest' } }
    stages {
        stage('Compile') {
            steps {
                sh 'mvn clean compile -e'
            }
        }
         stage('Test') {
            steps {
                sh 'mvn clean test -e'
            }
        }
        stage('Jar Code') {
            steps {
                sh 'mvn clean package -e'
            }
        }
        stage('Run') {
            steps {
                sh 'mvn spring-boot:run'
            }
        }
    }
}