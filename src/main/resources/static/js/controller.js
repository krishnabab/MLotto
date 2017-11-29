app.controller('usersController', function($scope) {
    $scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope) {
    $scope.headingTitle = "Roles List";
});

app.controller('ticketController', function($scope,$http) {
    $scope.headingTitle = "Ticket List";
    $http.get('http://localhost:9080/service/getticket').then(function(response) {
        $scope.ticket = response.data;
        $scope.tickets = 4;
    });
});