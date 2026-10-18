
def call(String project, String ImageTag, String hubUser) {
    withCredentials([usernamePassword(
        credentialsId: "docker",
        usernameVariable: "USER",
        passwordVariable: "PASS"
    )]) {
        sh '''
            set +x
            printf '%s' "$PASS" | docker login -u "$USER" --password-stdin
        '''
    }

    sh "docker image push ${hubUser}/${project}:${ImageTag}"
}
