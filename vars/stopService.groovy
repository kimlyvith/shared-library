def call(Map config = [:]){
    loadMyScriptDFS(name: 'stop-dfs.sh')
    sh "ssh ${user}@${ips} ./stop-dfs.sh "
}
