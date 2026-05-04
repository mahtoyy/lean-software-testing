pipeline {
    agent any 
    stages {
        stage('Hello') {
            steps {
                sh 'echo "Running on the built-in node!"'
                sh 'docker --version' // This will work because of the socket mount
            }
        }
    }
}