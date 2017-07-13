boolean call() {
    def lastCommitAuthor = bash('git log -1 --pretty="%an"').trim()
    println "Last commit by: $lastCommitAuthor"
    return lastCommitAuthor.toLowerCase() == 'jenkins'
}