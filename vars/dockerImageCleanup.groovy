
def call(String project, String ImageTag, String hubUser) {
    sh """
        docker rmi ${hubUser}/${project}:${ImageTag}
    """
}
