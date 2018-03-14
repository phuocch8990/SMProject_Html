$(document).ready(function() {
	var app = angular.module('myApp', []);
	app.controller('customersCtrl', function($scope, $http) {
		$http({
	        method : "GET",
	        url : "/overviewPhone"
	    }).then(function (response) {
	      $scope.myData = response.data;
	      alert(response.data[0].product.nameProduct);
	  });
	});
});
