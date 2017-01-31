boolean call() {
    def versionPattern = /v\d+.\d+(.\d+)?(\^0)?/
    def tag = bash('git name-rev --name-only --tags HEAD').trim()
    return tag ==~ versionPattern
}
