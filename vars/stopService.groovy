def call(Map config = [:]){
    stopNameNode(name: 'stop-dfs.sh')
    sh "ssh ${user}@${ips} ./stop-dfs.sh "
}
