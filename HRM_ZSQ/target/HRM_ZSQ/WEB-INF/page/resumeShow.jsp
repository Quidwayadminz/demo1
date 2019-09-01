<%@ page import="cn.zsq.model.Recruitment" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>$</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="resume/css/resumeshow.css">
    <script src="js/jquery.min.js"></script>
    <script src="resume/js/area.js"></script>
    <script src="resume/js/select.js"></script>
    <script src="resume/js/updateresume.js"></script>
</head>
<body>
<div>
    <div>
        <table class="join_zp" cellpadding="0" cellspacing="0">
            <tr>
                <td colspan="4"><a href="ResumeController/addResumeShow.do">添加</a></td>
                <td colspan="5"><a href="RecruitmentController/recruitmentShow.do">返回</a></td>
            </tr>
            <tr class="join_zp_t">
                <td>姓名</td>
                <td>性别</td>
                <td>出生日期</td>
                <td>户口所在地</td>
                <td>现住地址</td>
                <td>手机号码</td>
                <td>邮箱</td>
                <td>婚姻状况</td>
                <td>学历</td>
                <th colspan="3">操作</th>
            </tr>
            <tbody class="join_con">
            <c:forEach items="#{requestScope.list}" var="i" end="${requestScope.list.size()}" begin="0">
                <tr class="join_zp_c">
                    <td>${i.rName}</td>
                    <td>${i.rSex}</td>
                    <td>${i.rBirthdate}</td>
                    <td>${i.rDomicilePlace}</td>
                    <td>${i.rCurrentAddress}</td>
                    <td>${i.rPhoneNumber}</td>
                    <td>${i.rEmail}</td>
                    <td><c:if test="${i.rMaritalStatus eq 1}">
                          <c:out value="已婚"/>
                        </c:if>
                        <c:if test="${i.rMaritalStatus eq 2}">
                            <c:out value="未婚"/>
                        </c:if>
                    </td>
                    <td>${i.rEducationName}</td>
                    <td >
                        <input type="button" value="删除" onclick="deleteResume(${i.rId})">
                    </td>
                    <td>
                        <input type="button" value="修改" onclick="updateResume('${i.rId}','${i.rName}','${i.rSex}'
                                ,'${i.rBirthdate}','${i.rDomicilePlace}','${i.rCurrentAddress}','${i.rPhoneNumber}','${i.rEmail}'
                                ,'${i.rMaritalStatus}','${i.rEducationName}','${i.rWorkexperience}','${i.rProfessionalskill}')">
                    </td>
                    <td>
                        <%
                           Recruitment recruitment = (Recruitment) request.getAttribute("recruitment");
                           if(recruitment!=null){
                               %>
                        <input type="button" value="简历投递"onclick="">
                                <%
                           }
                        %>

                    </td>
                </tr>
                <tr class="join_zp_n">
                    <td colspan="12">
                        <div class="join_ms"><i></i>工作经验</div>
                        <div class="join_cn">
                            <p>${i.rWorkexperience}</p>
                        </div>
                        <div class="join_ms"><i></i>专业技能</div>
                        <div class="join_cn">
                            <p>${i.rProfessionalskill}</p>
                        </div>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div>
        <div id="personal" style="display: none">
            <h5>个人信息<span style="color: red">必填</span></h5>
            <input type="hidden" name="rId"/>
            <div>
                <span>姓名</span><input type="text" name="rName" onblur="rNameVerify(this.value)"></div>
            <span style="color: red" id="rNameHint"></span>
            <div  id="sexdiv">
                <span>性别</span>
                <input type="radio" value="男" name="rSex12" checked>
                男<input type="radio" value="女" name="rSex12" >
                女
            </div>
            <div>
                <span>出生日期</span>
                <input type="date" name="rBirthdate" onblur="rBirthdateVerify(this.value)">
                <span style="color: red" id="rBirthdateHint"></span>
            </div>
            <div id="XbjPmpEEbraunZH">
                <span>户口所在地</span>
                <select id="bookprovinceselect" name="provinceselect" onchange="provincechange(this)">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <select id="bookcityselect" name="cityselect" onchange="citychange(this)">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <select id="bookcountyselect" name="countyselect">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <span style="color: red" id="XbjPmpEEbraunZHHint"></span>
            </div>
            <div id="nowlives">
                <span>现居住城市</span>
                <select id="nowprovinceselect" name="provinceselect" onchange="provincechange(this)">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <select id="nowcityselect" name="cityselect" onchange="citychange(this)">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <select id="nowcountyselect">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <span style="color: red" id="nowlivesHint"></span>
            </div>
            <div>
                <span>手机号码</span>
                <input type="text" name="rPhoneNumber" onblur="rPhoneNumberVerify(this.value)"/>
                <span style="color:red" id="rPhoneNumberHint"></span>
            </div>
            <div>
                <span>婚姻状况</span>
                <input type="radio" value="1" name="rMaritalStatus" checked>
                已婚<input type="radio" value="2" name="rMaritalStatus"  >
                未婚
                <span style="color: red" id="rMaritalStatusHint"></span>
            </div>
            <div>
                <span>电子邮箱</span>
                <input type="text" name="rEmail" onblur="rEmailVerify(this.value)">
                <span style="color: red" id="rEmailHint"></span>
            </div>
            <div>
                <span>学历</span>
                <select name="rEducationName">
                    <option name="rEducationNameop"  value="初中" >初中</option>
                    <option name="rEducationNameop"  value="高中">高中</option>
                    <option name="rEducationNameop"  value="大专">大专</option>
                    <option name="rEducationNameop"  value="本科">本科</option>
                    <option name="rEducationNameop"  value="硕士">硕士</option>
                    <option name="rEducationNameop"  value="博士">博士</option>
                </select>
                <span style="color: red" id="rEducationNameHint"></span>
            </div>
            <div>
                <span>工作经验</span>
                <textarea rows="3" cols="30" name="rWorkexperience" onblur="rWorkexperienceVerify(this.value)"></textarea>
                <span style="color: red" id="rWorkexperienceHint"></span>
            </div>
            <div>
                <span>专业技能</span>
                <textarea rows="3" cols="30" name="rProfessionalskill" onblur="rProfessionalskillVerify(this.value)"></textarea>
                <span style="color: red" id="rProfessionalskillHint"></span>
            </div>
            <div>
                <input type="button" value="提交" onclick="updateResumetijiao()">
            </div>
        </div>
    </div>
</div>
    <script src="js/recruit/index.js"></script>

</body>
</html>

