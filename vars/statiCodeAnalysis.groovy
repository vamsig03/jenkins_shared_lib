def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
        sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.10.0.2594:sonar'
    }
}
