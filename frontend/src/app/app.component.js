
fetch('/movies').then(resp => resp.json()).then(movies => {
    document.querySelector('#planet').innerHTML = listPlanets(planets);
});

let listPlanet = function(planet){
    return '<p>' + planet.planetID + ": " + planet.name + ": " + planet.mass + ": " + planet.moon + ": " + planet.distance + '</p>';
};

function listPlanets(json){
    //return `${json.map(listPlanet).join('\n')}`
    return `${json.map(listPlanet).join('\n')}`
};

function postMovies(){
    let planet = {
        "movie_id": document.getElementById("movie_id").value,
        "movie_title": document.getElementById("movie_title").value,
        "movie_time": document.getElementById("movie_time").value,
        "movie_ratings": document.getElementById("movie_ratings").value,
        "movie_year": document.getElementById("movie_year").value
    }
    //console.log(planet);
    fetch("/movies,{
        method: "POST",
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(planet)
    }).then((result) => {
        if(result.status != 200){
            throw new Error("Bad Server Response")
        }
        console.log(result.text());
    }).catch((error) => {console.log(error);})
    fetch('/allplanets').then(resp => resp.json()).then(planets => {
        document.querySelector('#planet').innerHTML = listPlanets(planets);
    });
    window.document.location.reload();
};
