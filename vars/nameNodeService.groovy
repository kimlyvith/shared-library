def call(Map config = [:]){
    sh "ssh ${user}@${ips} docker exec  myhdoop-cluster ${action}-dfs.sh"
}
