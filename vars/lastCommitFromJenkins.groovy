boolean call() {
    def lastCommitAuthor = bash('git log --pretty=format:"%an" -1').trim()
    return lastCommitAuthor.toLowerCase() == 'jenkins'
}