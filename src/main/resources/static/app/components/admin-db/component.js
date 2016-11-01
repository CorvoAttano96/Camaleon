var admin = angular.module('admin',[])

.component('admin',{
templateUrl: "app/components/admin-db/view.html",
controller: ['$scope','$http', function Controller($scope,$http) {
        var self = this;
        self.refresh = function() {
            $http({
            method: 'GET',
            url: '/personalxpub/1'
        }).then(
            function Success(response) {

                 console.log(response.data);
                 self.personalxpub = response.data;


            })

        }
        self.save = function(trabajo) {
            $http({
                method: 'POST',
                url: '/Trabajo',
                data: JSON.stringify(trabajo),
                headers: {'Content-Type': 'application/json'}
            });
        }
        self.remove = function(id) {
            $http({
                method: 'DELETE',
                url: '/comics/'+id
            })
        }

        
        self.refresh();


    }],
    controllerAs: 'admin'

})