def call(Map config = [:]){
    sh "echo ${config.status}"
    sh "ssh ${config.user}@${config.ips} docker exec  myhdoop-cluster ${config.status}-dfs.sh"
}
