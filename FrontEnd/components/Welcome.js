import { Component } from "react";


class Welcome extends Component{

    state={hello:'Everyone'}

    render(){
        return(<div>
<center>
        <h1>Please enter your name:- 
            
            <input type="text"  onChange={e=>{this.setState({hello:e.target.value})}}/></h1><br/><br/>

                <h1>Hello {this.state.hello}</h1>

                
                </center>
        </div>);
    }

}

export default Welcome;