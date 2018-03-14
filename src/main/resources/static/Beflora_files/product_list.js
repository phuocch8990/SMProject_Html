function listProductIndex() {
	$.ajax({
		type : 'GET',
		url : '/product',
		async : true,
		cache : false,
		dataType : "json",
		data : {
			controller : 'authentication',
			SubmitLogin : 1,
			ajax : true
		// token: token
		},
		success : function(jsonData) {
			for(var i = 0;i< jsonData.length - 1;i++){
				
			}
		}
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			error = "TECHNICAL ERROR: unable to load form.\n\nDetails:\nError thrown: "
				+ XMLHttpRequest
				+ "\n"
				+ 'Text status: '
				+ textStatus;
			if (!!$.prototype.fancybox) {
				$.fancybox.open([ {
					type : 'inline',
					autoScale : true,
					minHeight : 30,
					content : "<p class='fancybox-error'>" + error
							+ '</p>'
				} ], {
					padding : 0
				});
			} else
				alert(error);
		}
	});
}