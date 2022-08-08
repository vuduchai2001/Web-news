<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>Tables - Ace Admin</title>
<jsp:useBean id="a" class="Connect.newsDao" scope="request"></jsp:useBean>
<meta name="description" content="Static &amp; Dynamic Tables" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="assets/font-awesome/4.5.0/css/font-awesome.min.css" />

<!-- page specific plugin styles -->

<!-- text fonts -->
<link rel="stylesheet" href="assets/css/fonts.googleapis.com.css" />

<!-- ace styles -->
<link rel="stylesheet" href="assets/css/ace.min.css"
	class="ace-main-stylesheet" id="main-ace-style" />

<!--[if lte IE 9]>
			<link rel="stylesheet" href="assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
		<![endif]-->
<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />

<!--[if lte IE 9]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->
<script src="assets/js/ace-extra.min.js"></script>

<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

<!--[if lte IE 8]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
</head>

<body class="no-skin">
	<%@ include file="AdminHeader.jsp"%>
	<%@ include file="AdminMenu.jsp"%>
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state" id="breadcrumbs">
				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
							Chủ</a></li>


					<li class="active">Tin Tức</li>
				</ul>
				<!-- /.breadcrumb -->

			</div>

			<div class="page-content">
				<div class="page-header">
					<h1>
						Tables <small> <i
							class="ace-icon fa fa-angle-double-right"></i> Trang <%=request.getAttribute("idx")%>
						</small>
					</h1>
				</div>
				<!-- /.page-header -->

				<div class="clearfix">
					<div class="pull-right tableTools-container">
						<div class="dt-buttons btn-overlap btn-group">
							<a class="dt-button buttons-collection buttons-colvis btn btn-white btn-primary btn-bold"
								tabindex="0" aria-controls="dynamic-table"
								data-original-title="" href="them-tin-tuc"><span><i
									class="fa fa-plus"></i> </a>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<table id="simple-table"
									class="table  table-bordered table-hover">
									<thead>
										<tr>
											<th class="detail-col">ID</th>
											<th>Tiêu Đề</th>
											<th>Ảnh Minh Hoạ</th>
											<th>Loại Tin</th>
											<th>Ngày Đăng</th>
											<th></th>
											<th></th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list }" var="i">
											<tr>
												<td class="detail-col">${i.ID }</td>
												<td>${i.caption }</td>
												<td><img src=${i.image } alt="" height="80px"
													width="160px"></td>
												<td>${i.category }</td>
												<td>${i.date }</td>
												<td><a href=""><i class="ace-icon fa fa-eye"></i></a></td>
												<td><a href="sua-tin-tuc?id=${i.ID }"><i class="ace-icon fa fa-pencil"></i></a></td>
												<td><a href="xoa-tin-tuc?id=${i.ID }" onclick="return confirm('Xoá Tin Tức')"><i class="ace-icon fa fa-trash"></i></a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
						<div class="modal-footer no-margin-top">
							<ul class="pagination pull-right no-margin">
								<c:forEach begin="1" end="${a.numberPage }" var="i">
									<li class=""><a href="admin-tin-tuc?index=${i }">${i }</a>
									</li>
								</c:forEach>
							</ul>
						</div>
						<!-- PAGE CONTENT ENDS -->
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.page-content -->
		</div>
	</div>
	<!-- /.main-content -->
	<%@ include file="AdminFooter.jsp"%>
	<!-- basic scripts -->

	<!--[if !IE]> -->
	<script src="assets/js/jquery-2.1.4.min.js"></script>

	<!-- <![endif]-->

	<!--[if IE]>
<script src="assets/js/jquery-1.11.3.min.js"></script>
<![endif]-->
	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script src="assets/js/bootstrap.min.js"></script>

	<!-- page specific plugin scripts -->

	<!-- ace scripts -->
	<script src="assets/js/ace-elements.min.js"></script>
	<script src="assets/js/ace.min.js"></script>

	<!-- inline scripts related to this page -->
</body>
</html>
