node('master') {
    stage 'checkout'
    checkout scm
    
    stage "push to jenkins"
    sh "git push ssh://jenkins@localhost:4012/workflowLibs.git '+refs/remotes/origin/*:refs/heads/*'"
}