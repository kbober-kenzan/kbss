'use strict';

/**
 * @ngdoc function
 * @name uiApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the uiApp
 */
angular.module('uiApp').controller('MainCtrl', function ($scope) {
	
	// $scope.todos = [{'id':'1', 'name':'Item 1'}, {'id':'2', 'name':'Item 2'}, {'id':'2', 'name':'Item 3'}];

	$scope.todos = ['Item 1','Item 2','Item 3'];
	
	$scope.addTodo = function () {
		
		if ($scope.todo == null || $scope.todo == "") {
	        alert("Todo can not contain an empty string.");
	        return false;
	    }
		
		$scope.todos.push($scope.todo);
		$scope.todo = '';
	};
	
	$scope.removeTodo = function (index) {
		$scope.todos.splice(index, 1);
	};
});
