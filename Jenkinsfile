pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh '''
                # Check if Java files exist in app/
                if [ -n "$(ls app/*.java 2>/dev/null)" ]; then
                    echo "Java files found in app/ directory."
                    javac app/*.java
                    echo "Running Main class from app/..."
                    java -cp app Main
                else
                    echo "No Java files found in app/ directory. Failing the build."
                    exit 1
                fi
                '''
            }
        }
        stage('Test') {
            steps {
                sh '''
                echo "Running tests..."
                [ -f data/input.txt ] && echo "Test passed: input.txt exists" || { echo "Test failed: input.txt missing"; exit 1; }
                '''
            }
        }
    }
}
