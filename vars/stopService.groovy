def call(Map config = [:]){
    sh "ssh ${user}@${ips} docker exec  $container_name ${action}-dfs.sh"
}
