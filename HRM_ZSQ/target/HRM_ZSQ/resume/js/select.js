$(function () {
   var select = $("select[name='provinceselect']");
    for(var i= 0;i<provinceList.length;i++){
        select.append("<option name='"+i+"' value='"+provinceList[i].name+"'>" +
            ""+provinceList[i].name+"</option>");
    }
});
function provincechange(provinceselect) {
    var index = provinceselect.selectedIndex;
    var val =  provinceselect.options[index];
    var j =  val.getAttribute("name");
    var select = provinceselect.nextElementSibling;
    var select2 =provinceselect.nextElementSibling.nextElementSibling;
    $(select).empty();
    $(select2).empty();
    var XbjPmpEEbraunZHHint = $("#XbjPmpEEbraunZHHint");
    var nowlivesHint = $("#nowlivesHint");
    if(val.value=="请选择"){
        $(select).append("<option>请选择</option>");
        $(select2).append("<option>请选择</option>");
        if(provinceselect.getAttribute("id")=='bookprovinceselect'){
            XbjPmpEEbraunZHHint.html("请选择户籍所在地！");
        }else{
            nowlivesHint.html("请选择现在住城市！");
        }
    }else{
        for(var i = 0;i<provinceList[j].cityList.length;i++){
            $(select).append("<option name='"+j+","+i+"' value='"+provinceList[j].cityList[i].name+"'>" +
                ""+provinceList[j].cityList[i].name+"</option>");
        }
        for(var i = 0;i<provinceList[j].cityList[0].areaList.length;i++){
            $(select2).append("<option value='"+provinceList[j].cityList[0].areaList[i]+"'>"+
                provinceList[j].cityList[0].areaList[i]+"</option>");
        }
        if(provinceselect.getAttribute("id")=='bookprovinceselect'){
            XbjPmpEEbraunZHHint.html("");
        }else{
            nowlivesHint.html("");
        }
    }
}
function citychange(cityselect) {
    var index = cityselect.selectedIndex;
    var val =  cityselect.options[index];
    var name =  val.getAttribute("name");
    var str = name.indexOf(',');
    var i =  name.substr(0,str);
    var j =  name.substr(str+1,name.length);
    var select2 =cityselect.nextElementSibling;
    $(select2).empty();
    for(var k = 0;k<provinceList[i].cityList[j].areaList.length;k++){
        $(select2).append("<option v alue='"+provinceList[i].cityList[j].areaList[k]+"'>"+
            provinceList[i].cityList[j].areaList[k]+"</option>");
    }
}