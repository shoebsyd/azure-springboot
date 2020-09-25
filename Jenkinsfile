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
               echo 'This is a minimal pipeline.'
            }
        }
    }
}
