
fetch('/movies').then(resp => resp.json()).then(movies => {
    document.querySelector('#the_movie').innerHTML = listMovies(movies);
});

let listMovie = function(the_movie){
    return '<p>' + the_movie.movie_id + ": " + the_movie.movie_title + ": " + the_movie.movie_time + ": " + the_movie.movie_ratings + ": " + the_movie.movie_year + '</p>';
};

function listMovies(json){
    //return `${json.map(listPlanet).join('\n')}`
    return `${json.map(listMovie).join('\n')}`
};

function postMovies(){
    let the_movie = {
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
        body: JSON.stringify(the_movie)
    }).then((result) => {
        if(result.status != 200){
            throw new Error("Bad Server Response")
        }
        console.log(result.text());
    }).catch((error) => {console.log(error);})
    fetch('/movies').then(resp => resp.json()).then(movies => {
        document.querySelector('#the_movie').innerHTML = listMovies(movies);
    });
    window.document.location.reload();
};
