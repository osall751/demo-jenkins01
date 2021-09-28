node{

  stage('Clone'){
                git  'https://github.com/osall751/demo-jenkins01'
  }
  stage('Test unitaires'){
                  sh 'mvn clean'
  }
  stage('Package'){
                  sh 'mvn package'
  }
}
