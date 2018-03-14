function onSignIn(googleUser) {
	if (localStorage.getItem('id') != null) {
		return;
	}
	var profile = googleUser.getBasicProfile();
	localStorage.setItem('id', profile.getId());
	localStorage.setItem('name', profile.getName());
	localStorage.setItem('image', profile.getImageUrl());
	localStorage.setItem('email2', profile.getEmail());
	console.log(profile);
	window.location.reload();
//	window.location.href = "http://localhost:8080";
};
//function renderButton() {
//    gapi.signin2.render('my-signin2', {
//      'scope': 'profile email',
//      'width': 240,
//      'height': 50,
//      'longtitle': true,
//      'theme': 'dark',
//      'onsuccess': onSignIn,
//      'onfailure': signOut
//    });
//  }