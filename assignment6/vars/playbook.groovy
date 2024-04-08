 def call() {
    sh 'ansible-playbook -i /var/lib/jenkins/workspace/inventory.ini  /var/lib/jenkins/workspace/nginx.yml'
 }
