void call(String argument) {
    sh "mvn $argument -B -V"
}