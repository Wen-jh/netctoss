let vm=new Vue({
    el:'#account',
    data:{
        pageInfo:{},
        params: {
            accountIdcardNo:"",
            accountRealName:'',
            accountLoginName:'',
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
        termSelect:function () {
            params=this.params;
            this.selectPage(1,this.pageInfo.pageSize);
        },
        setState:function (id) {
            axios({
                url:`setState/${id}`
            }).then(response=>{
                this.msg
            });
            this.selectPage(1,5);
        },
        toAccountModi:function (id) {
            layer.obj=id;
            layer.message='';
            layer.open({
                type:2,
                title:false,
                area:['80%','80%'],
                content:'toAccountModi',
                end: ()=>{
                    if (layer.message!=''){
                        layer.msg("更新成功，更新记录数:"+layer.message);
                        this.selectPage(1,5)
                    }
                }
            })
        },
        deleteAccount:function () {

        }

    },
    created:function () {
        this.selectPage(1,5);
    }
})