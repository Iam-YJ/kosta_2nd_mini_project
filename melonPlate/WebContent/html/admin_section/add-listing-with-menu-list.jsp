<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="Ansonika">
<title>FOOGRA - Admin dashboard</title>
<!-- Favicons-->
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon" type="image/x-icon"
	href="img/apple-touch-icon-57x57-precomposed.png">
<link rel="apple-touch-icon" type="image/x-icon" sizes="72x72"
	href="img/apple-touch-icon-72x72-precomposed.png">
<link rel="apple-touch-icon" type="image/x-icon" sizes="114x114"
	href="img/apple-touch-icon-114x114-precomposed.png">
<link rel="apple-touch-icon" type="image/x-icon" sizes="144x144"
	href="img/apple-touch-icon-144x144-precomposed.png">
<!-- Bootstrap core CSS-->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Main styles -->
<link href="css/admin.css" rel="stylesheet">
<!-- Icon fonts-->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- Plugin styles -->
<link href="vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">
<link href="vendor/dropzone.css" rel="stylesheet">
<link href="css/date_picker.css" rel="stylesheet">
<!-- Your custom styles -->
<link href="css/custom.css" rel="stylesheet">
<!-- WYSIWYG Editor -->
<link rel="stylesheet" href="js/editor/summernote-bs4.css">
</head>

<body class="fixed-nav sticky-footer" id="page-top">
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-default fixed-top"
		id="mainNav">
		<a class="navbar-brand" href="index.jsp"><img src="img/logo.svg"
			data-retina="true" alt="" width="142" height="36"></a>
		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-toggle="collapse" data-target="#navbarResponsive"
			aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			  <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
                    <a class="nav-link" href="index.jsp">
                        <i class="fa fa-fw fa-dashboard"></i>
                        <span class="nav-link-text">Dashboard</span>
                    </a>
                </li>
                
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="My listings">
                    <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMylistings" data-parent="#mylistings">
                        <i class="fa fa-fw fa-list"></i>
                        <span class="nav-link-text">My listings</span>
                    </a>
                    <ul class="sidenav-second-level collapse" id="collapseMylistings">
                        <li>
                            <a href="listings.jsp">Pending <span class="badge badge-pill badge-primary">6</span></a>
                        </li>
                        <li>
                            <a href="listings.jsp">Active <span class="badge badge-pill badge-success">6</span></a>
                        </li>
                        <li>
                            <a href="listings.jsp">Expired <span class="badge badge-pill badge-danger">6</span></a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Reviews">
                    <a class="nav-link" href="reviews.jsp">
                        <i class="fa fa-fw fa-star"></i>
                        <span class="nav-link-text">Reviews</span>
                    </a>
                </li>
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Bookmarks">
                    <a class="nav-link" href="bookmarks.jsp">
                        <i class="fa fa-fw fa-heart"></i>
                        <span class="nav-link-text">Bookmarks</span>
                    </a>
                </li>

                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Add Restaurant">
                    <a class="nav-link" href="add-listing-with-menu-list.jsp">
                        <i class="fa fa-fw fa-plus-circle"></i>
                        <span class="nav-link-text">Add Restaurant</span>
                    </a>
                </li>
                 <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Delete Restaurant">
                    <a class="nav-link" href="deleteResaturant.jsp">
                        <i class="fa fa-fw fa-minus-circle"></i>
                        <span class="nav-link-text">Delete Restaurant</span>
                    </a>
                </li>
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Orders Page">
                    <a class="nav-link" href="orders.jsp">
                        <i class="fa fa-fw fa-shopping-basket"></i>
                        <span class="nav-link-text">Orders Page</span>
                    </a>
                </li>
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Edit Order">
                    <a class="nav-link" href="orders.jsp">
                        <i class="fa fa-fw fa-pencil"></i>
                        <span class="nav-link-text">Edit Order</span>
                    </a>
                </li>
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="My profile">
                    <a class="nav-link" href="user-profile.jsp">
                        <i class="fa fa-fw fa-user"></i>
                        <span class="nav-link-text">My Profile</span>
                    </a>
                </li>
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
                    <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents" data-parent="#Components">
                        <i class="fa fa-fw fa-gear"></i>
                        <span class="nav-link-text">Components</span>
                    </a>
                    <ul class="sidenav-second-level collapse" id="collapseComponents">
                        <li>
                            <a href="charts.jsp">Charts</a>
                        </li>
                        <li>
                            <a href="tables.jsp">Tables</a>
                        </li>
                    </ul>
                </li>
            </ul>
			<ul class="navbar-nav sidenav-toggler">
				<li class="nav-item"><a class="nav-link text-center"
					id="sidenavToggler"> <i class="fa fa-fw fa-angle-left"></i>
				</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle mr-lg-2" id="messagesDropdown"
					href="#" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="fa fa-fw fa-envelope"></i> <span
						class="d-lg-none">Messages <span
							class="badge badge-pill badge-primary">12 New</span>
					</span> <span class="indicator text-primary d-none d-lg-block"> <i
							class="fa fa-fw fa-circle"></i>
					</span>
				</a>
					<div class="dropdown-menu" aria-labelledby="messagesDropdown">
						<h6 class="dropdown-header">New Messages:</h6>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <strong>David
								Miller</strong> <span class="small float-right text-muted">11:21
								AM</span>
							<div class="dropdown-message small">Hey there! This new
								version of SB Admin is pretty awesome! These messages clip off
								when they reach the end of the box so they don't overflow over
								to the sides!</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <strong>Jane Smith</strong>
							<span class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">I was wondering if you
								could meet for an appointment at 3:00 instead of 4:00. Thanks!</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <strong>John Doe</strong> <span
							class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">I've sent the final
								files over to you for review. When you're able to sign off of
								them let me know and we can discuss distribution.</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item small" href="#">View all messages</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle mr-lg-2" id="alertsDropdown"
					href="#" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="fa fa-fw fa-bell"></i> <span
						class="d-lg-none">Alerts <span
							class="badge badge-pill badge-warning">6 New</span>
					</span> <span class="indicator text-warning d-none d-lg-block"> <i
							class="fa fa-fw fa-circle"></i>
					</span>
				</a>
					<div class="dropdown-menu" aria-labelledby="alertsDropdown">
						<h6 class="dropdown-header">New Alerts:</h6>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <span class="text-success">
								<strong> <i class="fa fa-long-arrow-up fa-fw"></i>Status
									Update
							</strong>
						</span> <span class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">This is an automated
								server response message. All systems are online.</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <span class="text-danger">
								<strong> <i class="fa fa-long-arrow-down fa-fw"></i>Status
									Update
							</strong>
						</span> <span class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">This is an automated
								server response message. All systems are online.</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <span class="text-success">
								<strong> <i class="fa fa-long-arrow-up fa-fw"></i>Status
									Update
							</strong>
						</span> <span class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">This is an automated
								server response message. All systems are online.</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item small" href="#">View all alerts</a>
					</div></li>
				<li class="nav-item">
					<form class="form-inline my-2 my-lg-0 mr-lg-2">
						<div class="input-group">
							<input class="form-control search-top" type="text"
								placeholder="Search for..."> <span
								class="input-group-btn">
								<button class="btn btn-primary" type="button">
									<i class="fa fa-search"></i>
								</button>
							</span>
						</div>
					</form>
				</li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					data-target="#exampleModal"><i class="fa fa-fw fa-sign-out"></i>Logout</a>
				</li>
			</ul>
		</div>
	</nav>
	<!-- /Navigation-->
	<div class="content-wrapper">
		<div class="container-fluid">
			<!-- Breadcrumbs-->
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="#">관리자 FORM</a></li>
				<li class="breadcrumb-item active">식당 관리</li>
			</ol>
			<form name="myForm"
				action="../../dispatcher?key=admin&methodName=insertRes"
				method="post">
				<div class="box_general padding_bottom">
					<div class="header_box version_2">
						<h2>
							<i class="fa fa-file"></i>Basic info
						</h2>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<label>식당 이름</label> <input type="text" class="form-control"
									name="resName" placeholder="즐거운 맛 돈까스">
							</div>
						</div>


						<div class="col-md-6">
							<div class="form-group">
								<label>전화 번호</label> <input type="text" class="form-control"
									name="resTel" placeholder="02-111-1111">
							</div>
						</div>


						<div class="col-md-6">
							<div class="form-group" name="resPhoto">
								<label>Photos</label>

							</div>
						</div>




					</div>

				</div>
		</div>
		<!--container-fluid끝  -->

		<!-- /box_general-->
		<div class="box_general padding_bottom">
			<div class="header_box version_2">
				<h2>
					<i class="fa fa-map-marker"></i>Location
				</h2>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label>지역구</label>
						<div class="styled-select">
							<select name="resLoc">
								<option>강남구</option>
								<option>강동구</option>
								<option>강북구</option>
								<option>강서구</option>
								<option>관악구</option>
								<option>광진구</option>
								<option>구로구</option>
								<option>노원구</option>
								<option>도봉구</option>
								<option>동대문구</option>
								<option>동작구</option>
								<option>마포구</option>
								<option>서대문구</option>
								<option>서초구</option>
								<option>성동구</option>
								<option>성북구</option>
								<option>송파구</option>
								<option>양천구</option>
								<option>영등포구</option>
								<option>용산구</option>
								<option>은평구</option>
								<option>종로구</option>
								<option>중구</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<label>상세주소</label> <input type="text" class="form-control"
							name="resLocDetail" placeholder="ex. 신촌로 124">
					</div>
				</div>
			</div>
			<!-- /row-->

			<!-- /row-->
		</div>


		<!-- /box_general-->
		<div class="box_general padding_bottom">
			<div class="header_box version_2">
				<h2>
					<i class="fa fa-list"></i>Add item to Menu List
				</h2>
			</div>
			<div class="wrapper_indent">


				<div class="col-md-6">
					<div class="form-group">

						<label>음식 종류</label>
						<div class="styled-select">
							<select name="resKind">
								<option>한식</option>
								<option>중식</option>
								<option>일식</option>
								<option>양식</option>
								<option>아시안식</option>
								<option>카페</option>
							</select>
						</div>
					</div>
				</div>
			</div>

			<div class="menu-item-section clearfix">
				<h4>Menu item #1</h4>
				<div>
					<a href="#0"><i class="fa fa-plus-circle"></i></a><a href="#0"><i
						class="fa fa-minus-circle"></i></a>
				</div>
			</div>


			<div class="box_general padding_bottom">
				<div class="header_box version_2">
					<h2>
						<i class="fa fa-file"></i>Basic info
					</h2>
				</div>
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<label>메뉴</label> <input type="text" class="form-control"
								name="resMenu">
						</div>
					</div>


					<div class="col-md-6">
						<div class="form-group">
							<label>가격</label> <input type="text" class="form-control"
								name="resPrice">
						</div>
					</div>

				</div>

			</div>
			<!-- /box_general-->
		</div>
	</div>
	<!-- /.container-fluid-->

	</form>
	<!-- /.container-wrapper-->
	<p>
		<a href="#0" class="btn_1 medium"
			onclick="javascript:document.myForm.submit();">Save</a> <a href="#0"
			class="btn_1 medium gray">Add another item</a>
	</p>
	<footer class="sticky-footer">
		<div class="container">
			<div class="text-center">
				<small>Copyright © FOOGRA 2020</small>
			</div>
		</div>
	</footer>
	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fa fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="../../html/index.jsp">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
	<!-- Page level plugin JavaScript-->
	<script src="vendor/chart.js/Chart.min.js"></script>
	<script src="vendor/datatables/jquery.dataTables.js"></script>
	<script src="vendor/datatables/dataTables.bootstrap4.js"></script>
	<script src="vendor/jquery.selectbox-0.2.js"></script>
	<script src="vendor/retina-replace.min.js"></script>
	<script src="vendor/jquery.magnific-popup.min.js"></script>
	<!-- Custom scripts for all pages-->
	<script src="js/admin.js"></script>
	<!-- Custom scripts for this page-->
	<script src="vendor/dropzone.min.js"></script>
	<script src="vendor/bootstrap-datepicker.js"></script>
	<script>
		$('input.date-pick').datepicker();
	</script>
	<!-- WYSIWYG Editor -->
	<script src="js/editor/summernote-bs4.min.js"></script>
	<script>
		$('.editor').summernote(
				{
					fontSizes : [ '10', '14' ],
					toolbar : [
					// [groupName, [list of button]]
					[ 'style', [ 'bold', 'italic', 'underline', 'clear' ] ],
							[ 'font', [ 'strikethrough' ] ],
							[ 'fontsize', [ 'fontsize' ] ],
							[ 'para', [ 'ul', 'ol', 'paragraph' ] ] ],
					placeholder : 'Write here ....',
					tabsize : 2,
					height : 200
				});
	</script>
</body>

</html>