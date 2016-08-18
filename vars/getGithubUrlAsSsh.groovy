String call() {
    return getGitUrl().replace("https://github.com/", "git@github.com:")
}