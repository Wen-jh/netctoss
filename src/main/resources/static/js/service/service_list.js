let vm=new Vue({
    el:'#main',
    data:{
        pageInfo:{},
        params: {
            osUsername:'',
            unixHost:'',
            accountIdcardNo:'',
            accountStatus:''
        }
    },
    methods:{
        selectPage:function (pageNum,pageSize) {
            axios({
                url:`selectPage/${pageNum}/${pageSize}`,
                params:this.params
            }).then(response=>{
                this.pageInfo=response.data.obj;
            })
        },
        toServiceModi:function (id) {
            layer.obj=id;
            layer.message='';
            layer.open({
                type:2,
                title:false,
                area:['80%','80%'],
                content:'toServiceModi',
                end: ()=>{
                    if (layer.message!=''){
                        layer.msg("更新成功，更新记录数:"+layer.message);
                        this.selectPage(1,5)
                    }
                }
            })
        },
        deleteAccount:function () {

        },
        setState:function (id) {
            axios({
                url:`setState/${id}`
            }).then(response=>{
                this.msg
            });
            this.selectPage(1,5);
        },
        toServiceDetail:function (id) {
            layer.obj=id;
            layer.message='';
            layer.open({
                type:2,
                title:false,
                area:['80%','80%'],
                content:'toServiceDetail',
                end: ()=>{
                    if (layer.message!=''){
                        layer.msg("更新成功，更新记录数:"+layer.message);
                        this.selectPage(1,5)
                    }
                }
            })
        },
        termSelect:function () {
            this.selectPage(1,this.pageInfo.pageSize);
        }
    },
    created:function () {
        this.selectPage(1,5);
    }
})