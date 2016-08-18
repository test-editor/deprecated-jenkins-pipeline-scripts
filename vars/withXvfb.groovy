void call(Closure body) {
    // TODO why do we have more than one installation on our Jenkins? If we had one we wouldn't need to specify the installationName
    wrap([$class: 'Xvfb', installationName: 'System', timeout: 2, screen: '1024x768x24', displayNameOffset: 1, autoDisplayName: true], body)
}