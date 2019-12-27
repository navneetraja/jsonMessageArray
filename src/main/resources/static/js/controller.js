/*var app = angular.module('app', []);
app.controller('controller', function($scope, $filter) {
  $scope.clickfunction = function(){
    var time = $filter('date')(new Date(),'yyyy-MM-dd HH:mm:ss Z');
    $scope.welcome = "Time = " + time;    
  }
});*/

/*var app = angular.module('app', []);
app.controller('controller', function($scope, $http) {
    $http.get("http://localhost:8080/userinfo/alluser")
    .then(function(response) 
{
	$scope.topics = response.data.records;});
});

*/
var myApp = angular.module('myApp', []);
myApp.controller('myController', function($scope, $http){
    $http.get('/userinfo/alluser')
		.success( function(data,status){
			   $scope.jsondata = data;
    		      setTimeout(function(data,status){
    		           location.reload(); 
    		      }, 5000);    
		}).error(function(data, status) {
		    console.error('Error occurred:', data, status);
		})
		.finally(function() {
			console.log("Task Finished.");
		}
		);
}); 