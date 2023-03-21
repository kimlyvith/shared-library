def call(Map config = [:]){
    stopNameNode(name: 'stop-dfs.sh')
    sh "ssh ${user}@${ips} docker exec  myhdoop-cluster stop-dfs.sh"
}
