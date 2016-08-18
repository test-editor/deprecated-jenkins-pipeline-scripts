void call(List envVars = [], def body) {
    String jdkTool = tool name: 'jdk8', type: 'hudson.model.JDK'
    String mvnTool = tool name: 'Maven 3.2.5', type: 'hudson.tasks.Maven$MavenInstallation'
    List mvnEnv = [
        "PATH+JDK=${jdkTool}/bin",
        "JAVA_HOME=${jdkTool}",
        "PATH+MVN=${mvnTool}/bin",
        "MAVEN_HOME=${mvnTool}"
    ]
    mvnEnv.addAll(envVars)
    withEnv(mvnEnv) {
        body.call()
    }
}