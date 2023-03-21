def call(Map config = [:]){
    sh "ssh ${config.user}@${config.ips} docker exec  ${config.container} ${config.status}-dfs.sh"
}
