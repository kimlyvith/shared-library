def call(Map config = [:]){
    loadMyScript(name: 'stop-dfs.sh')
    sh "./stop-dfs.sh"
}
