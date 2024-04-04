 def call() {
    sh 'ansible-playbook -i /var/lib/jenkins/workspace/inventory  /var/lib/jenkins/workspace/sonar.yaml'
 }
