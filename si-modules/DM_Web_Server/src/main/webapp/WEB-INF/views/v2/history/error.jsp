<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/WEB-INF/views/v2/common/common_head.jsp"%>
    <title>OASIS SI Admin</title>
	<%@ include file="/WEB-INF/views/v2/common/common_js.jsp"%>

	<script src="<c:url value="/v2/js/herit/history.js" />"></script>
	<script src="<c:url value="/v2/js/herit/historyError.js" />"></script>
	<script src="<c:url value="/v2/js/herit/hdb.js" />"></script>

	
    <script type="text/javaScript" language="javascript">
	    var param = ${paramJson};
	    var deviceModelList = ${deviceModelListJson};
	
	    var contextPath = "${pageContext.request.contextPath}";
	    var deviceModel = "";
	    var deviceId = "";
	    var sn = "";
	    var page = "";
    
		$(document).ready(function() {
			if (param['deviceModel'] != null) {
				deviceModel = param['deviceModel'][0];
			}
			if (param['deviceId'] != null) {
				deviceId = param['deviceId'][0];
			}
			if (param['sn'] != null) {
				page = param['sn'][0];
			}
			if (param['page'] != null) {
				page = param['page'][0];
			}
			
			initUI();
			initUI2();
		});

		function initUI() {
			$("#side-menu_history").addClass("active");
			$("#side-menu_history ul").addClass("in");
			$("#side-menu_history ul li:eq(0)").addClass("active");
		}
    
    </script>
</head>
<body>

<div id="wrapper">

	<nav class="navbar-default navbar-static-side" role="navigation">
		<div class="sidebar-collapse">
			<%@ include file="/WEB-INF/views/v2/common/common_sidemenu.jsp"%>
		</div>
	</nav>


	<div id="page-wrapper" class="gray-bg">
		<div class="row border-bottom">
			<%@ include file="/WEB-INF/views/v2/common/common_topbar.jsp"%>
		</div>
		

		<div class="row wrapper border-bottom white-bg page-heading">
			<div class="col-sm-4">
				<h2>장애 이력</h2>
				<ol class="breadcrumb">
					<li><a href="<c:url value="/index.do" />">Home</a></li>
					<li>이력</li>
					<li class="active"><strong>장애 이력</strong></li>
				</ol>
			</div>
		</div>
		
		
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="row">
				<div class="col-lg-12">
					<div class="ibox float-e-margins">
						<div class="ibox-title">
							<h3 class="no-margins">상태 이력</h3>
						</div>
						<div class="ibox-content">
							<div class="row">
								<div class="col-sm-12">
									<label class="form-inline">
										디바이스 모델&nbsp;
										<select name="deviceModel" id="search_deviceModelId" value="${param.deviceModel}" class="form-control input-sm">
											<option value="">선택</option>
											<c:forEach items="${deviceModelList}" var="deviceModel">
												<option value="${deviceModel.oui}|${deviceModel.modelName}"														
												<c:if test="${fn:contains(param.deviceModel, deviceModel.modelName)}">selected</c:if>
												>${deviceModel.manufacturer}-${deviceModel.modelName}
												</option>
											</c:forEach>			
										</select>
										&nbsp; &nbsp; &nbsp; &nbsp; 
										시리얼번호&nbsp;
										<div class="input-group">
											<input type="text" name="sn" id="search_sn" value="<c:out value="${param.sn}" />" class="input-sm form-control" placeholder="시리얼번호" />
											<span class="input-group-btn">
												<button type="button" id="btnSearchDevice" class="btn btn-sm btn-primary" > 검색</button>
											</span>
										</div>
									</label>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12 m-b-xs">
									<label class="form-inline">
										디바이스&nbsp;
										<div class="input-group" style="margin-left: 29px;">
											<select name="device" id="search_deviceId" class="form-control input-sm" style="min-width:260px;">
												<option value="">선택</option>
											</select>
											<span class="input-group-btn">
												<button type="button" id="btnSearchHistory" class="btn btn-sm btn-primary"> 장애이력 검색</button>
											</span>
										</div>
									</label>
								</div>
							</div>
							
							<div>&nbsp;</div>

							<table class="table table-bordered table-hover" id="history_table">
								<thead>
									<tr>
										<th id="hd_modelName">모델번호</th>
										<th id="hd_deviceId">디바이스ID</th>
										<th id="hd_sn">SN</th>
										<th id="hd_errorCode">에러코드</th>
										<th id="hd_errorGrade" class="history_manual_renderer">장애등급</th>
										<th id="hd_errorData">에러데이타</th>
										<th id="hd_errorTime">에러발생시간</th>
										<th id="hd_resourceUri">URI</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td colspan="8">디바이스를 선택한 후 장애이력을 검색하세요.</td>
									</tr>
								</tbody>
							</table>
							
							<div class="row">
								<div class="col-sm-12 text-center">
									<div class="dataTables_paginate paging_simple_numbers">
										<ul class="pagination paging_wrap"></ul>
									</div>
								</div>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		</div>
		
		
		<div class="footer">
			<%@ include file="/WEB-INF/views/v2/common/common_footer.jsp"%>
		</div>
	</div>
</div>

</body>

</html>
