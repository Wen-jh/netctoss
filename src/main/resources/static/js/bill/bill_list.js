let vm=new Vue({
    el:'#main',
    data:{
        pageInfo:{},
        params: {
            accountIdcardNo:'',
            accountLoginName:'',
            accountRealName:'',
            billMonth:''
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
        }
    },
    created:function () {
        this.selectPage(1,5);
    }
})