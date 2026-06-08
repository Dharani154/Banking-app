pipeline {

    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/yourrepo/banking-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t banking-app:v1 .'
            }
        }

        stage('Deploy') {
            steps {

                sh '''
                docker rm -f banking-app || true

                docker run -d \
                --name banking-app \
                banking-app:v1
                '''
            }
        }
    }
}
