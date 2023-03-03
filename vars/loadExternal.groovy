def call(Map config = [:]){
    loadMyScript(name: 'hello.sh')
    sh "./hello.sh ${config.name} ${config.daywork}"
}