pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh '''
                # Check if Java files exist in src/ or at the root
                if [ -n "$(ls src/*.java 2>/dev/null)" ]; then
                    echo "Java files found in src/ directory."
                    javac src/*.java
                    echo "Running Main class from src/..."
                    java -cp src Main
                elif [ -n "$(ls *.java 2>/dev/null)" ]; then
                    echo "Java files found at root directory."
                    javac *.java
                    echo "Running Main class from root..."
                    java Main
                else
                    echo "No Java files found in src/ or root directory. Failing the build."
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
