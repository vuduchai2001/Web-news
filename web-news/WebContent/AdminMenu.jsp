<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="main-container ace-save-state" id="main-container">
			<script type="text/javascript">
				try{ace.settings.loadState('main-container')}catch(e){}
			</script>

			<div id="sidebar" class="sidebar                  responsive                    ace-save-state">
				<script type="text/javascript">
					try{ace.settings.loadState('sidebar')}catch(e){}
				</script>
				<ul class="nav nav-list">
					<li class="">
						<a href="admin-trang-chu">
							<i class="menu-icon fa fa-home"></i>
							<span class="menu-text"> Trang Chủ </span>
						</a>
					</li>
					<li class="">
						<a href="admin-tin-tuc">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> Tin Tức </span>
						</a>
					</li>
					<li class="">
						<a href="admin-phan-hoi">
							<i class="menu-icon fa fa-envelope"></i>
							<span class="menu-text"> Phản Hồi </span>
						</a>
					</li>
					
					
				</ul><!-- /.nav-list -->

				<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
					<i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
				</div>
			</div>