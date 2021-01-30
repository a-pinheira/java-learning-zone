//variável
var map;
function initMap() {
    //Constructor creates a new map - onlu center and zoom are required
    map = new google.maps.Map(document.getElementById('map'), {
        //o centro é a latitude e a longitude
        center: {
            lat: 40.7413549, lbg: -73.9980244},
            zoom: 13
    });
    
    var tribe = {
        lat: 40.719526, lng: -74.0089934
    };
    //instancia do objeto google.maps
    var marker = new google.maps.Marker({
        position: tribe,
        map: map,
        //título do mapa
        title: "First Marker! - Primeira construção!"
    });
    // Para criar uma Janela de informações, basta criar uma variável e adcionar conteúdo a ela, como:
    // uma String ou um conjunto pré-definito de elementos
    var infowind = new google.maps.InfoWind ({
        content: 'Do you ever feel like an InfoWindow, floating through the wind,' +
            'ready to start again?'
    });
    //Event Listener
    marker.addListener('click', function(){
        infowind.open(map, marker);
    });
  
}
