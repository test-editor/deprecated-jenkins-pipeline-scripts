String call(String commands) {
    def outputFile = '.bash-output.txt'
    sh """\
        #!/bin/bash
        (
            $commands
        ) > $outputFile
    """.trimIndent()
    String output = readFile(outputFile)
    sh "rm $outputFile"
    return output
}