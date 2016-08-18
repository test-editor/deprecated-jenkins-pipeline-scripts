String call(String commands) {
    def outputFile = '.bash-output.txt'
    sh """\
#!/bin/bash
(
    $commands
) > $outputFile
    """ // avoid using trimIndent (sandbox)
    String output = readFile(outputFile)
    sh "rm $outputFile"
    return output
}