//variável
var map;
//Marcador em branco para adc o array com a lista de localização
var marker = [];


function initMap() {
    //Constructor creates a new map - onlu center and zoom are required
    map = new google.maps.Map(document.getElementById('map'), {
        //o centro é a latitude e a longitude
        center: {
            lat: 40.7413549, lbg: -73.9980244},
            zoom: 13
    });
    /*
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
<<<<<<< HEAD
    // Para criar uma Janela de informações, basta criar uma variável e adcionar conteúdo a ela, como:
    // uma String ou um conjunto pré-definito de elementos
    var infowind = new google.maps.InfoWind ({
        content: 'Do you ever feel like an InfoWindow, floating through the wind,' +
            'ready to start again?'
    });
    //Event Listener
    marker.addListener('click', function(){
        infowind.open(map, marker);
    }); */

    //Usando marcadores para mais de uma janela de informações
    //Array de objetos com uma lista de títulos
    //Lista de localização, que pode está no navegador ou
    //se for uma qtd maior de dados, numa base de dados e servidor
    var locals = [
        {title: 'Park Ave Penthouse', local: {lat: 40.7713024, lng: -73.9632393}},
        {title: 'Chelsea Loft', local: {lat: 40.7444883, lng: -73.9949465}},
        {title: 'Union Square Open Floor Plan', local: {lat: 40.7347062, lng: -73.9895759}},
        {title: 'East Village Hip Studio', local: {lat: 40.7281777, lng: -73.984377}},
        {title: 'TriBeCa Artsy Bachelor Pad', local: {lat: 40.7195264, lng: -74.0089934}},
        {title: 'Chinatown Homey Space', local: {lat: 40.7180628, lng: -73.9961237}}
    ];

    var largeInfoWindow = new google.maps.largeInfoWindow();
    
    //Loop passando pelos locais que criamos
    for (var i = 0; i< locals.length; i++) {
        //pega a posição do local na array
        var position = locals[i].local;
        var title = locals[i].title;
        //cria um marcador de localização e coloca na array
        var marker = new google.maps.Marker({
            map: map,
            position: position,
            title: title,
            animation: google.maps.Animation.Drop,
            id: i
        });
        //Envia o marcador para nossa matriz de marcadores
        markers.push(marker);
        // Evento onclick para abrir uma janela de informações em cada marcador
        marker.addListener('click', function(){
            populateInfoWindow(this, largeInfoWindow);
        });
        bounds.extend(markers[i], position);
    }
    // 
    map.fitBounds(bounds);
    // Esta função preenche/popula uma janela de informações quando o marcador é clicado na janela de informações 
    // uma janela de informações que abrirá no marcador clicado e preencherá com base na posição 
    function populateInfoWindow(marker, infowindow) {
        if(infowindow != marker) {
            infowindow.marker =marker;
            infowindow.setContent('<div>' + marker.title + '</div>');
            infowindow.open(map, marker);
            // Certifique- se de que a propriedade do marcador esteja
            // desmarcada se a janela de informações estiver fechada
            infowindow.addListener('closeclick', function(){
                infowindow.setMarker(null);

            });
    }
    }
  
}
