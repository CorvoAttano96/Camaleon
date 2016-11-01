var previewComic = angular.module('previewComic',[])

.component('previs',{
    templateUrl:"app/components/previewComic/view.html",
        controller:['$http','$route',function Previs($http,$route){
        var self = this;
        self.refresh = function() {
            $http({
            method: 'GET',
            url: '/comics/'+$route.current.params.id
        }).then(
            function Success(response) {

                 console.log(response.data);
                 self.comics = response.data;

            })
        }
        self.refresh();


        }],
    controllerAs:'previs'
})