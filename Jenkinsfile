pipeline {
  agent any
  stages {
    stage('Tests Unitaires') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Package') {
      steps {
        sh 'mvn package'
      }
    }

  }
}