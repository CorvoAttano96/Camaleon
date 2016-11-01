var home = angular.module('home',[])


.component('home',{
    templateUrl: "app/components/home/view.html",
        controller: ['$http', function Controller($http) {
            var self = this;
            self.refresh1 = function() {
                $http({
                method: 'GET',
                url: '/personalxpub/'+$('#idP').val()
            }).then(
                function Success(response) {

                     console.log(response.data);
                     self.personalxpub = response.data;

                })
            }
                        self.refresh2 = function() {
                            $http({
                            method: 'GET',
                            url: '/artxprov/'+$('#idPub').val()+'/'+$('#idArt').val()
                        }).then(
                            function Success(response) {

                                 console.log(response.data);
                                 self.prov = response.data;

                            })
                        }
                        self.refresh3 = function() {
                                                    $http({
                                                    method: 'GET',
                                                    url: '/recxmonto/'+$('#idFecha').val()+'/'+$('#idMonto').val()
                                                }).then(
                                                    function Success(response) {

                                                         console.log(response.data);
                                                         self.pubs = response.data;

                                                    })
                                                }

        }],
    controllerAs:'home'
})