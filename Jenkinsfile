pipeline {
    agent any
    tools {
        maven 'mvn'
        jdk 'jdk8'
    }
    stages {
        stage('Inirialize') {
          steps {
              sh '''
                  echo "PATH = ${PATH}"
                  echo "M2_HOME = ${M2_HOME}"
              '''
          }
        }
        stage('Build') {
            steps {
               sh 'mvn clean install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
        stage("build & SonarQube analysis") {
          agent any
          steps {
            withSonarQubeEnv('sonarqube') {
              sh 'mvn clean package sonar:sonar'
            }
          }
        }
    }
}
