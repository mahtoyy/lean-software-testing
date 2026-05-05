pipeline {
    agent any 
    stages {
        stage('Hello') {
            steps {
                sh 'echo "Running on the built-in node!"'
                sh './mvnw test' // This will work because of the socket mount
            }
        }
    }
}