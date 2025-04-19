const base = {
    get() {
                return {
            url : "http://localhost:8080/ssme547f/",
            name: "ssme547f",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssme547f/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "智慧养老院管理系统"
        } 
    }
}
export default base
