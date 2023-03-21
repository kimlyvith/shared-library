def call(Map config = [:]){
    sh "ssh ${user}@${ips} docker exec  myhdoop-cluster stop-dfs.sh"
}
