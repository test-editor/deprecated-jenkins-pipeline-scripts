void call(List envVars = [], Closure body) {
    String jdkTool = tool name: 'jdk8', type: 'hudson.model.JDK'
    List gradleEnv = [
        "PATH+JDK=${jdkTool}/bin",
        "JAVA_HOME=${jdkTool}"
    ]
    gradleEnv.addAll(envVars)
    withEnv(gradleEnv) {
        body.call()
    }
}