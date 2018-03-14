$(document).ready(function() {
    if (localStorage.getItem("email") != null || localStorage.getItem("email2") != null) {
    	console.log(localStorage.getItem("email2"));
        console.log(localStorage.getItem("email"));
        $("#header-login .header_user_info.current > a").html(
            '<span>' + 'YOUR ACCOUNT' + '</span>');
        $("#header-login-content li").html(
            '<ul></ul><p class="logout"></p>');
        $("#header-login-content li ul")
            .html(
                '<li><a href="https://ld-prestashop.template-help.com/prestashop_60010/index.php?controller=history" title="My orders" rel="nofollow">My orders</a></li>' +
                '<li><a href="https://ld-prestashop.template-help.com/prestashop_60010/index.php?controller=order-follow" title="My returns" rel="nofollow">My merchandise returns</a></li>' +
                '<li><a href="https://ld-prestashop.template-help.com/prestashop_60010/index.php?controller=order-slip" title="My credit slips" rel="nofollow">My credit slips</a></li>' +
                '<li><a href="https://ld-prestashop.template-help.com/prestashop_60010/index.php?controller=addresses" title="My addresses" rel="nofollow">My addresses</a></li>' +
                '<li><a href="https://ld-prestashop.template-help.com/prestashop_60010/index.php?controller=identity" title="Manage my personal information" rel="nofollow">My personal info</a></li>' +
                '<li><a href="https://ld-prestashop.template-help.com/prestashop_60010/index.php?fc=module&amp;module=tmsociallogin&amp;controller=facebooklink&amp;id_lang=1" title="Facebook Login Manager"><i class="fa fa-facebook"></i><span>Connect Whith Facebook</span></a></li>' +
                '<li><a href="https://ld-prestashop.template-help.com/prestashop_60010/index.php?fc=module&amp;module=tmsociallogin&amp;controller=googlelogin&amp;id_lang=1" title="Google Login Manager"><i class="fa fa-google"></i><span>Connect Whith Google</span></a></li>' +
                '<li class="lnk_wishlist"><a href="https://ld-prestashop.template-help.com/prestashop_60010/index.php?fc=module&amp;module=blockwishlist&amp;controller=mywishlist&amp;id_lang=1" title="My wishlists"><i class="fa fa-heart"></i><span>My wishlists</span></a></li>');
        if(localStorage.getItem("email") != null){
        	$("#header-login-content li .logout")
            .html(
                '<a class="pull-right btn btn-default btn-sm" href="" title="Sign out" rel="nofollow"><span>' +
                '<i class="fa fa-unlock left"></i>Sign out</span></a>');
        }else{
        	$("#header-login-content li .logout")
            .html(
                '<a class="pull-right btn btn-default btn-sm" href="#" title="Sign out" rel="nofollow"><span>' +
                '<i class="fa fa-unlock left"></i>Sign out</span></a>');
        }

    }


});

function signOut() {
	document.location.href = "https://www.google.com/accounts/Logout?continue=https://appengine.google.com/_ah/logout?continue=http://localhost:8080";
	localStorage.removeItem("email2");
};

$(document).ready(function() {
    $('#HeaderSubmitLogin').on('click', function(e) {
        e.preventDefault();
        submitLoginFunction();
        document.location.reload();
    });
    $('.logout').on('click', function(e) {
        localStorage.removeItem("email");
        if (localStorage.getItem('email2') != null) {
            signOut();
            alert("test2");
        }
    });
    $(document).keypress(function(e) {
        if (e.which == 13) {
            e.preventDefault();
            submitLoginFunction();
        }
    });
});

function submitLoginFunction() {
    $
        .ajax({
            type: 'GET',
            url: baseUri,
            async: true,
            cache: false,
            dataType: "json",
            data: {
                controller: 'authentication',
                SubmitLogin: 1,
                ajax: true
                // token: token
            },
            success: function(jsonData) {
                var email = $('#header-email').val();
                var passwd = $('#header-passwd').val();
                for (var i = 0; i < jsonData.length - 1; i++) {
                    if (email == jsonData[i].email &&
                        passwd == jsonData[i].password) {
                        localStorage.setItem("email", jsonData[i].username);
                        console.log(jsonData[i].username);
                    } else {
                        var errors = 'Authentication failed.';
                        for (error in jsonData.errors)
                            if (error != 'indexOf')
                                errors += '<li>' + jsonData.errors[error] +
                                '</li>';
                        $('#create_header_account_error').html(
                            '<ol>' + errors + '</ol>').slideDown();
                    }
                }
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) {
                error = "TECHNICAL ERROR: unable to load form.\n\nDetails:\nError thrown: " +
                    XMLHttpRequest +
                    "\n" +
                    'Text status: ' +
                    textStatus;
                if (!!$.prototype.fancybox) {
                    $.fancybox.open([{
                        type: 'inline',
                        autoScale: true,
                        minHeight: 30,
                        content: "<p class='fancybox-error'>" + error +
                            '</p>'
                    }], {
                        padding: 0
                    });
                } else
                    alert(error);
            }
        });
}