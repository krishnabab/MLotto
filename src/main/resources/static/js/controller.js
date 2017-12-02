app.controller('usersController', function($scope) {
	$scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope) {
	$scope.headingTitle = "Roles List";
});

app.controller('ticketController', function($scope, $http) {
	$scope.headingTitle = "Ticket List";
	$http.get('http://localhost:9080/service/gettickets/' + $scope.noOfTickets)
			.then(function(response) {
				$scope.tickets = response.data;
			});
});

app.controller('printController', function($scope, $http) {
	$scope.printDiv = function(ticketsArea) {
		 var docHead = document.head.outerHTML;
		  var printContents = document.getElementById(ticketsArea).outerHTML;
		  var winAttr = "location=yes, statusbar=no, menubar=no, titlebar=no, toolbar=no,dependent=no, width=865, height=600, resizable=yes, screenX=200, screenY=200, personalbar=no, scrollbars=yes";

		  var newWin = window.open("", "_blank", winAttr);
		  var writeDoc = newWin.document;
		  writeDoc.open();
		  writeDoc.write('<!doctype html><html>' + docHead + '<body onLoad="window.print()">' + printContents + '</body></html>');
		  writeDoc.close();
		  newWin.focus();
	}
});