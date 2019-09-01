function zk(){
	var join_zp_c = document.querySelectorAll(".join_zp_c");
	var join_zp_n = document.querySelectorAll(".join_zp_n");
	var join_zp_length = join_zp_c.length;
	for(var i=0;i<join_zp_length;i++){
		join_zp_c[i].index = i;
		join_zp_c[i].onclick = function(){
			var isf = join_zp_n[this.index].className;
			if(isf == 'join_zp_n join_active'){
				join_zp_n[this.index].className = 'join_zp_n';
			}else{
				for(var i=0;i<join_zp_length;i++){
					join_zp_n[i].className = 'join_zp_n';
				}
				join_zp_n[this.index].className = 'join_zp_n join_active';
			}
		}
	}
}
zk();

function deleteResume(id) {
    if(confirm('确定要删除吗')==true){
        $.post("ResumeController/removeResume.do","id="+id,function (obj) {
                if(obj=='ok'){
                    location.reload();
                }else{
                    alert(obj);
                }
        });
    }
}
function updateResume(id,rName,rSex,rBirthdate,rDomicilePlace,rCurrentAddress,rPhoneNumber,
                      rEmail,rMaritalStatus,rEducationName,rWorkexperience,rProfessionalskill) {
	var div = $("#personal")[0];
	if(div.style.display=='none'){
		$("#personal input[name='rId']").val(id);
        var rName = $("input[name='rName']").val(rName);
        var rBirthdate = $("input[name='rBirthdate']").val(rBirthdate);
        var rPhoneNumber = $("input[name='rPhoneNumber']").val(rPhoneNumber);
        var rEmail = $("input[name='rEmail']").val(rEmail);
        var rWorkexperience = $("textarea[name='rWorkexperience']").val(rWorkexperience);
        var rProfessionalskill = $("textarea[name='rProfessionalskill']").val(rProfessionalskill);
        var rEducationNames = $("option[name='rEducationNameop']");
        for(var i =0;i<rEducationNames.length;i++){
        	if(rEducationNames[i].value==rEducationName){
        		$(rEducationNames[i]).attr('selected','selected');
			}
		}
		var rpprovince = rDomicilePlace.substr(0,rDomicilePlace.indexOf('-'));
		var rpcity = rDomicilePlace.substr(rDomicilePlace.indexOf('-')+1,
			(rDomicilePlace.lastIndexOf('-')-(rDomicilePlace.indexOf('-')+1)));
		var rpcounty = rDomicilePlace.substr(rDomicilePlace.lastIndexOf('-')+1,rDomicilePlace.length-(rDomicilePlace.lastIndexOf('-')+1));
        var raprovince = rCurrentAddress.substr(0,rCurrentAddress.indexOf('-'))
        var racity = rCurrentAddress.substr(rCurrentAddress.indexOf('-')+1,
            (rCurrentAddress.lastIndexOf('-')-(rCurrentAddress.indexOf('-')+1)));
        var racounty = rCurrentAddress.substr(rCurrentAddress.lastIndexOf('-')+1,rCurrentAddress.length-(rCurrentAddress.lastIndexOf('-')+1));
        var provinceselect1 = $("#bookprovinceselect option:selected").val(rpprovince);
      	var cityselect1 = $("#bookcityselect option:selected").val(rpcity);
        var countyselect1 = $("#bookcountyselect option:selected").val(rpcounty);
        var provinceselect2 = $("#nowprovinceselect option:selected").val(raprovince);
        var cityselect2 = $("#nowcityselect option:selected").val(racity);
        var countyselect2 = $("#nowcountyselect option:selected").val(racounty);
        provinceselect1.text(rpprovince);
        cityselect1.text(rpcity);
        countyselect1.text(rpcounty);
        provinceselect2.text(raprovince);
        cityselect2.text(racity);
        countyselect2.text(racounty);
        div.style.display='block';
	}else{
        div.style.display='none';
	}

}