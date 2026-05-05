pipeline {
    agent any
        tools {
            // This matches the name you gave Maven in 'Global Tool Configuration'
            maven 'maven3'
        }
        stages {
            stage('Build & Test') {
                steps {
                    sh "./mvnw clean test -Dspring.profiles.active=test"
                }
            }
        }
}