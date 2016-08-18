void call(String codecovCredentialsId) {
    withEnv(["ghprbPullId=${env.CHANGE_ID}", "GIT_BRANCH=${env.BRANCH_NAME}"]) {
        withCredentials([[$class: 'StringBinding', credentialsId: codecovCredentialsId, variable: 'CODECOV_TOKEN']]) {
            sh """\
                #!/bin/bash
                bash <(curl -s https://codecov.io/bash) || echo "Codecov did not collect coverage reports"
            """.stripIndent()
        }
    }
}
