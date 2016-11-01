var listComic = angular.module('listComic',[])

.component('listacomic', {
    templateUrl: "app/components/listComics/view.html",
    controller: ['$http', function Controller($http) {
        var self = this;
        self.refresh = function() {
            $http({ 
            method: 'GET',
            url: '/comics'
        }).then(
            function Success(response) {
   
                 console.log(response.data);
                 self.comics = response.data;

            })
        }
        self.refresh();
    }],
    controllerAs: 'listacomic'
})