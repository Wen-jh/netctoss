let vm=new Vue({
    el:'#report_main',
    data:{
        pageInfo:{},
        pageInfoUnix:{},
        pageInfoBill:{},
        datalist:true,
        datalist1:false,
        datalist2:false
    },
    methods:{
        selectPage:function (pageNum,pageSize) {
            axios({
                url:`selectPage/${pageNum}/${pageSize}`,
            }).then(response=>{
                this.pageInfo=response.data.obj;
            })
        },
        selectUnix:function (pageNum,pageSize) {
            axios({
                url:`selectUnix/${pageNum}/${pageSize}`,
            }).then(response=>{
                this.pageInfoUnix=response.data.obj;
            })
        },
        toSelectUnix:function () {
            this.datalist=false;
            this.datalist1=true;
            this.datalist2=false;
            this.selectUnix(1,5);
        },
        selectBill:function (pageNum,pageSize) {
            axios({
                url:`selectBill/${pageNum}/${pageSize}`
            }).then(response=>{
                this.pageInfoBill=response.data.obj;
            })
        },
        toSelectBill:function () {
            this.datalist=false;
            this.datalist1=false;
            this.datalist2=true;
            this.selectBill(1,5);
        },
        toSelectPage:function () {
            this.datalist=true;
            this.datalist1=false;
            this.datalist2=false;
            this.selectPage(1,5);
        }
    },
    created:function () {
        this.selectPage(1,5);
    }
});