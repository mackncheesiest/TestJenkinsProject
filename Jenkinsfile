pipeline {
  agent any 
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('celebrate') {
      steps {
        echo 'Hooray! We did it!'
      }
    }
  }
}
