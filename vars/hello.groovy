@Libraries("shared_library") _
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                scripts{
                    hello()
                }
            }
    
        }
        stage('hello') {
            steps {
                echo "hello"
            }
        }
    }
}
