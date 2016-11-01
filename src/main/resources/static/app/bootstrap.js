var friktonia = angular.module('friktonia',['ngRoute','home','admin'])

.config(function($routeProvider) {
    $routeProvider.when("/", {
        template: '<home></home>'
    }).when("/admin", {
              template: '<admin></admin>'
          })

})
