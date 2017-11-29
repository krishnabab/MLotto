app.controller('usersController', function($scope) {
    $scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope) {
    $scope.headingTitle = "Roles List";
});

app.controller('ticketController', function($scope,$http) {
    $scope.headingTitle = "Ticket List";
    $http.get('http://localhost:9080/service/getticket').then(function(response) {
    	console.log("dddddd");
    	console.log(response.data)
        $scope.ticket = response.data;
    	console.log($scope.ticket)
    });
});