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

    stage('Fin Process') {
      steps {
        echo 'Fin du processus'
      }
    }

  }
}