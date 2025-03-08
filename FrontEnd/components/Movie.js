import './movie.css'

function Movie(props){

    return(

        <div className="card">
            <img src={props.image}/>

            <div className="card-body">
                <center>

                <h4>{props.title}</h4>

                <p>{props.zoner}</p>

                </center>
            </div>
        



    </div>);
}

export default Movie;