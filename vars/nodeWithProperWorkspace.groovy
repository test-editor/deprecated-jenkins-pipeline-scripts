void call(Closure body) {
    node {
        def newWorkspace = pwd().replace("%2F", "_")
        ws(newWorkspace) {
            body.call()
        }
    }
}