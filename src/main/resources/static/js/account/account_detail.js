let vm = new Vue({
    el:'#main',  //替换管理范围
    data:{
        account:{
            id:'' //初始化id属性
        }
    },
    methods:{
        selectAccountById:function () {
            axios({
                url:`selectAccountById/${this.account.id}`
            }).then(response=>{
                this.account = response.data.obj;
            })
        }
    },
    created:function () {
        //parent 自动传入的父窗口对象
        //从父窗口的layer对象中获取传递值id赋值到当前update窗口的vue对象中
        this.account.id = parent.layer.obj;
        this.selectAccountById();
    }
})