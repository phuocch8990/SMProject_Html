$(document).ready(function(){
	$.ajax({
		type: 'GET',
		url: '/overviewPhone',
		async : true,
		cache : false,
		dataType : "json",
		data : {
//			controller : 'authentication',
//			SubmitLogin : 1,
//			ajax : true
		// token: token
		},
		success : function(jsonData) {
			$.each(jsonData, function(i, item) {
			    $('#homefeatured').append('<li class=" ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-tablet-line first-item-of-mobile-line"></li>');
			    $('.ajax_block_product').append('<div class="product-container" itemscope itemtype="https://schema.org/Product"></div>');
			});
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {

		}
	});
});