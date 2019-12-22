var JsUlits = function () {
    var that = this;
};

JsUlits = {
        /**
         * 抽取对象集合元素形成新的对象集合，并且根据attr过滤重复元素
         * @param objList
         * @param attrArray
         * @returns {Array}
         */
        extractToList: function (objList, attrArray) {
            var that = this;
            var result = [];
            var filterKey = '';
            for (var i = 0; i < objList.length; i++) {
                var obj = objList[i];
                var newObj = {};
                for (var j = 0; j < attrArray.length; j++) {
                    var key = attrArray[j];
                    var value = obj[key];
                    if (j==0 && value && filterKey.indexOf(value) != -1) {//通过第一个key判断第一个值是否有重复的
                        break;
                    }
                    newObj[key] = value;
                    if(j==0){
                        filterKey += value + "_";
                    }
                }
                if (!that.isEmptyObject(newObj)) {
                    result.push(newObj);
                }

            }
            return result;
        },
        /**
         * 判断一个json对象是否为空
         * @param obj
         * @returns {boolean}
         */
        isEmptyObject: function (obj) {
            var t;
            for (t in obj)
                return false;
            return true;
        },
        /**
         * 获得 echarts init dom 所需要的宽度
         * @returns {*|jQuery}
         */
        getEChartsPanelWidth: function () {
            return $('.tab-content:first').width();
        },
        get:function(url,callack){

            $.ajax({
                type: "GET",
                url: window.ctxPath+url,
                dataType: "json",
                success: function(data){
                    if(data.code==200){
                        callack(data);
                    }else{
                        callack(data);
                    }
                }
            });
        }

};
// module.exports = new JsUlits();

