def call(Map config = [:]){
    sh "echo ${dd}"
    sh "ssh ${user}@${ips} docker exec  myhdoop-cluster stop-dfs.sh"
}
