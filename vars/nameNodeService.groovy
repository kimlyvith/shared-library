def call(Map config = [:]){
    sh "echo ${action}"
    sh "ssh ${user}@${ips} docker exec  myhdoop-cluster stop-dfs.sh"
}
