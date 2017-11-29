var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/users',{
            templateUrl: '/views/users.html',
            controller: 'usersController'
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'rolesController'
        })
        .when('/ticket',{
            templateUrl: '/views/ticket.html',
            controller: 'ticketController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});

