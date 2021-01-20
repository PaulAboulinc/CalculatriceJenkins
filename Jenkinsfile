pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            emailext attachLog: true
            junit '**/target/surefire-reports/TEST-*.xml'
        }
    }
}