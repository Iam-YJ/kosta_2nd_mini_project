<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 찐 메인 -->
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description"
	content="Foogra - Discover & Book the best restaurants at the best price">
<meta name="author" content="Ansonika">
<title>Foogra - Discover & Book the best restaurants at the best
	price</title>

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

<!-- GOOGLE WEB FONT -->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700&display=swap"
	rel="stylesheet">

<!-- BASE CSS -->
<link
	href="${pageContext.request.contextPath}/html/css/bootstrap_customized.min.css"
	rel="stylesheet">
<!-- ${pageContext.request.contextPath} -->
<link href="${pageContext.request.contextPath}/html/css/style.css"
	rel="stylesheet">

<!-- SPECIFIC CSS -->
	rel="stylesheet">

<!-- YOUR CUSTOM CSS -->
<link href="${pageContext.request.contextPath}/html/css/custom.css"
	rel="stylesheet">

</head>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>


<body>

	<header class="header clearfix element_to_stick">
		<div class="container">
			<div id="logo">
				<a href="index.jsp"> <img src="img/logo.svg" width="140"
					height="35" alt="" class="logo_normal"> <img
					src="img/logo_sticky.svg" width="140" height="35" alt=""
					class="logo_sticky">
				</a>
			</div>
			<ul id="top_menu">
				<li><a href="#sign-in-dialog" id="sign-in" class="login">Sign
						In</a></li>
				<li><a href="../dispatcher?key=user&methodName=seleteBookMark&user_no=1" class="wishlist_bt_top"
					title="Your wishlist">Your wishlist</a></li>
			</ul>
			<!-- /top_menu -->
			<a href="#0" class="open_close"> <i class="icon_menu"></i><span>Menu</span>
			</a>
			<nav class="main-menu">
				<div id="header_menu">
					<a href="#0" class="open_close"> <i class="icon_close"></i><span>Menu</span>
					</a> <a href="index.jsp"><img src="img/logo.svg" width="140"
						height="35" alt=""></a>
				</div>
				<ul>
					<li class="submenu"><a href="#0" class="show-submenu">Home</a>
						<ul>
							<li><a href="index.jsp">Default</a></li>
							<li><a href="index-2.jsp">Video Background</a></li>
							<li><a href="index-3.jsp">Slider</a></li>
							<li><a href="index-5.jsp">Address Autocomplete</a></li>
							<li><a href="index-6.jsp">Search Version 2</a></li>
							<li><a href="index-7.jsp">Delivery/Takeaway version</a></li>
							<li><a href="modal-advertise.jsp">Modal Advertise</a></li>
							<li><a href="modal-newsletter.jsp">Modal Newsletter</a></li>
							<li><a href="index-4.jsp">GDPR Cookie Bar EU Law</a></li>
						</ul></li>
					<li class="submenu"><a href="#0" class="show-submenu">Listing</a>
						<ul>
							<li class="third-level"><a href="#0">List pages</a>
								<ul>
									<li><a href="grid-listing-filterscol.jsp">List
											default</a></li>
									<li><a href="../dispatcher?key=melon&methodName=selectAll">List
											with map</a></li>
									<li><a href="listing-map.jsp">List side map</a></li>
									<li><a href="grid-listing-filterscol-full-width.jsp">List
											full width</a></li>
									<li><a href="grid-listing-filterscol-full-masonry.jsp">List
											Masonry Filter</a></li>
									<li><a href="grid-listing-filterscol-delivery.jsp">List
											Delivery/Takeaway</a></li>
								</ul></li>
							<li class="third-level"><a href="#0">Detail pages</a> 
								<ul>
									<li><a href="detail-restaurant.jsp">Detail page 1</a></li>
									<li><a href="detail-restaurant-2.jsp">Detail page 2</a></li>
									<li><a href="detail-restaurant-3.jsp">Mobile Fixed
											Booking</a></li>
									<li><a href="detail-restaurant-delivery.jsp">Delivery/Takeaway</a></li>
									<li><a href="detail-restaurant-4.jsp">Detail Menu
											Thumbs</a></li>
									<li><a href="detail-restaurant-5.jsp">Detail Contact
											Form</a></li>
									<li><a href="detail-restaurant-6.jsp">Detail
											Instagram Feed</a></li>
								</ul></li>
							<li class="third-level"><a href="#0">OpenStreetMap</a>
								<ul>
									<li><a
										href="grid-listing-filterscol-map-openstreetmap.jsp">List
											with map</a></li>
									<li><a href="listing-map-openstreetmap.jsp">List side
											map</a></li>
									<li><a
										href="grid-listing-filterscol-full-width-openstreetmap.jsp">List
											full width</a></li>
									<li><a
										href="grid-listing-filterscol-full-masonry-openstreetmap.jsp">List
											Masonry Filter</a></li>
								</ul></li>
							<li><a href="submit-restaurant.jsp">Submit Restaurant</a></li>
							<li><a href="submit-rider.jsp">Submit Rider</a></li>
							<li><a href="../dispatcher?key=user&methodName=seleteBookMark&user_no=1">Wishlist</a></li>
							<li><a href="booking.jsp">Booking</a></li>
							<li><a href="confirm.jsp">Confirm Booking</a></li>
							<li><a href="confirm-delivery.jsp">Confirm Order</a></li>
							<li><a href="booking-delivery-2.jsp">Order
									Delivery/Takeaway</a></li>
							<li><a href="booking-delivery.jsp">Order
									Delivery/Takeaway 2</a></li>
							<li><a href="admin_section/index.jsp" target="_blank">Admin
									Section</a></li>
						</ul></li>
					<li class="submenu"><a href="#0" class="show-submenu">Other
							Pages</a>
						<ul>
							<li><a href="404.jsp">404 Error</a></li>
							<li><a href="help.jsp">Help and Faq</a></li>
							<li><a href="blog.jsp">Blog</a></li>
							<li><a href="leave-review.jsp">Leave a review</a></li>
							<li><a href="user-logged-1.jsp">User Logged 1</a></li>
							<li><a href="user-logged-2.jsp">User Logged 2</a></li>
							<li><a href="contacts.jsp">Contacts</a></li>
							<li><a href="coming_soon/index.jsp">Coming Soon</a></li>
							<li><a href="account.jsp">Sign Up</a></li>
							<li><a href="icon-pack-1.jsp">Icon Pack 1</a></li>
							<li><a href="icon-pack-2.jsp">Icon Pack 2</a></li>
						</ul></li>
					<li><a href="submit-restaurant.jsp">Submit</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<!-- /header -->

	<main>
		<div class="hero_single version_2">
			<div class="opacity-mask" data-opacity-mask="rgba(0, 0, 0, 0.6)">
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-xl-9 col-lg-10 col-md-8">
							<h1>Discover &amp; Book</h1>
							<p>The best restaurants at the best price</p>
							<form method="post"
								action="../dispatcher?key=melon&methodName=selectByResName">
								<div class="row no-gutters custom-search-input">
									<div class="col-lg-8">
										<div class="form-group">
											<input name ="resName" class="form-control" type="text"
												placeholder="식당명을 입력해주세요..."> <i
												class="icon_search"></i>
										</div>
									</div>
									<div class="col-lg-4">
										<input type="submit" value="Search">
									</div>
								</div>
								<!-- /row -->
							</form>
						</div>
					</div>
					<!-- /row -->
				</div>
			</div>
		</div>
		<!-- /hero_single -->

		<div class="bg_gray">
			<div class="container margin_60_40">
				<div class="main_title center">
					<span><em></em></span>
					<h2>Popular Categories</h2>
					<p>Cum doctus civibus efficiantur in imperdiet deterruisset</p>
				</div>
				<!-- /main_title -->
				<div class="owl-carousel owl-theme categories_carousel">
					<div class="item">
						<a href="#0"> <span>98</span> <i class="icon-food_icon_pizza"></i>
							<h3>Pizza - Italian</h3> <small>Avg price $40</small>
						</a>
					</div>
					<div class="item">
						<a href="#0"> <span>87</span> <i class="icon-food_icon_sushi"></i>
							<h3>Japanese - Sushi</h3> <small>Avg price $50</small>
						</a>
					</div>
					<div class="item">
						<a href="#0"> <span>96</span> <i
							class="icon-food_icon_burgher"></i>
							<h3>Burghers</h3> <small>Avg price $55</small>
						</a>
					</div>
					<div class="item">
						<a href="#0"> <span>78</span> <i
							class="icon-food_icon_vegetarian"></i>
							<h3>Vegetarian</h3> <small>Avg price $40</small>
						</a>
					</div>
					<div class="item">
						<a href="#0"> <span>65</span> <i class="icon-food_icon_cake_2"></i>
							<h3>Bakery</h3> <small>Avg price $60</small>
						</a>
					</div>
					<div class="item">
						<a href="#0"> <span>65</span> <i
							class="icon-food_icon_chinese"></i>
							<h3>Chinese</h3> <small>Avg price $40</small>
						</a>
					</div>
					<div class="item">
						<a href="#0"> <span>65</span> <i
							class="icon-food_icon_burrito"></i>
							<h3>Mexican</h3> <small>Avg price $35</small>
						</a>
					</div>
				</div>
				<!-- /carousel -->
			</div>
			<!-- /container -->
		</div>
		<!-- /bg_gray -->

		<div class="container margin_60_40">
			<div class="main_title">
				<span><em></em></span>
				<h2>Popular Restaurants</h2>
				<p>Cum doctus civibus efficiantur in imperdiet deterruisset.</p>
				<a href="#0">View All</a>
			</div>

			<div class="owl-carousel owl-theme carousel_4">
				<div class="item">
					<div class="strip">
						<figure>
							<span class="ribbon off">-30%</span>
							<img src="img/lazy-placeholder.png" data-src="img/location_1.jpg"
								class="owl-lazy" alt="">
							<a href="detail-restaurant.jsp" class="strip_info"> <small>Pizza</small>
								<div class="item_title">
									<h3>Da Alfredo</h3>
									<small>27 Old Gloucester St</small>
								</div>
							</a>
						</figure>
						<ul>
							<li><span class="loc_open">Now Open</span></li>
							<li>
								<div class="score">
									<span>Superb<em>350 Reviews</em></span><strong>8.9</strong>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="item">
					<div class="strip">
						<figure>
							<span class="ribbon off">-40%</span>
							<img src="img/lazy-placeholder.png" data-src="img/location_2.jpg"
								class="owl-lazy" alt="">
							<a href="detail-restaurant.jsp" class="strip_info"> <small>Burghers</small>
								<div class="item_title">
									<h3>Best Burghers</h3>
									<small>27 Old Gloucester St</small>
								</div>
							</a>
						</figure>
						<ul>
							<li><span class="loc_open">Now Open</span></li>
							<li>
								<div class="score">
									<span>Superb<em>350 Reviews</em></span><strong>9.5</strong>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="item">
					<div class="strip">
						<figure>
							<span class="ribbon off">-30%</span>
							<img src="img/lazy-placeholder.png" data-src="img/location_3.jpg"
								class="owl-lazy" alt="">
							<a href="detail-restaurant.jsp" class="strip_info"> <small>Vegetarian</small>
								<div class="item_title">
									<h3>Vego Life</h3>
									<small>27 Old Gloucester St</small>
								</div>
							</a>
						</figure>
						<ul>
							<li><span class="loc_open">Now Open</span></li>
							<li>
								<div class="score">
									<span>Superb<em>350 Reviews</em></span><strong>7.5</strong>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="item">
					<div class="strip">
						<figure>
							<span class="ribbon off">-25%</span>
							<img src="img/lazy-placeholder.png" data-src="img/location_4.jpg"
								class="owl-lazy" alt="">
							<a href="detail-restaurant.jsp" class="strip_info"> <small>Japanese</small>
								<div class="item_title">
									<h3>Sushi Temple</h3>
									<small>27 Old Gloucester St</small>
								</div>
							</a>
						</figure>
						<ul>
							<li><span class="loc_open">Now Open</span></li>
							<li>
								<div class="score">
									<span>Superb<em>350 Reviews</em></span><strong>9.5</strong>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="item">
					<div class="strip">
						<figure>
							<span class="ribbon off">-30%</span>
							<img src="img/lazy-placeholder.png" data-src="img/location_5.jpg"
								class="owl-lazy" alt="">
							<a href="detail-restaurant.jsp" class="strip_info"> <small>Pizza</small>
								<div class="item_title">
									<h3>Auto Pizza</h3>
									<small>27 Old Gloucester St</small>
								</div>
							</a>
						</figure>
						<ul>
							<li><span class="loc_open">Now Open</span></li>
							<li>
								<div class="score">
									<span>Superb<em>350 Reviews</em></span><strong>7.0</strong>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="item">
					<div class="strip">
						<figure>
							<span class="ribbon off">-15%</span>
							<img src="img/lazy-placeholder.png" data-src="img/location_6.jpg"
								class="owl-lazy" alt="">
							<a href="detail-restaurant.jsp" class="strip_info"> <small>Burghers</small>
								<div class="item_title">
									<h3>Alliance</h3>
									<small>27 Old Gloucester St</small>
								</div>
							</a>
						</figure>
						<ul>
							<li><span class="loc_open">Now Open</span></li>
							<li>
								<div class="score">
									<span>Superb<em>350 Reviews</em></span><strong>8.9</strong>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="item">
					<div class="strip">
						<figure>
							<span class="ribbon off">-30%</span>
							<img src="img/lazy-placeholder.png" data-src="img/location_7.jpg"
								class="owl-lazy" alt="">
							<a href="detail-restaurant.jsp" class="strip_info"> <small>Chinese</small>
								<div class="item_title">
									<h3>Alliance</h3>
									<small>27 Old Gloucester St</small>
								</div>
							</a>
						</figure>
						<ul>
							<li><span class="loc_closed">Now Closed</span></li>
							<li>
								<div class="score">
									<span>Superb<em>350 Reviews</em></span><strong>8.9</strong>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!-- /carousel -->

			<div class="banner lazy" data-bg="url(img/banner_bg_desktop.jpg)">
				<div class="wrapper d-flex align-items-center opacity-mask"
					data-opacity-mask="rgba(0, 0, 0, 0.2)">
					<div>
						<small>foogra</small>
						<h3>More than 3000 Restaurants</h3>
						<p>Book a table easly at the best price</p>
						<a href="grid-listing-filterscol.jsp" class="btn_1">View All</a>
					</div>
				</div>
				<!-- /wrapper -->
			</div>
			<!-- /banner -->

			<div class="row">
				<div class="col-12">
					<div class="main_title version_2">
						<span><em></em></span>
						<h2>Our Very Best Deals</h2>
						<p>Cum doctus civibus efficiantur in imperdiet deterruisset.</p>
						<a href="#0">View All</a>
					</div>
				</div>
				<div class="col-md-6">
					<div class="list_home">
						<ul>
							<li><a href="detail-restaurant.jsp">
									<figure>
										<img src="img/location_list_placeholder.png"
											data-src="img/location_list_1.jpg" alt="" class="lazy">
									</figure>
									<div class="score">
										<strong>9.5</strong>
									</div> <em>Italian</em>
									<h3>La Monnalisa</h3> <small>8 Patriot Square E2 9NF</small>
									<ul>
										<li><span class="ribbon off">-30%</span></li>
										<li>Average price $35</li>
									</ul>
							</a></li>
							<li><a href="detail-restaurant.jsp">
									<figure>
										<img src="img/location_list_placeholder.png"
											data-src="img/location_list_2.jpg" alt="" class="lazy">
									</figure>
									<div class="score">
										<strong>8.0</strong>
									</div> <em>Mexican</em>
									<h3>Alliance</h3> <small>27 Old Gloucester St, 4563</small>
									<ul>
										<li><span class="ribbon off">-40%</span></li>
										<li>Average price $30</li>
									</ul>
							</a></li>
							<li><a href="detail-restaurant.jsp">
									<figure>
										<img src="img/location_list_placeholder.png"
											data-src="img/location_list_3.jpg" alt="" class="lazy">
									</figure>
									<div class="score">
										<strong>9.0</strong>
									</div> <em>Sushi - Japanese</em>
									<h3>Sushi Gold</h3> <small>Old Shire Ln EN9 3RX</small>
									<ul>
										<li><span class="ribbon off">-25%</span></li>
										<li>Average price $20</li>
									</ul>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-6">
					<div class="list_home">
						<ul>
							<li><a href="detail-restaurant.jsp">
									<figure>
										<img src="img/location_list_placeholder.png"
											data-src="img/location_list_4.jpg" alt="" class="lazy">
									</figure>
									<div class="score">
										<strong>9.5</strong>
									</div> <em>Vegetarian</em>
									<h3>Mr. Pepper</h3> <small>27 Old Gloucester St, 4563</small>
									<ul>
										<li><span class="ribbon off">-30%</span></li>
										<li>Average price $20</li>
									</ul>
							</a></li>
							<li><a href="detail-restaurant.jsp">
									<figure>
										<img src="img/location_list_placeholder.png"
											data-src="img/location_list_5.jpg" alt="" class="lazy">
									</figure>
									<div class="score">
										<strong>8.0</strong>
									</div> <em>Chinese</em>
									<h3>Dragon Tower</h3> <small>22 Hertsmere Rd E14 4ED</small>
									<ul>
										<li><span class="ribbon off">-50%</span></li>
										<li>Average price $35</li>
									</ul>
							</a></li>
							<li><a href="detail-restaurant.jsp">
									<figure>
										<img src="img/location_list_placeholder.png"
											data-src="img/location_list_6.jpg" alt="" class="lazy">
									</figure>
									<div class="score">
										<strong>8.5</strong>
									</div> <em>Pizza - Italian</em>
									<h3>Bella Napoli</h3> <small>135 Newtownards Road BT4</small>
									<ul>
										<li><span class="ribbon off">-45%</span></li>
										<li>Average price $25</li>
									</ul>
							</a></li>
						</ul>
					</div>
				</div>
			</div>
			<!-- /row -->
			<p class="text-center d-block d-md-block d-lg-none">
				<a href="grid-listing-filterscol.jsp" class="btn_1">View All</a>
			</p>
			<!-- /button visibile on tablet/mobile only -->
		</div>
		<!-- /container -->

		<div class="call_section lazy" data-bg="url(img/bg_call_section.jpg)">
			<div class="container clearfix">
				<div class="col-lg-5 col-md-6 float-right wow">
					<div class="box_1">
						<h3>Are you a Restaurant Owner?</h3>
						<p>Join Us to increase your online visibility. You'll have
							access to even more customers who are looking to enjoy your tasty
							dishes at home.</p>
						<a href="submit-restaurant.jsp" class="btn_1">Read more</a>
					</div>
				</div>
			</div>
		</div>
		<!--/call_section-->

	</main>
	<!-- /main -->

	<footer>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<h3 data-target="#collapse_1">Quick Links</h3>
					<div class="collapse dont-collapse-sm links" id="collapse_1">
						<ul>
							<li><a href="about.jsp">About us</a></li>
							<li><a href="submit-restaurant.jsp">Add your restaurant</a></li>
							<li><a href="help.jsp">Help</a></li>
							<li><a href="account.jsp">My account</a></li>
							<li><a href="blog.jsp">Blog</a></li>
							<li><a href="contacts.jsp">Contacts</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<h3 data-target="#collapse_2">Categories</h3>
					<div class="collapse dont-collapse-sm links" id="collapse_2">
						<ul>
							<li><a href="grid-listing-filterscol.jsp">Top
									Categories</a></li>
							<li><a href="grid-listing-filterscol-full-masonry.jsp">Best
									Rated</a></li>
							<li><a href="grid-listing-filterscol-full-width.jsp">Best
									Price</a></li>
							<li><a href="grid-listing-filterscol-full-masonry.jsp">Latest
									Submissions</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<h3 data-target="#collapse_3">Contacts</h3>
					<div class="collapse dont-collapse-sm contacts" id="collapse_3">
						<ul>
							<li><i class="icon_house_alt"></i>97845 Baker st. 567<br>Los
								Angeles - US</li>
							<li><i class="icon_mobile"></i>+94 423-23-221</li>
							<li><i class="icon_mail_alt"></i><a href="#0">info@domain.com</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<h3 data-target="#collapse_4">Keep in touch</h3>
					<div class="collapse dont-collapse-sm" id="collapse_4">
						<div id="newsletter">
							<div id="message-newsletter"></div>
							<form method="post" action="assets/newsletter.php"
								name="newsletter_form" id="newsletter_form">
								<div class="form-group">
									<input type="email" name="email_newsletter"
										id="email_newsletter" class="form-control"
										placeholder="Your email">
									<button type="submit" id="submit-newsletter">
										<i class="arrow_carrot-right"></i>
									</button>
								</div>
							</form>
						</div>
						<div class="follow_us">
							<h5>Follow Us</h5>
							<ul>
								<li><a href="#0"><img
										src="data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw=="
										data-src="img/twitter_icon.svg" alt="" class="lazy"></a></li>
								<li><a href="#0"><img
										src="data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw=="
										data-src="img/facebook_icon.svg" alt="" class="lazy"></a></li>
								<li><a href="#0"><img
										src="data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw=="
										data-src="img/instagram_icon.svg" alt="" class="lazy"></a></li>
								<li><a href="#0"><img
										src="data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw=="
										data-src="img/youtube_icon.svg" alt="" class="lazy"></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<!-- /row-->
			<hr>
			<div class="row add_bottom_25">
				<div class="col-lg-6">
					<ul class="footer-selector clearfix">
						<li>
							<div class="styled-select lang-selector">
								<select>
									<option value="English" selected>English</option>
									<option value="French">French</option>
									<option value="Spanish">Spanish</option>
									<option value="Russian">Russian</option>
								</select>
							</div>
						</li>
						<li>
							<div class="styled-select currency-selector">
								<select>
									<option value="US Dollars" selected>US Dollars</option>
									<option value="Euro">Euro</option>
								</select>
							</div>
						</li>
						<li><img
							src="data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw=="
							data-src="img/cards_all.svg" alt="" width="198" height="30"
							class="lazy"></li>
					</ul>
				</div>
				<div class="col-lg-6">
					<ul class="additional_links">
						<li><a href="#0">Terms and conditions</a></li>
						<li><a href="#0">Privacy</a></li>
						<li><span>© Foogra</span></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>
	<!--/footer-->

	<div id="toTop"></div>
	<!-- Back to top button -->

	<div class="layer"></div>
	<!-- Opacity Mask Menu Mobile -->

	<!-- Sign In Modal -->
	<div id="sign-in-dialog" class="zoom-anim-dialog mfp-hide">
		<div class="modal_header">
			<h3>Sign In</h3>
		</div>
		<form>
			<div class="sign-in-wrapper">
				<a href="#" class="social_bt kakao" id="kakao-login-btn" onclick=createLoginButton>Login
					with Kakao</a>
				<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
				<a id="kakao-login-btn"></a> <a
					href="http://developers.kakao.com/logout"></a>
				<script type='text/javascript'>
					Kakao.init('3f23f0f66acf48aad61c4ec6681b0615'); //아까 카카오개발자홈페이지에서 발급받은 자바스크립트 키를 입력함

					//카카오 로그인 버튼을 생성합니다. 

					Kakao.Auth.createLoginButton({
						container : '#kakao-login-btn',
						success : function(authObj) {
							Kakao.API.request({

								url : '/v2/user/me',

								success : function(res) {

									console.log(res);

									//console.log(authObj.access_token);//<---- 콘솔 로그에 토큰값 출력

									var userNo = res.id;
									var userNick = res.properties.nickname;
									var userAge = res.kakao_account.age_range;
									var userEmail = res.kakao_account.email;
									var userGender = res.kakao_account.gender;
									
							/* 		console.log(userNo)
									console.log(userNick)
									console.log(userAge)
									console.log(userEmail)
									console.log(userGender) */
									
									window.location.replace("${pageContext.request.contextPath}/dispatcher?key=user&methodName=join&userNo="+userNo+"&userNick="+userNick+"&userAge="+userAge+"&userEmail="+userEmail+"&userGender="+userGender);
									
									//../dispatcher?key=user&methodName=join
									
									//window.location.replace("http://" + window.location.hostname + ( (location.port==""||location.port==undefined)?"":":" + location.port) + "/hansub_project/home?kakaonickname="+kakaonickname+"kakaotalk"+"&kakaoe_mail="+kakaoe_mail);

								}
							})
						},
						fail : function(error) {
							alert(JSON.stringify(error));
						}
					});
				</script>


				<div class="clearfix add_bottom_0">

					<!-- 	<div class="float-right mt-1"><a id="forgot" href="javascript:void(0);">Are you a Non-user?</a></div> -->
				</div>
				<div class="text-center">
					<input type="button" value="Are you a Non-user?"
						class="btn_1 full-width mb_1"> <br>

				</div>
				<div class="text-center">
					<input type="button" value="Are you a Manager?"
						class="btn_1 full-width mb_1" onclick="gopage()">
					<script type="text/javascript">
						function gopage() {
							var adminId = prompt("ID를 입력하세요");
							var adminPwd = prompt("Password를 입력하세요");

							/* if (adminId == "admin" && adminPwd == "admin") {
								location.href = "../html/admin_section/adminIndex.jsp" */
							if (adminId == "admin" && adminPwd == "admin"){
								location.href = "../html/admin_section/add-listing-with-menu-list.html"

							} else {
								alert("관리자 이용 가능 메뉴입니다")
							}
							// form에서는 페이지 이동 전에 데이터가 들어있는지 확인이 번거롭다.
							// 데이터를 확인하고 그 데이터를 가지고 링크를 이동하기 위해서는 
							// 자바스크립트에서 데이터 확인을 거치고 직접 보내주는 것이 좋다


					</script>
					Don’t have an account? <a
						href="https://accounts.kakao.com/weblogin/create_account?continue=https://accounts.kakao.com">Sign
						up</a>
				</div>
				<div id="forgot_pw">
					<div class="form-group">
						<label>Please confirm login email below</label> <input
							type="email" class="form-control" name="email_forgot"
							id="email_forgot"> <i class="icon_mail_alt"></i>
					</div>
					<p>You will receive an email containing a link allowing you to
						reset your password to a new preferred one.</p>
					<div class="text-center">
						<input type="submit" value="Reset Password" class="btn_1">
					</div>
				</div>
			</div>
		</form>
		<!--form -->
	</div>
	<!-- /Sign In Modal -->

	<!-- COMMON SCRIPTS -->
	<script src="js/common_scripts.min.js"></script>
	<script src="js/common_func.js"></script>
	<script src="assets/validate.js"></script>

</body>
</html>