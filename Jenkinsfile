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
        stage('SonarQube') {
            steps {
                sh 'mvn sonar:sonar   -Dsonar.projectKey=org.example:CalculatriceJenkins   -Dsonar.host.url=http://localhost:9000   -Dsonar.login=4e24f894e09b6df75eae4ccb9bf653103eb82605'
            }
        }
    }
    post {
        always {
            emailext attachLog: true,
                body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}",
                to: "paul.aboulinc@gmail.com"
            junit '**/target/surefire-reports/TEST-*.xml'
        }
    }
}