let vm = new Vue({
    el:'#main',  //替换管理范围
    data:{
        service:{
            id:'' //初始化id属性
        }
    },
    methods:{
        selectOne:function () {
            axios({
                url:`selectOne/${this.service.id}`
            }).then(response=>{
                this.service = response.data.obj;
            })
        },
        doUpdate:function () {
            axios({
                url:'doUpdate',
                method:'PUT',
                data:this.service
            }).then(response=>{
                // layer.msg("更新成功")
                /**
                 * 更新失败，提示失败信息，不关闭窗口
                 * 更新成功，关闭子窗口  在父窗口弹出提示信息
                 */
                if(response.data.success){
                    // layer.msg(response.data.msg);
                    parent.layer.message=response.data.obj;//将返回信息传递给父窗口
                    let index = parent.layer.getFrameIndex(window.name); //获取窗口索引
                    parent.layer.close(index);//通过父窗口layer对象关闭子窗口
                }else{
                    layer.msg(response.data.msg);
                }
            }).catch(error=>{
                layer.msg(error)
            })
        }
    },
    created:function () {
        //parent 自动传入的父窗口对象
        //从父窗口的layer对象中获取传递值id赋值到当前update窗口的vue对象中
        this.service.id = parent.layer.obj;
        this.selectOne();
    }
})