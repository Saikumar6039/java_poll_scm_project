pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/Saikumar6039/java_poll_scm_project.git'
            }
        }
        stage('Build') {
            steps {
                sh '''
                if [ ! -d "src" ]; then
                    mkdir src
                else
                    echo "src directory already exists. Skipping mkdir."
                fi
                echo "Compiling Java files..."
                javac src/*.java
                echo "Running Main class..."
                echo "Starting Application..."
                java -cp src Main
                '''
            }
        }
        stage('Test') {
            steps {
                sh '''
                echo "Running tests... (placeholder)"
                [ -f data/input.txt ] && echo "Test passed: input.txt exists" || echo "Test failed: input.txt missing"
                '''
            }
        }
    }
}
