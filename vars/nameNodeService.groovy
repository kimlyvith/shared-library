def call(Map config = [:]){
    sh "ssh ${user}@${ips} docker exec  myhadoop-cluster ${action}-dfs.sh"
}
