let vm = new Vue({
    el:'#main',  //替换管理范围
    data:{
         service:{
            id:'' //初始化id属性
        }
    },
    methods:{
        selectServiceById:function () {
            axios({
                url:`selectServiceById/${this.service.id}`
            }).then(response=>{
                this.service = response.data.obj;
            })
        }
    },
    created:function () {
        //parent 自动传入的父窗口对象
        //从父窗口的layer对象中获取传递值id赋值到当前update窗口的vue对象中
        this.service.id = parent.layer.obj;
        this.selectServiceById();
    }
})